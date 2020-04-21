package com.example.healthcare;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends HealthCareActivity {
    Button btn1, btn2;
    TextView text, linkView;
    Spanned link;
    View zoomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        linkView = findViewById(R.id.textViewLink);
        text = findViewById(R.id.textViewFirstText);
        link = Html.fromHtml(getString(R.string.firstPage));
        linkView.setText(link);
        gestureDetector = new GestureDetector(this);
        linkView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void openScrollingActivity() {
        Intent intent = new Intent(MainActivity.this, ScrollingActivity.class);
        startActivity(intent);
    }

}
