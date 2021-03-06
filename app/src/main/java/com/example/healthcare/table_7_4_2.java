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

public class table_7_4_2 extends HealthCareActivity {
    TextView L7_34, L7_35, L7_36, L7_37, L7_39;
    Spanned Link_7_34, Link_7_35, Link_7_36, Link_7_37, Link_7_39;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_7_4_2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L7_34 = findViewById(R.id.tableLink_7_34);
        L7_35 = findViewById(R.id.tableLink_7_35);
        L7_36 = findViewById(R.id.tableLink_7_36);
        L7_37 = findViewById(R.id.tableLink_7_37);
        L7_39 = findViewById(R.id.tableLink_7_39);
        Link_7_34 = Html.fromHtml(getString(R.string.Link_7_34));
        Link_7_35 = Html.fromHtml(getString(R.string.Link_7_35));
        Link_7_36 = Html.fromHtml(getString(R.string.Link_7_36));
        Link_7_37 = Html.fromHtml(getString(R.string.Link_7_37));
        Link_7_39 = Html.fromHtml(getString(R.string.Link_7_39));
        L7_34.setText(Link_7_34);
        L7_35.setText(Link_7_35);
        L7_36.setText(Link_7_36);
        L7_37.setText(Link_7_37);
        L7_39.setText(Link_7_39);
        L7_34.setMovementMethod(LinkMovementMethod.getInstance());
        L7_35.setMovementMethod(LinkMovementMethod.getInstance());
        L7_36.setMovementMethod(LinkMovementMethod.getInstance());
        L7_37.setMovementMethod(LinkMovementMethod.getInstance());
        L7_39.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView742);
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
