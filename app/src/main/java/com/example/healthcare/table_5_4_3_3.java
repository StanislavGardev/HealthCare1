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

public class table_5_4_3_3 extends HealthCareActivity {
    TextView Link5_47, Link5_48;
    Spanned Link_5_47, Link_5_48;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_5_4_3_3);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Link5_47 = findViewById(R.id.tableLink_5_47);
        Link5_48 = findViewById(R.id.tableLink_5_48);
        Link_5_47 = Html.fromHtml(getString(R.string.Link_5_47));
        Link_5_48 = Html.fromHtml(getString(R.string.Link_5_48));
        Link5_47.setText(Link_5_47);
        Link5_48.setText(Link_5_48);
        Link5_47.setMovementMethod(LinkMovementMethod.getInstance());
        Link5_48.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView5433);
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
