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

public class table_7_6_2 extends HealthCareActivity {
    TextView L7_59, L7_60, L7_61, L7_62, L7_63;
    Spanned Link_7_59, Link_7_60, Link_7_61, Link_7_62, Link_7_63;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_7_6_2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L7_59 = findViewById(R.id.tableLink_7_59);
        L7_60 = findViewById(R.id.tableLink_7_60);
        L7_61 = findViewById(R.id.tableLink_7_61);
        L7_62 = findViewById(R.id.tableLink_7_62);
        L7_63 = findViewById(R.id.tableLink_7_63);
        Link_7_59 = Html.fromHtml(getString(R.string.Link_7_59));
        Link_7_60 = Html.fromHtml(getString(R.string.Link_7_60));
        Link_7_61 = Html.fromHtml(getString(R.string.Link_7_61));
        Link_7_62 = Html.fromHtml(getString(R.string.Link_7_62));
        Link_7_63 = Html.fromHtml(getString(R.string.Link_7_63));
        L7_59.setText(Link_7_59);
        L7_60.setText(Link_7_60);
        L7_61.setText(Link_7_61);
        L7_62.setText(Link_7_62);
        L7_63.setText(Link_7_63);
        L7_59.setMovementMethod(LinkMovementMethod.getInstance());
        L7_60.setMovementMethod(LinkMovementMethod.getInstance());
        L7_61.setMovementMethod(LinkMovementMethod.getInstance());
        L7_62.setMovementMethod(LinkMovementMethod.getInstance());
        L7_63.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView762);
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
