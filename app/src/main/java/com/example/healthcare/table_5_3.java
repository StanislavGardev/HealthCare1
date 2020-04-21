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

public class table_5_3 extends AppCompatActivity implements GestureDetector.OnGestureListener {
    TextView L5_21, L5_23, L5_24, L5_25, L5_27, L5_28, L5_29, links;
    Spanned textLinks, Link_5_21, Link_5_23, Link_5_24, Link_5_25, Link_5_27, Link_5_28, Link_5_29;
    public static final int SWIPE_THRESHOLD = 100;
    public static final int SWIPE_VELOCITY_THRESHOLD = 100;
    private GestureDetector gestureDetector;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_5_3);
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
        L5_21 = findViewById(R.id.tableLink_5_21);
        L5_23 = findViewById(R.id.tableLink_5_23);
        L5_24 = findViewById(R.id.tableLink_5_24);
        L5_25 = findViewById(R.id.tableLink_5_25);
        L5_27 = findViewById(R.id.tableLink_5_27);
        L5_28 = findViewById(R.id.tableLink_5_28);
        L5_29 = findViewById(R.id.tableLink_5_29);
        links = findViewById(R.id.textViewLinks);
        Link_5_21 = Html.fromHtml(getString(R.string.Link_5_21));
        Link_5_23 = Html.fromHtml(getString(R.string.Link_5_23));
        Link_5_24 = Html.fromHtml(getString(R.string.Link_5_24));
        Link_5_25 = Html.fromHtml(getString(R.string.Link_5_25));
        Link_5_27 = Html.fromHtml(getString(R.string.Link_5_27));
        Link_5_28 = Html.fromHtml(getString(R.string.Link_5_28));
        Link_5_29 = Html.fromHtml(getString(R.string.Link_5_29));
        textLinks = Html.fromHtml(getString(R.string.text5_3));
        links.setText(textLinks);
        L5_21.setText(Link_5_21);
        L5_23.setText(Link_5_23);
        L5_24.setText(Link_5_24);
        L5_25.setText(Link_5_25);
        L5_27.setText(Link_5_27);
        L5_28.setText(Link_5_28);
        L5_29.setText(Link_5_29);
        links.setMovementMethod(LinkMovementMethod.getInstance());
        L5_21.setMovementMethod(LinkMovementMethod.getInstance());
        L5_23.setMovementMethod(LinkMovementMethod.getInstance());
        L5_24.setMovementMethod(LinkMovementMethod.getInstance());
        L5_25.setMovementMethod(LinkMovementMethod.getInstance());
        L5_27.setMovementMethod(LinkMovementMethod.getInstance());
        L5_28.setMovementMethod(LinkMovementMethod.getInstance());
        L5_29.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView53);
        scrollView.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                v.onTouchEvent(event);
                gestureDetector.onTouchEvent(event);
                return true;
            }
        });

        links.setOnTouchListener(new View.OnTouchListener() {
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
        intent = new Intent(table_5_3.this, table_5_4_1.class);
        startActivity(intent);
        startActivity(intent);
        this.finish();
    }

    private void onSwipeRight() {
        //Toast.makeText(this, "Swipe Right", Toast.LENGTH_LONG).show();
        Intent intent;
        intent = new Intent(table_5_3.this, table_5_2_2.class);
        startActivity(intent);
        this.finish();

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
