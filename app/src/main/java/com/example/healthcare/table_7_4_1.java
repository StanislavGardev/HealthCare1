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

public class table_7_4_1 extends AppCompatActivity {
    TextView L7_29, L7_31, L7_32, L7_33;
    Spanned Link_7_29, Link_7_31, Link_7_32, Link_7_33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_7_4_1);
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
        L7_29 = findViewById(R.id.tableLink_7_29);
        L7_31 = findViewById(R.id.tableLink_7_31);
        L7_32 = findViewById(R.id.tableLink_7_32);
        L7_33 = findViewById(R.id.tableLink_7_33);
        Link_7_29 = Html.fromHtml(getString(R.string.Link_7_29));
        Link_7_31 = Html.fromHtml(getString(R.string.Link_7_31));
        Link_7_32 = Html.fromHtml(getString(R.string.Link_7_32));
        Link_7_33 = Html.fromHtml(getString(R.string.Link_7_33));
        L7_29.setText(Link_7_29);
        L7_31.setText(Link_7_31);
        L7_32.setText(Link_7_32);
        L7_33.setText(Link_7_33);
        L7_29.setMovementMethod(LinkMovementMethod.getInstance());
        L7_31.setMovementMethod(LinkMovementMethod.getInstance());
        L7_32.setMovementMethod(LinkMovementMethod.getInstance());
        L7_33.setMovementMethod(LinkMovementMethod.getInstance());

    }

}
