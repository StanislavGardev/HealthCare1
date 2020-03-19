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

public class table_6_3_1 extends AppCompatActivity implements GestureDetector.OnGestureListener {
    TextView L6_12, L6_13, L6_14, L6_15, L6_17;
    Spanned Link_6_12, Link_6_13, Link_6_14, Link_6_15, Link_6_17;
    public static final int SWIPE_THRESHOLD = 100;
    public static final int SWIPE_VELOCITY_THRESHOLD = 100;
    private GestureDetector gestureDetector;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_6_3_1);
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
        L6_12 = findViewById(R.id.tableLink_6_12);
        L6_13 = findViewById(R.id.tableLink_6_13);
        L6_14 = findViewById(R.id.tableLink_6_14);
        L6_15 = findViewById(R.id.tableLink_6_15);
        L6_17 = findViewById(R.id.tableLink_6_17);
        Link_6_12 = Html.fromHtml(getString(R.string.Link_6_12));
        Link_6_13 = Html.fromHtml(getString(R.string.Link_6_13));
        Link_6_14 = Html.fromHtml(getString(R.string.Link_6_14));
        Link_6_15 = Html.fromHtml(getString(R.string.Link_6_15));
        Link_6_17 = Html.fromHtml(getString(R.string.Link_6_17));
        L6_12.setText(Link_6_12);
        L6_13.setText(Link_6_13);
        L6_14.setText(Link_6_14);
        L6_15.setText(Link_6_15);
        L6_17.setText(Link_6_17);
        L6_12.setMovementMethod(LinkMovementMethod.getInstance());
        L6_13.setMovementMethod(LinkMovementMethod.getInstance());
        L6_14.setMovementMethod(LinkMovementMethod.getInstance());
        L6_15.setMovementMethod(LinkMovementMethod.getInstance());
        L6_17.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView631);
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
        intent = new Intent(table_6_3_1.this, table_6_3_2.class);
        startActivity(intent);
        startActivity(intent);
        this.finish();
    }

    private void onSwipeRight() {
        //Toast.makeText(this, "Swipe Right", Toast.LENGTH_LONG).show();
        Intent intent;
        intent = new Intent(table_6_3_1.this, table_6_2.class);
        startActivity(intent);
        this.finish();

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
