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

public class table_6_3_3_2 extends AppCompatActivity {
    TextView L6_28, L6_29, L6_30;
    Spanned Link_6_28, Link_6_29, Link_6_30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_6_3_3_2);
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
        L6_28 = findViewById(R.id.tableLink_6_28);
        L6_29 = findViewById(R.id.tableLink_6_29);
        L6_30 = findViewById(R.id.tableLink_6_30);
        Link_6_28 = Html.fromHtml(getString(R.string.Link_6_28));
        Link_6_29 = Html.fromHtml(getString(R.string.Link_6_29));
        Link_6_30 = Html.fromHtml(getString(R.string.Link_6_30));
        L6_28.setText(Link_6_28);
        L6_29.setText(Link_6_29);
        L6_30.setText(Link_6_30);
        L6_28.setMovementMethod(LinkMovementMethod.getInstance());
        L6_29.setMovementMethod(LinkMovementMethod.getInstance());
        L6_30.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
