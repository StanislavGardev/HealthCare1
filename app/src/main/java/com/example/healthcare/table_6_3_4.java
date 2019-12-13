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

public class table_6_3_4 extends AppCompatActivity {
    TextView L6_33, L6_34, L6_35;
    Spanned Link_6_33, Link_6_34, Link_6_35;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_6_3_4);
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
        L6_33 = findViewById(R.id.tableLink_6_33);
        L6_34 = findViewById(R.id.tableLink_6_34);
        L6_35 = findViewById(R.id.tableLink_6_35);
        Link_6_33 = Html.fromHtml(getString(R.string.Link_6_33));
        Link_6_34 = Html.fromHtml(getString(R.string.Link_6_34));
        Link_6_35 = Html.fromHtml(getString(R.string.Link_6_35));
        L6_33.setText(Link_6_33);
        L6_34.setText(Link_6_34);
        L6_35.setText(Link_6_35);
        L6_33.setMovementMethod(LinkMovementMethod.getInstance());
        L6_34.setMovementMethod(LinkMovementMethod.getInstance());
        L6_35.setMovementMethod(LinkMovementMethod.getInstance());
    }

}