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

public class table_7_4_1 extends HealthCareActivity {
    TextView L7_29, L7_31, L7_32, L7_33;
    Spanned Link_7_29, Link_7_31, Link_7_32, Link_7_33;
    public static final int SWIPE_THRESHOLD = 100;
    public static final int SWIPE_VELOCITY_THRESHOLD = 100;
    private GestureDetector gestureDetector;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_7_4_1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L7_29 = findViewById(R.id.tableLink_7_29);
        L7_31 = findViewById(R.id.tableLink_7_31);
        L7_32 = findViewById(R.id.tableLink_7_32);
        L7_33 = findViewById(R.id.tableLink_7_33);
        Link_7_29 = Html.fromHtml(getString(R.string.Link_7_29));
        Link_7_31 = Html.fromHtml(getString(R.string.Link_7_31));
        Link_7_32 = Html.fromHtml(getString(R.string.Link_7_32));
        Link_7_33 = Html.fromHtml(getString(R.string.Link_7_33));
        L7_29.setText(Link_7_29);
        L7_31.setText(Link_7_31);
        L7_32.setText(Link_7_32);
        L7_33.setText(Link_7_33);
        L7_29.setMovementMethod(LinkMovementMethod.getInstance());
        L7_31.setMovementMethod(LinkMovementMethod.getInstance());
        L7_32.setMovementMethod(LinkMovementMethod.getInstance());
        L7_33.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView741);
        scrollView.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                v.onTouchEvent(event);
                gestureDetector.onTouchEvent(event);
                return true;
            }
        });

        gestureDetector = new GestureDetector(getApplicationContext(), this);

    }
}
