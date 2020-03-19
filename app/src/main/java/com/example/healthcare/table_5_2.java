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

public class table_5_2 extends AppCompatActivity implements GestureDetector.OnGestureListener {
    TextView L_5_8, L_5_9, L_5_10, L_5_11, L_5_12, L_5_13, L_5_14;
    Spanned Link_5_8, Link_5_9, Link_5_10, Link_5_11, Link_5_12, Link_5_13, Link_5_14;
    public static final int SWIPE_THRESHOLD = 100;
    public static final int SWIPE_VELOCITY_THRESHOLD = 100;
    private GestureDetector gestureDetector;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_5_2);
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
        L_5_8 = findViewById(R.id.tableLink_5_8);
        L_5_9 = findViewById(R.id.tableLink_5_9);
        L_5_10 = findViewById(R.id.tableLink_5_10);
        L_5_11 = findViewById(R.id.tableLink_5_11);
        L_5_12 = findViewById(R.id.tableLink_5_12);
        L_5_13 = findViewById(R.id.tableLink_5_13);
        L_5_14 = findViewById(R.id.tableLink_5_14);
        Link_5_8 = Html.fromHtml(getString(R.string.Link_5_8));
        Link_5_9 = Html.fromHtml(getString(R.string.Link_5_9));
        Link_5_10 = Html.fromHtml(getString(R.string.Link_5_10));
        Link_5_11 = Html.fromHtml(getString(R.string.Link_5_11));
        Link_5_12 = Html.fromHtml(getString(R.string.Link_5_12));
        Link_5_13 = Html.fromHtml(getString(R.string.Link_5_13));
        Link_5_14 = Html.fromHtml(getString(R.string.Link_5_14));
        L_5_8.setText(Link_5_8);
        L_5_9.setText(Link_5_9);
        L_5_10.setText(Link_5_10);
        L_5_11.setText(Link_5_11);
        L_5_12.setText(Link_5_12);
        L_5_13.setText(Link_5_13);
        L_5_14.setText(Link_5_14);
        L_5_8.setMovementMethod(LinkMovementMethod.getInstance());
        L_5_9.setMovementMethod(LinkMovementMethod.getInstance());
        L_5_10.setMovementMethod(LinkMovementMethod.getInstance());
        L_5_11.setMovementMethod(LinkMovementMethod.getInstance());
        L_5_12.setMovementMethod(LinkMovementMethod.getInstance());
        L_5_13.setMovementMethod(LinkMovementMethod.getInstance());
        L_5_14.setMovementMethod(LinkMovementMethod.getInstance());
        scrollView = findViewById(R.id.scrollView52);
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
        intent = new Intent(table_5_2.this, table_5_2_1.class);
        startActivity(intent);
        startActivity(intent);
        this.finish();
    }

    private void onSwipeRight() {
        //Toast.makeText(this, "Swipe Right", Toast.LENGTH_LONG).show();
        Intent intent;
        intent = new Intent(table_5_2.this, table_5_1.class);
        startActivity(intent);
        this.finish();

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
