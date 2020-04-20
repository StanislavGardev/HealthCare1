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

public class table_5_2 extends HealthCareActivity {
    TextView L_5_8, L_5_9, L_5_10, L_5_11, L_5_12, L_5_13, L_5_14;
    Spanned Link_5_8, Link_5_9, Link_5_10, Link_5_11, Link_5_12, Link_5_13, Link_5_14;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_5_2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
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
}
