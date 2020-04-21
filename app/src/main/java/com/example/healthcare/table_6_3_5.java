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

public class table_6_3_5 extends HealthCareActivity {
    TextView L6_37, L6_38;
    Spanned Link_6_37, Link_6_38;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_6_3_5);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L6_37 = findViewById(R.id.tableLink_6_37);
        L6_38 = findViewById(R.id.tableLink_6_38);
        Link_6_37 = Html.fromHtml(getString(R.string.Link_6_37));
        Link_6_38 = Html.fromHtml(getString(R.string.Link_6_38));
        L6_37.setText(Link_6_37);
        L6_38.setText(Link_6_38);
        L6_37.setMovementMethod(LinkMovementMethod.getInstance());
        L6_38.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView635);
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
