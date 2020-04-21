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

public class table_6_4_1 extends HealthCareActivity {
    TextView L6_40, L6_42;
    Spanned Link_6_40, Link_6_42;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_6_4_1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L6_40 = findViewById(R.id.tableLink_6_40);
        L6_42 = findViewById(R.id.tableLink_6_42);
        Link_6_40 = Html.fromHtml(getString(R.string.Link_6_40));
        Link_6_42 = Html.fromHtml(getString(R.string.Link_6_42));
        L6_40.setText(Link_6_40);
        L6_42.setText(Link_6_42);
        L6_40.setMovementMethod(LinkMovementMethod.getInstance());
        L6_42.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView641);
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
