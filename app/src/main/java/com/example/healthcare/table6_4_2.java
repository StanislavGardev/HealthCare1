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

public class table6_4_2 extends AppCompatActivity {
    TextView L6_43, L6_45, L6_46, L6_47, L6_48;
    Spanned Link_6_43, Link_6_45, Link_6_46, Link_6_47, Link_6_48;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table6_4_2);
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
        L6_43 = findViewById(R.id.tableLink_6_43);
        L6_45 = findViewById(R.id.tableLink_6_45);
        L6_46 = findViewById(R.id.tableLink_6_46);
        L6_47 = findViewById(R.id.tableLink_6_47);
        L6_48 = findViewById(R.id.tableLink_6_48);
        Link_6_43 = Html.fromHtml(getString(R.string.Link_6_43));
        Link_6_45 = Html.fromHtml(getString(R.string.Link_6_45));
        Link_6_46 = Html.fromHtml(getString(R.string.Link_6_46));
        Link_6_47 = Html.fromHtml(getString(R.string.Link_6_47));
        Link_6_48 = Html.fromHtml(getString(R.string.Link_6_48));
        L6_43.setText(Link_6_43);
        L6_45.setText(Link_6_45);
        L6_46.setText(Link_6_46);
        L6_47.setText(Link_6_47);
        L6_48.setText(Link_6_48);
        L6_43.setMovementMethod(LinkMovementMethod.getInstance());
        L6_45.setMovementMethod(LinkMovementMethod.getInstance());
        L6_46.setMovementMethod(LinkMovementMethod.getInstance());
        L6_47.setMovementMethod(LinkMovementMethod.getInstance());
        L6_48.setMovementMethod(LinkMovementMethod.getInstance());

    }

}
