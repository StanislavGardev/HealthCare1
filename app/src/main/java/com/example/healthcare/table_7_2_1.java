package com.example.healthcare;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class table_7_2_1 extends AppCompatActivity {
    TextView L7_9, L7_10, L7_11;
    Spanned Link_7_9, Link_7_10, Link_7_11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_7_2_1);
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
        L7_9 = findViewById(R.id.tableLink_7_9);
        L7_10 = findViewById(R.id.tableLink_7_10);
        L7_11 = findViewById(R.id.tableLink_7_11);
        Link_7_9 = Html.fromHtml(getString(R.string.Link_7_9));
        Link_7_10 = Html.fromHtml(getString(R.string.Link_7_10));
        Link_7_11 = Html.fromHtml(getString(R.string.Link_7_11));
        L7_9.setText(Link_7_9);
        L7_10.setText(Link_7_10);
        L7_11.setText(Link_7_11);
        L7_9.setMovementMethod(LinkMovementMethod.getInstance());
        L7_10.setMovementMethod(LinkMovementMethod.getInstance());
        L7_11.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
