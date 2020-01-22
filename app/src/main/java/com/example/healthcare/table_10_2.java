package com.example.healthcare;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class table_10_2 extends AppCompatActivity {
    TextView L10_6, L10_8;
    Spanned Link_10_6, Link_10_8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_10_2);
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
        L10_6 = findViewById(R.id.tableLink_10_6);
        L10_8 = findViewById(R.id.tableLink_10_8);
        Link_10_6 = Html.fromHtml(getString(R.string.Link_10_6));
        Link_10_8 = Html.fromHtml(getString(R.string.Link_10_8));
        L10_6.setText(Link_10_6);
        L10_8.setText(Link_10_8);
        L10_6.setMovementMethod(LinkMovementMethod.getInstance());
        L10_8.setMovementMethod(LinkMovementMethod.getInstance());

    }

}
