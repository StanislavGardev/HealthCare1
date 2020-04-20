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

public class table_5_4_2_3 extends HealthCareActivity {
    TextView L5_39, L5_40;
    Spanned Link_5_39, Link_5_40;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_5_4_2_3);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L5_39 = findViewById(R.id.tableLink_5_39);
        L5_40 = findViewById(R.id.tableLink_5_40);
        Link_5_39 = Html.fromHtml(getString(R.string.Link_5_39));
        Link_5_40 = Html.fromHtml(getString(R.string.Link_5_40));
        L5_39.setText(Link_5_39);
        L5_40.setText(Link_5_40);
        L5_39.setMovementMethod(LinkMovementMethod.getInstance());
        L5_40.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView5423);
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
