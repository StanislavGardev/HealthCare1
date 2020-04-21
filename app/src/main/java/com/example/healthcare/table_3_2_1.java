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
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class table_3_2_1 extends HealthCareActivity implements GestureDetector.OnGestureListener {
    TextView table1_4;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_3_2_1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        scrollView = findViewById(R.id.scrollView321);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        table1_4 = findViewById(R.id.tableLink_3_2_1);
        Spanned Link_1_4 = Html.fromHtml(getString(R.string.Link_8));
        table1_4.setText(Link_1_4);
        table1_4.setMovementMethod(LinkMovementMethod.getInstance());
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
