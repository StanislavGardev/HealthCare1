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

public class table_6_3_3_1 extends HealthCareActivity {
    TextView L6_25, L6_26, L6_27;
    Spanned Link_6_25, Link_6_26, Link_6_27;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_6_3_3_1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L6_25 = findViewById(R.id.tableLink_6_25);
        L6_26 = findViewById(R.id.tableLink_6_26);
        L6_27 = findViewById(R.id.tableLink_6_27);
        Link_6_25 = Html.fromHtml(getString(R.string.Link_6_25));
        Link_6_26 = Html.fromHtml(getString(R.string.Link_6_26));
        Link_6_27 = Html.fromHtml(getString(R.string.Link_6_27));
        L6_25.setText(Link_6_25);
        L6_26.setText(Link_6_26);
        L6_27.setText(Link_6_27);
        L6_25.setMovementMethod(LinkMovementMethod.getInstance());
        L6_26.setMovementMethod(LinkMovementMethod.getInstance());
        L6_27.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView6331);
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
