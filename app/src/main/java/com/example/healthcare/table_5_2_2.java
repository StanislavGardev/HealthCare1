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

public class table_5_2_2 extends HealthCareActivity {
    TextView L5_17, L5_18, L5_19;
    Spanned Link_5_17, Link_5_18, Link_5_19;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_5_2_2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L5_17 = findViewById(R.id.tableLink_5_17);
        L5_18 = findViewById(R.id.tableLink_5_18);
        L5_19 = findViewById(R.id.tableLink_5_19);
        Link_5_17 = Html.fromHtml(getString(R.string.Link_5_17));
        Link_5_18 = Html.fromHtml(getString(R.string.Link_5_18));
        Link_5_19 = Html.fromHtml(getString(R.string.Link_5_19));
        L5_17.setText(Link_5_17);
        L5_18.setText(Link_5_18);
        L5_19.setText(Link_5_19);
        L5_17.setMovementMethod(LinkMovementMethod.getInstance());
        L5_18.setMovementMethod(LinkMovementMethod.getInstance());
        L5_19.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView522);
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
