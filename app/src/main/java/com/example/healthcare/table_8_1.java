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

public class table_8_1 extends AppCompatActivity {
    TextView L8_4, L8_5;
    Spanned Link_8_4, Link_8_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_8_1);
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
        L8_4 = findViewById(R.id.tableLink_8_4);
        L8_5 = findViewById(R.id.tableLink_8_5);
        Link_8_4 = Html.fromHtml(getString(R.string.Link_8_4));
        Link_8_5 = Html.fromHtml(getString(R.string.Link_8_5));
        L8_4.setText(Link_8_4);
        L8_5.setText(Link_8_5);
        L8_4.setMovementMethod(LinkMovementMethod.getInstance());
        L8_5.setMovementMethod(LinkMovementMethod.getInstance());

    }

}
