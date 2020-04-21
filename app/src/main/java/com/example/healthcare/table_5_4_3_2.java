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

public class table_5_4_3_2 extends HealthCareActivity {
    Spanned Link_5_46;
    TextView text_5_4_6;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_5_4_3_2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        text_5_4_6 = findViewById(R.id.table_1_1);
        Link_5_46 = Html.fromHtml(getString(R.string.text5_46));
        text_5_4_6.setText(Link_5_46);
        text_5_4_6.setMovementMethod(LinkMovementMethod.getInstance());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        scrollView = findViewById(R.id.scrollView5432);
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
