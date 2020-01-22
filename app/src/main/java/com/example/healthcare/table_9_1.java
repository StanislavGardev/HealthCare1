package com.example.healthcare;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class table_9_1 extends AppCompatActivity {
    TextView L9_10, L9_11, L9_12;
    Spanned Link_9_10, Link_9_11, Link_9_12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_9_1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        L9_10 = findViewById(R.id.tableLink_9_10);
        L9_11 = findViewById(R.id.tableLink_9_11);
        L9_12 = findViewById(R.id.tableLink_9_12);
        Link_9_10 = Html.fromHtml(getString(R.string.Link_9_10));
        Link_9_11 = Html.fromHtml(getString(R.string.Link_9_11));
        Link_9_12 = Html.fromHtml(getString(R.string.Link_9_12));
        L9_10.setText(Link_9_10);
        L9_11.setText(Link_9_11);
        L9_12.setText(Link_9_12);
        L9_10.setMovementMethod(LinkMovementMethod.getInstance());
        L9_11.setMovementMethod(LinkMovementMethod.getInstance());
        L9_12.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
