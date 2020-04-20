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

public class table_6_6 extends HealthCareActivity {
    TextView L6_62, L6_63, L6_64, L6_65, L6_66, L6_67;
    Spanned Link_6_62, Link_6_63, Link_6_64, Link_6_65, Link_6_66, Link_6_67;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_6_6);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L6_62 = findViewById(R.id.tableLink_6_62);
        L6_63 = findViewById(R.id.tableLink_6_63);
        L6_64 = findViewById(R.id.tableLink_6_64);
        L6_65 = findViewById(R.id.tableLink_6_65);
        L6_66 = findViewById(R.id.tableLink_6_66);
        L6_67 = findViewById(R.id.tableLink_6_67);
        Link_6_62 = Html.fromHtml(getString(R.string.Link_6_62));
        Link_6_63 = Html.fromHtml(getString(R.string.Link_6_63));
        Link_6_64 = Html.fromHtml(getString(R.string.Link_6_64));
        Link_6_65 = Html.fromHtml(getString(R.string.Link_6_65));
        Link_6_66 = Html.fromHtml(getString(R.string.Link_6_66));
        Link_6_67 = Html.fromHtml(getString(R.string.Link_6_67));
        L6_62.setText(Link_6_62);
        L6_63.setText(Link_6_63);
        L6_64.setText(Link_6_64);
        L6_65.setText(Link_6_65);
        L6_66.setText(Link_6_66);
        L6_67.setText(Link_6_67);
        L6_62.setMovementMethod(LinkMovementMethod.getInstance());
        L6_63.setMovementMethod(LinkMovementMethod.getInstance());
        L6_64.setMovementMethod(LinkMovementMethod.getInstance());
        L6_65.setMovementMethod(LinkMovementMethod.getInstance());
        L6_66.setMovementMethod(LinkMovementMethod.getInstance());
        L6_67.setMovementMethod(LinkMovementMethod.getInstance());

        scrollView = findViewById(R.id.scrollView66);
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
