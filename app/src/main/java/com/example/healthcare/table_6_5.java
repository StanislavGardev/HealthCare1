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

public class table_6_5 extends HealthCareActivity {
    TextView L6_57, L6_58, L6_60, L6_61;
    Spanned Link_6_57, Link_6_58, Link_6_60, Link_6_61;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_6_5);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L6_57 = findViewById(R.id.tableLink_6_57);
        L6_58 = findViewById(R.id.tableLink_6_58);
        L6_60 = findViewById(R.id.tableLink_6_60);
        L6_61 = findViewById(R.id.tableLink_6_61);
        Link_6_57 = Html.fromHtml(getString(R.string.Link_6_57));
        Link_6_58 = Html.fromHtml(getString(R.string.Link_6_58));
        Link_6_60 = Html.fromHtml(getString(R.string.Link_6_60));
        Link_6_61 = Html.fromHtml(getString(R.string.Link_6_61));
        L6_57.setText(Link_6_57);
        L6_58.setText(Link_6_58);
        L6_60.setText(Link_6_60);
        L6_61.setText(Link_6_61);
        L6_57.setMovementMethod(LinkMovementMethod.getInstance());
        L6_58.setMovementMethod(LinkMovementMethod.getInstance());
        L6_60.setMovementMethod(LinkMovementMethod.getInstance());
        L6_61.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView65);
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
