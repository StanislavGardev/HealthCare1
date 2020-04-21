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

public class table_10_2 extends HealthCareActivity {
    TextView L10_6, L10_8;
    Spanned Link_10_6, Link_10_8;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_10_2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L10_6 = findViewById(R.id.tableLink_10_6);
        L10_8 = findViewById(R.id.tableLink_10_8);
        Link_10_6 = Html.fromHtml(getString(R.string.Link_10_6));
        Link_10_8 = Html.fromHtml(getString(R.string.Link_10_8));
        L10_6.setText(Link_10_6);
        L10_8.setText(Link_10_8);
        L10_6.setMovementMethod(LinkMovementMethod.getInstance());
        L10_8.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView102);
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
