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

public class table_4_1 extends HealthCareActivity {
    TextView L4_2, L4_3;
    Spanned Link_4_2, Link_4_3;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_4_1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L4_2 = findViewById(R.id.tableLink_4_2);
        L4_3 = findViewById(R.id.tableLink_4_3);
        Link_4_2 = Html.fromHtml(getString(R.string.Link_4_2));
        Link_4_3 = Html.fromHtml(getString(R.string.Link_4_3));
        L4_2.setText(Link_4_2);
        L4_3.setText(Link_4_3);
        L4_2.setMovementMethod(LinkMovementMethod.getInstance());
        L4_3.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView41);
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
