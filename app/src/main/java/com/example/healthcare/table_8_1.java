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

public class table_8_1 extends HealthCareActivity {
    TextView L8_4, L8_5;
    Spanned Link_8_4, Link_8_5;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_8_1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L8_4 = findViewById(R.id.tableLink_8_4);
        L8_5 = findViewById(R.id.tableLink_8_5);
        Link_8_4 = Html.fromHtml(getString(R.string.Link_8_4));
        Link_8_5 = Html.fromHtml(getString(R.string.Link_8_5));
        L8_4.setText(Link_8_4);
        L8_5.setText(Link_8_5);
        L8_4.setMovementMethod(LinkMovementMethod.getInstance());
        L8_5.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView81);
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
