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

public class table_7_5 extends HealthCareActivity {
    TextView L7_47, L7_48, L7_49, L7_50, L7_51, L7_52;
    Spanned Link_7_47, Link_7_48, Link_7_49, Link_7_50, Link_7_51, Link_7_52;
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_7_5);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        scrollView = findViewById(R.id.scrollView75);
        L7_47 = findViewById(R.id.tableLink_7_47);
        L7_48 = findViewById(R.id.tableLink_7_48);
        L7_49 = findViewById(R.id.tableLink_7_49);
        L7_50 = findViewById(R.id.tableLink_7_50);
        L7_51 = findViewById(R.id.tableLink_7_51);
        L7_52 = findViewById(R.id.tableLink_7_52);
        Link_7_47 = Html.fromHtml(getString(R.string.Link_7_47));
        Link_7_48 = Html.fromHtml(getString(R.string.Link_7_48));
        Link_7_49 = Html.fromHtml(getString(R.string.Link_7_49));
        Link_7_50 = Html.fromHtml(getString(R.string.Link_7_50));
        Link_7_51 = Html.fromHtml(getString(R.string.Link_7_51));
        Link_7_52 = Html.fromHtml(getString(R.string.Link_7_52));
        L7_47.setText(Link_7_47);
        L7_48.setText(Link_7_48);
        L7_49.setText(Link_7_49);
        L7_50.setText(Link_7_50);
        L7_51.setText(Link_7_51);
        L7_52.setText(Link_7_52);
        L7_47.setMovementMethod(LinkMovementMethod.getInstance());
        L7_48.setMovementMethod(LinkMovementMethod.getInstance());
        L7_49.setMovementMethod(LinkMovementMethod.getInstance());
        L7_50.setMovementMethod(LinkMovementMethod.getInstance());
        L7_51.setMovementMethod(LinkMovementMethod.getInstance());
        L7_52.setMovementMethod(LinkMovementMethod.getInstance());
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
