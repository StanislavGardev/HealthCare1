package com.example.healthcare;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class table_5_1 extends AppCompatActivity {
    TextView L5_2, L5_3, L5_4, L5_5, L5_6;
    Spanned Link_5_2, Link_5_3, Link_5_4, Link_5_5, Link_5_6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_5_1);
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
        L5_2 = findViewById(R.id.tableLink_5_2);
        L5_3 = findViewById(R.id.tableLink_5_3);
        L5_4 = findViewById(R.id.tableLink_5_4);
        L5_5 = findViewById(R.id.tableLink_5_5);
        L5_6 = findViewById(R.id.tableLink_5_6);
        Link_5_2 = Html.fromHtml(getString(R.string.Link_5_2));
        Link_5_3 = Html.fromHtml(getString(R.string.Link_5_3));
        Link_5_4 = Html.fromHtml(getString(R.string.Link_5_4));
        Link_5_5 = Html.fromHtml(getString(R.string.Link_5_5));
        Link_5_6 = Html.fromHtml(getString(R.string.Link_5_6));
        L5_2.setText(Link_5_2);
        L5_3.setText(Link_5_3);
        L5_4.setText(Link_5_4);
        L5_5.setText(Link_5_5);
        L5_6.setText(Link_5_6);
        L5_2.setMovementMethod(LinkMovementMethod.getInstance());
        L5_3.setMovementMethod(LinkMovementMethod.getInstance());
        L5_4.setMovementMethod(LinkMovementMethod.getInstance());
        L5_5.setMovementMethod(LinkMovementMethod.getInstance());
        L5_6.setMovementMethod(LinkMovementMethod.getInstance());

    }

}
