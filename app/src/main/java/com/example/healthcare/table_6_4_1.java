package com.example.healthcare;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class table_6_4_1 extends AppCompatActivity {
    TextView L6_40, L6_42;
    Spanned Link_6_40, Link_6_42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_6_4_1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L6_40 = findViewById(R.id.tableLink_6_40);
        L6_42 = findViewById(R.id.tableLink_6_42);
        Link_6_40 = Html.fromHtml(getString(R.string.Link_6_40));
        Link_6_42 = Html.fromHtml(getString(R.string.Link_6_42));
        L6_40.setText(Link_6_40);
        L6_42.setText(Link_6_42);
        L6_40.setMovementMethod(LinkMovementMethod.getInstance());
        L6_42.setMovementMethod(LinkMovementMethod.getInstance());

    }

}