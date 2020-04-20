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

public class table_6_7 extends HealthCareActivity {
    TextView L6_68, L6_70, L6_71;
    Spanned Link_6_68, Link_6_70, Link_6_71;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_6_7);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L6_68 = findViewById(R.id.tableLink_6_68);
        L6_70 = findViewById(R.id.tableLink_6_70);
        L6_71 = findViewById(R.id.tableLink_6_71);
        Link_6_68 = Html.fromHtml(getString(R.string.Link_6_68));
        Link_6_70 = Html.fromHtml(getString(R.string.Link_6_70));
        Link_6_71 = Html.fromHtml(getString(R.string.Link_6_71));
        L6_68.setText(Link_6_68);
        L6_70.setText(Link_6_70);
        L6_71.setText(Link_6_71);
        L6_68.setMovementMethod(LinkMovementMethod.getInstance());
        L6_70.setMovementMethod(LinkMovementMethod.getInstance());
        L6_71.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView67);
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
