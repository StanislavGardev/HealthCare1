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

public class table_6_3_1 extends AppCompatActivity {
    TextView L6_12, L6_13, L6_14, L6_15, L6_17;
    Spanned Link_6_12, Link_6_13, Link_6_14, Link_6_15, Link_6_17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_6_3_1);
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
        L6_12 = findViewById(R.id.tableLink_6_12);
        L6_13 = findViewById(R.id.tableLink_6_13);
        L6_14 = findViewById(R.id.tableLink_6_14);
        L6_15 = findViewById(R.id.tableLink_6_15);
        L6_17 = findViewById(R.id.tableLink_6_17);
        Link_6_12 = Html.fromHtml(getString(R.string.Link_6_12));
        Link_6_13 = Html.fromHtml(getString(R.string.Link_6_13));
        Link_6_14 = Html.fromHtml(getString(R.string.Link_6_14));
        Link_6_15 = Html.fromHtml(getString(R.string.Link_6_15));
        Link_6_17 = Html.fromHtml(getString(R.string.Link_6_17));
        L6_12.setText(Link_6_12);
        L6_13.setText(Link_6_13);
        L6_14.setText(Link_6_14);
        L6_15.setText(Link_6_15);
        L6_17.setText(Link_6_17);
        L6_12.setMovementMethod(LinkMovementMethod.getInstance());
        L6_13.setMovementMethod(LinkMovementMethod.getInstance());
        L6_14.setMovementMethod(LinkMovementMethod.getInstance());
        L6_15.setMovementMethod(LinkMovementMethod.getInstance());
        L6_17.setMovementMethod(LinkMovementMethod.getInstance());



    }

}
