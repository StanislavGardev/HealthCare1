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

public class table_7_6_1_2 extends HealthCareActivity {
    TextView L7_55, L7_56;
    Spanned Link_7_55, Link_7_56;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_7_6_1_2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L7_55 = findViewById(R.id.tableLink_7_55);
        L7_56 = findViewById(R.id.tableLink_7_56);
        Link_7_55 = Html.fromHtml(getString(R.string.Link_7_55));
        Link_7_56 = Html.fromHtml(getString(R.string.Link_7_56));
        L7_55.setText(Link_7_55);
        L7_56.setText(Link_7_56);
        L7_55.setMovementMethod(LinkMovementMethod.getInstance());
        L7_56.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView7612);
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
