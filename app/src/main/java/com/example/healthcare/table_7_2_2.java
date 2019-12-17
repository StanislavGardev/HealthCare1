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

public class table_7_2_2 extends AppCompatActivity {
    TextView L7_12, L7_13, L7_15;
    Spanned Link_7_12, Link_7_13, Link_7_15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_7_2_2);
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
        L7_12 = findViewById(R.id.tableLink_7_12);
        L7_13 = findViewById(R.id.tableLink_7_13);
        L7_15 = findViewById(R.id.tableLink_7_15);
        Link_7_12 = Html.fromHtml(getString(R.string.Link_7_12));
        Link_7_13 = Html.fromHtml(getString(R.string.Link_7_13));
        Link_7_15 = Html.fromHtml(getString(R.string.Link_7_15));
        L7_12.setText(Link_7_12);
        L7_13.setText(Link_7_13);
        L7_15.setText(Link_7_15);
        L7_12.setMovementMethod(LinkMovementMethod.getInstance());
        L7_13.setMovementMethod(LinkMovementMethod.getInstance());
        L7_15.setMovementMethod(LinkMovementMethod.getInstance());

    }

}
