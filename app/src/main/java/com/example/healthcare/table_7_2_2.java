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

public class table_7_2_2 extends HealthCareActivity {
    TextView L7_12, L7_13, L7_15;
    Spanned Link_7_12, Link_7_13, Link_7_15;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_7_2_2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L7_12 = findViewById(R.id.tableLink_7_12);
        L7_13 = findViewById(R.id.tableLink_7_13);
        L7_15 = findViewById(R.id.tableLink_7_15);
        Link_7_12 = Html.fromHtml(getString(R.string.Link_7_12));
        Link_7_13 = Html.fromHtml(getString(R.string.Link_7_13));
        Link_7_15 = Html.fromHtml(getString(R.string.Link_7_15));
        L7_12.setText(Link_7_12);
        L7_13.setText(Link_7_13);
        L7_15.setText(Link_7_15);
        L7_12.setMovementMethod(LinkMovementMethod.getInstance());
        L7_13.setMovementMethod(LinkMovementMethod.getInstance());
        L7_15.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView722);
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
