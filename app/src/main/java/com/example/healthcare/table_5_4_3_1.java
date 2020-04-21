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

public class table_5_4_3_1 extends HealthCareActivity {

    TextView L5_41, L5_42, L5_44;
    Spanned Link_5_41, Link_5_42, Link_5_44;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_5_4_3_1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L5_41 = findViewById(R.id.tableLink_5_41);
        L5_42 = findViewById(R.id.tableLink_5_42);
        L5_44 = findViewById(R.id.tableLink_5_44);
        Link_5_41 = Html.fromHtml(getString(R.string.Link_5_41));
        Link_5_42 = Html.fromHtml(getString(R.string.Link_5_42));
        Link_5_44 = Html.fromHtml(getString(R.string.Link_5_44));
        L5_41.setText(Link_5_41);
        L5_42.setText(Link_5_42);
        L5_44.setText(Link_5_44);
        L5_41.setMovementMethod(LinkMovementMethod.getInstance());
        L5_42.setMovementMethod(LinkMovementMethod.getInstance());
        L5_44.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView5431);
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
