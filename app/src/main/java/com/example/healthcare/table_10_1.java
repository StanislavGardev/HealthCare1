package com.example.healthcare;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class table_10_1 extends AppCompatActivity implements GestureDetector.OnGestureListener {
    TextView L10_1, L10_2, L10_3, L10_4;
    Spanned Link_10_1, Link_10_2, Link_10_3, Link_10_4;
    public static final int SWIPE_THRESHOLD = 100;
    public static final int SWIPE_VELOCITY_THRESHOLD = 100;
    private GestureDetector gestureDetector;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_10_1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L10_1 = findViewById(R.id.tableLink_10_1);
        L10_2 = findViewById(R.id.tableLink_10_2);
        L10_3 = findViewById(R.id.tableLink_10_3);
        L10_4 = findViewById(R.id.tableLink_10_4);
        Link_10_1 = Html.fromHtml(getString(R.string.Link_10_1));
        Link_10_2 = Html.fromHtml(getString(R.string.Link_10_2));
        Link_10_3 = Html.fromHtml(getString(R.string.Link_10_3));
        Link_10_4 = Html.fromHtml(getString(R.string.Link_10_4));
        L10_1.setText(Link_10_1);
        L10_2.setText(Link_10_2);
        L10_3.setText(Link_10_3);
        L10_4.setText(Link_10_4);
        L10_1.setMovementMethod(LinkMovementMethod.getInstance());
        L10_2.setMovementMethod(LinkMovementMethod.getInstance());
        L10_3.setMovementMethod(LinkMovementMethod.getInstance());
        L10_4.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView101);
        scrollView.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                v.onTouchEvent(event);
                gestureDetector.onTouchEvent(event);
                return true;
            }
        });

        gestureDetector = new GestureDetector(getApplicationContext(), this);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent downEvent, MotionEvent moveEvent, float velocityX, float velocityY) {
        boolean result = false;
        float diffY = moveEvent.getY() - downEvent.getY();
        float diffX = moveEvent.getX() - downEvent.getX();
        // which was greater?  movement across Y or X?
        if (Math.abs(diffX) > Math.abs(diffY)) {
            // right or left swipe
            if (Math.abs(diffX) > SWIPE_THRESHOLD && Math.abs(velocityX) > SWIPE_VELOCITY_THRESHOLD) {
                if (diffX > 0) {
                    onSwipeRight();
                } else {
                    onSwipeLeft();
                }
                result = true;
            }
        } else {
            // up or down swipe
//            if (Math.abs(diffY) > SWIPE_THRESHOLD && Math.abs(velocityY) > SWIPE_VELOCITY_THRESHOLD) {
//                if (diffY > 0) {
//                    onSwipeBottom();
//                } else {
//                    onSwipeTop();
//                }
//                result = true;
//            }
        }

        return result;
    }

//    private void onSwipeTop() {
//        Toast.makeText(this, "Swipe Top", Toast.LENGTH_LONG).show();
//    }
//
//    private void onSwipeBottom() {
//        Toast.makeText(this, "Swipe Bottom", Toast.LENGTH_LONG).show();
//    }

    private void onSwipeLeft() {
        //Toast.makeText(this, "Swipe Left", Toast.LENGTH_LONG).show();
        Intent intent;
        intent = new Intent(table_10_1.this, table_10_2.class);
        startActivity(intent);
        startActivity(intent);
        this.finish();
    }

    private void onSwipeRight() {
        //Toast.makeText(this, "Swipe Right", Toast.LENGTH_LONG).show();
        Intent intent;
        intent = new Intent(table_10_1.this, table_9_3.class);
        startActivity(intent);
        this.finish();

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
