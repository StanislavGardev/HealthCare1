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

public class table_9_1 extends HealthCareActivity {
    TextView L9_10, L9_11, L9_12;
    Spanned Link_9_10, Link_9_11, Link_9_12;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_9_1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L9_10 = findViewById(R.id.tableLink_9_10);
        L9_11 = findViewById(R.id.tableLink_9_11);
        L9_12 = findViewById(R.id.tableLink_9_12);
        Link_9_10 = Html.fromHtml(getString(R.string.Link_9_10));
        Link_9_11 = Html.fromHtml(getString(R.string.Link_9_11));
        Link_9_12 = Html.fromHtml(getString(R.string.Link_9_12));
        L9_10.setText(Link_9_10);
        L9_11.setText(Link_9_11);
        L9_12.setText(Link_9_12);
        L9_10.setMovementMethod(LinkMovementMethod.getInstance());
        L9_11.setMovementMethod(LinkMovementMethod.getInstance());
        L9_12.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView91);
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
