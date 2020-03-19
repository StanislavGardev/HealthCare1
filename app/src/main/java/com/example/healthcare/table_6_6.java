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

public class table_6_6 extends AppCompatActivity implements GestureDetector.OnGestureListener {
    TextView L6_62, L6_63, L6_64, L6_65, L6_66, L6_67;
    Spanned Link_6_62, Link_6_63, Link_6_64, Link_6_65, Link_6_66, Link_6_67;
    public static final int SWIPE_THRESHOLD = 100;
    public static final int SWIPE_VELOCITY_THRESHOLD = 100;
    private GestureDetector gestureDetector;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_6_6);
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
        L6_62 = findViewById(R.id.tableLink_6_62);
        L6_63 = findViewById(R.id.tableLink_6_63);
        L6_64 = findViewById(R.id.tableLink_6_64);
        L6_65 = findViewById(R.id.tableLink_6_65);
        L6_66 = findViewById(R.id.tableLink_6_66);
        L6_67 = findViewById(R.id.tableLink_6_67);
        Link_6_62 = Html.fromHtml(getString(R.string.Link_6_62));
        Link_6_63 = Html.fromHtml(getString(R.string.Link_6_63));
        Link_6_64 = Html.fromHtml(getString(R.string.Link_6_64));
        Link_6_65 = Html.fromHtml(getString(R.string.Link_6_65));
        Link_6_66 = Html.fromHtml(getString(R.string.Link_6_66));
        Link_6_67 = Html.fromHtml(getString(R.string.Link_6_67));
        L6_62.setText(Link_6_62);
        L6_63.setText(Link_6_63);
        L6_64.setText(Link_6_64);
        L6_65.setText(Link_6_65);
        L6_66.setText(Link_6_66);
        L6_67.setText(Link_6_67);
        L6_62.setMovementMethod(LinkMovementMethod.getInstance());
        L6_63.setMovementMethod(LinkMovementMethod.getInstance());
        L6_64.setMovementMethod(LinkMovementMethod.getInstance());
        L6_65.setMovementMethod(LinkMovementMethod.getInstance());
        L6_66.setMovementMethod(LinkMovementMethod.getInstance());
        L6_67.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView66);
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
        intent = new Intent(table_6_6.this, table_6_7.class);
        startActivity(intent);
        startActivity(intent);
        this.finish();
    }

    private void onSwipeRight() {
        //Toast.makeText(this, "Swipe Right", Toast.LENGTH_LONG).show();
        Intent intent;
        intent = new Intent(table_6_6.this, table_6_5.class);
        startActivity(intent);
        this.finish();

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
