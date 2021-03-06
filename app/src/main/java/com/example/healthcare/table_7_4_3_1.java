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

public class table_7_4_3_1 extends HealthCareActivity {
    TextView L7_40, L7_41, L7_42, L7_43, L7_44, L7_45;
    Spanned Link_7_40, Link_7_41, Link_7_42, Link_7_43, Link_7_44, Link_7_45;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_7_4_3_1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L7_40 = findViewById(R.id.tableLink_7_40);
        L7_41 = findViewById(R.id.tableLink_7_41);
        L7_42 = findViewById(R.id.tableLink_7_42);
        L7_43 = findViewById(R.id.tableLink_7_43);
        L7_44 = findViewById(R.id.tableLink_7_44);
        L7_45 = findViewById(R.id.tableLink_7_45);
        Link_7_40 = Html.fromHtml(getString(R.string.Link_7_40));
        Link_7_41 = Html.fromHtml(getString(R.string.Link_7_41));
        Link_7_42 = Html.fromHtml(getString(R.string.Link_7_42));
        Link_7_43 = Html.fromHtml(getString(R.string.Link_7_43));
        Link_7_44 = Html.fromHtml(getString(R.string.Link_7_44));
        Link_7_45 = Html.fromHtml(getString(R.string.Link_7_45));
        L7_40.setText(Link_7_40);
        L7_41.setText(Link_7_41);
        L7_42.setText(Link_7_42);
        L7_43.setText(Link_7_43);
        L7_44.setText(Link_7_44);
        L7_45.setText(Link_7_45);
        L7_40.setMovementMethod(LinkMovementMethod.getInstance());
        L7_41.setMovementMethod(LinkMovementMethod.getInstance());
        L7_42.setMovementMethod(LinkMovementMethod.getInstance());
        L7_43.setMovementMethod(LinkMovementMethod.getInstance());
        L7_44.setMovementMethod(LinkMovementMethod.getInstance());
        L7_45.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView7431);
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
