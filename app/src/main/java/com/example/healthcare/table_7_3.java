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

public class table_7_3 extends AppCompatActivity {
    TextView L7_17, L7_18, L7_19, L7_21, L7_22;
    Spanned Link_7_17, Link_7_18, Link_7_19, Link_7_21, Link_7_22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_7_3);
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
        L7_17 = findViewById(R.id.tableLink_7_17);
        L7_18 = findViewById(R.id.tableLink_7_18);
        L7_19 = findViewById(R.id.tableLink_7_19);
        L7_21 = findViewById(R.id.tableLink_7_21);
        L7_22 = findViewById(R.id.tableLink_7_22);
        Link_7_17 = Html.fromHtml(getString(R.string.Link_7_17));
        Link_7_18 = Html.fromHtml(getString(R.string.Link_7_18));
        Link_7_19 = Html.fromHtml(getString(R.string.Link_7_19));
        Link_7_21 = Html.fromHtml(getString(R.string.Link_7_21));
        Link_7_22 = Html.fromHtml(getString(R.string.Link_7_22));
        L7_17.setText(Link_7_17);
        L7_18.setText(Link_7_18);
        L7_19.setText(Link_7_19);
        L7_21.setText(Link_7_21);
        L7_22.setText(Link_7_22);
        L7_17.setMovementMethod(LinkMovementMethod.getInstance());
        L7_18.setMovementMethod(LinkMovementMethod.getInstance());
        L7_19.setMovementMethod(LinkMovementMethod.getInstance());
        L7_21.setMovementMethod(LinkMovementMethod.getInstance());
        L7_22.setMovementMethod(LinkMovementMethod.getInstance());

    }

}
