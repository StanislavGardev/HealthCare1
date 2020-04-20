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

public class table6_4_2 extends HealthCareActivity {
    TextView L6_43, L6_45, L6_46, L6_47, L6_48;
    Spanned Link_6_43, Link_6_45, Link_6_46, Link_6_47, Link_6_48;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table6_4_2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L6_43 = findViewById(R.id.tableLink_6_43);
        L6_45 = findViewById(R.id.tableLink_6_45);
        L6_46 = findViewById(R.id.tableLink_6_46);
        L6_47 = findViewById(R.id.tableLink_6_47);
        L6_48 = findViewById(R.id.tableLink_6_48);
        Link_6_43 = Html.fromHtml(getString(R.string.Link_6_43));
        Link_6_45 = Html.fromHtml(getString(R.string.Link_6_45));
        Link_6_46 = Html.fromHtml(getString(R.string.Link_6_46));
        Link_6_47 = Html.fromHtml(getString(R.string.Link_6_47));
        Link_6_48 = Html.fromHtml(getString(R.string.Link_6_48));
        L6_43.setText(Link_6_43);
        L6_45.setText(Link_6_45);
        L6_46.setText(Link_6_46);
        L6_47.setText(Link_6_47);
        L6_48.setText(Link_6_48);
        L6_43.setMovementMethod(LinkMovementMethod.getInstance());
        L6_45.setMovementMethod(LinkMovementMethod.getInstance());
        L6_46.setMovementMethod(LinkMovementMethod.getInstance());
        L6_47.setMovementMethod(LinkMovementMethod.getInstance());
        L6_48.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView642);
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
