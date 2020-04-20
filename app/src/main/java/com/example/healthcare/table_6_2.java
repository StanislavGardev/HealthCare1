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

public class table_6_2 extends HealthCareActivity {
    TextView L6_8, L6_11;
    Spanned Link_6_8, Link_6_11;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_6_2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L6_8 = findViewById(R.id.tableLink_6_8);
        L6_11 = findViewById(R.id.tableLink_6_11);
        Link_6_8 = Html.fromHtml(getString(R.string.Link_6_8));
        Link_6_11 = Html.fromHtml(getString(R.string.Link_6_11));
        L6_8.setText(Link_6_8);
        L6_11.setText(Link_6_11);
        L6_8.setMovementMethod(LinkMovementMethod.getInstance());
        L6_11.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView62);
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
