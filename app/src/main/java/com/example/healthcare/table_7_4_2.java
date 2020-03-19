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

public class table_7_4_2 extends AppCompatActivity implements GestureDetector.OnGestureListener {
    TextView L7_34, L7_35, L7_36, L7_37, L7_39;
    Spanned Link_7_34, Link_7_35, Link_7_36, Link_7_37, Link_7_39;
    public static final int SWIPE_THRESHOLD = 100;
    public static final int SWIPE_VELOCITY_THRESHOLD = 100;
    private GestureDetector gestureDetector;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_7_4_2);
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
        L7_34 = findViewById(R.id.tableLink_7_34);
        L7_35 = findViewById(R.id.tableLink_7_35);
        L7_36 = findViewById(R.id.tableLink_7_36);
        L7_37 = findViewById(R.id.tableLink_7_37);
        L7_39 = findViewById(R.id.tableLink_7_39);
        Link_7_34 = Html.fromHtml(getString(R.string.Link_7_34));
        Link_7_35 = Html.fromHtml(getString(R.string.Link_7_35));
        Link_7_36 = Html.fromHtml(getString(R.string.Link_7_36));
        Link_7_37 = Html.fromHtml(getString(R.string.Link_7_37));
        Link_7_39 = Html.fromHtml(getString(R.string.Link_7_39));
        L7_34.setText(Link_7_34);
        L7_35.setText(Link_7_35);
        L7_36.setText(Link_7_36);
        L7_37.setText(Link_7_37);
        L7_39.setText(Link_7_39);
        L7_34.setMovementMethod(LinkMovementMethod.getInstance());
        L7_35.setMovementMethod(LinkMovementMethod.getInstance());
        L7_36.setMovementMethod(LinkMovementMethod.getInstance());
        L7_37.setMovementMethod(LinkMovementMethod.getInstance());
        L7_39.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView742);
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
        intent = new Intent(table_7_4_2.this, table_7_4_3_1.class);
        startActivity(intent);
        startActivity(intent);
        this.finish();
    }

    private void onSwipeRight() {
        //Toast.makeText(this, "Swipe Right", Toast.LENGTH_LONG).show();
        Intent intent;
        intent = new Intent(table_7_4_2.this, table_7_4_1.class);
        startActivity(intent);
        this.finish();

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
