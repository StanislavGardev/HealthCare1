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

public class table_7_1 extends HealthCareActivity {
    TextView L7_2, L7_3, L7_4, L7_5, L7_6;
    Spanned Link_7_2, Link_7_3, Link_7_4, Link_7_5, Link_7_6;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_7_1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L7_2 = findViewById(R.id.tableLink_7_2);
        L7_3 = findViewById(R.id.tableLink_7_3);
        L7_4 = findViewById(R.id.tableLink_7_4);
        L7_5 = findViewById(R.id.tableLink_7_5);
        L7_6 = findViewById(R.id.tableLink_7_6);
        Link_7_2 = Html.fromHtml(getString(R.string.Link_7_2));
        Link_7_3 = Html.fromHtml(getString(R.string.Link_7_3));
        Link_7_4 = Html.fromHtml(getString(R.string.Link_7_4));
        Link_7_5 = Html.fromHtml(getString(R.string.Link_7_5));
        Link_7_6 = Html.fromHtml(getString(R.string.Link_7_6));
        L7_2.setText(Link_7_2);
        L7_3.setText(Link_7_3);
        L7_4.setText(Link_7_4);
        L7_5.setText(Link_7_5);
        L7_6.setText(Link_7_6);
        L7_2.setMovementMethod(LinkMovementMethod.getInstance());
        L7_3.setMovementMethod(LinkMovementMethod.getInstance());
        L7_4.setMovementMethod(LinkMovementMethod.getInstance());
        L7_5.setMovementMethod(LinkMovementMethod.getInstance());
        L7_6.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView71);
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
