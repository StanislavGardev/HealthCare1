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

public class table_6_3_2 extends AppCompatActivity {
    TextView L6_18, L6_19, L6_20, L6_21, L6_22, L6_23, L6_24;
    Spanned Link_6_18, Link_6_19, Link_6_20, Link_6_21, Link_6_22, Link_6_23, Link_6_24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_6_3_2);
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
        L6_18 = findViewById(R.id.tableLink_6_18);
        L6_19 = findViewById(R.id.tableLink_6_19);
        L6_20 = findViewById(R.id.tableLink_6_20);
        L6_21 = findViewById(R.id.tableLink_6_21);
        L6_22 = findViewById(R.id.tableLink_6_22);
        L6_23 = findViewById(R.id.tableLink_6_23);
        L6_24 = findViewById(R.id.tableLink_6_24);
        Link_6_18 = Html.fromHtml(getString(R.string.Link_6_18));
        Link_6_19 = Html.fromHtml(getString(R.string.Link_6_19));
        Link_6_20 = Html.fromHtml(getString(R.string.Link_6_20));
        Link_6_21 = Html.fromHtml(getString(R.string.Link_6_21));
        Link_6_22 = Html.fromHtml(getString(R.string.Link_6_22));
        Link_6_23 = Html.fromHtml(getString(R.string.Link_6_23));
        Link_6_24 = Html.fromHtml(getString(R.string.Link_6_24));
        L6_18.setText(Link_6_18);
        L6_19.setText(Link_6_19);
        L6_20.setText(Link_6_20);
        L6_21.setText(Link_6_21);
        L6_22.setText(Link_6_22);
        L6_23.setText(Link_6_23);
        L6_24.setText(Link_6_24);
        L6_18.setMovementMethod(LinkMovementMethod.getInstance());
        L6_19.setMovementMethod(LinkMovementMethod.getInstance());
        L6_20.setMovementMethod(LinkMovementMethod.getInstance());
        L6_21.setMovementMethod(LinkMovementMethod.getInstance());
        L6_22.setMovementMethod(LinkMovementMethod.getInstance());
        L6_23.setMovementMethod(LinkMovementMethod.getInstance());
        L6_24.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
