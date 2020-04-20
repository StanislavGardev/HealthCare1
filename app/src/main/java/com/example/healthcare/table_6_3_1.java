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

public class table_6_3_1 extends HealthCareActivity implements GestureDetector.OnGestureListener {
    TextView L6_12, L6_13, L6_14, L6_15, L6_17;
    Spanned Link_6_12, Link_6_13, Link_6_14, Link_6_15, Link_6_17;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_6_3_1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
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
}
