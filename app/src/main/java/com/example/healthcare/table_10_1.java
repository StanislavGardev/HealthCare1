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

public class table_10_1 extends HealthCareActivity {
    TextView L10_1, L10_2, L10_3, L10_4;
    Spanned Link_10_1, Link_10_2, Link_10_3, Link_10_4;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_10_1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L10_1 = findViewById(R.id.tableLink_10_1);
        L10_2 = findViewById(R.id.tableLink_10_2);
        L10_3 = findViewById(R.id.tableLink_10_3);
        L10_4 = findViewById(R.id.tableLink_10_4);
        Link_10_1 = Html.fromHtml(getString(R.string.Link_10_1));
        Link_10_2 = Html.fromHtml(getString(R.string.Link_10_2));
        Link_10_3 = Html.fromHtml(getString(R.string.Link_10_3));
        Link_10_4 = Html.fromHtml(getString(R.string.Link_10_4));
        L10_1.setText(Link_10_1);
        L10_2.setText(Link_10_2);
        L10_3.setText(Link_10_3);
        L10_4.setText(Link_10_4);
        L10_1.setMovementMethod(LinkMovementMethod.getInstance());
        L10_2.setMovementMethod(LinkMovementMethod.getInstance());
        L10_3.setMovementMethod(LinkMovementMethod.getInstance());
        L10_4.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView101);
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
