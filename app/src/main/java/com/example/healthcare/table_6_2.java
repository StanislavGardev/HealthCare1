package com.example.healthcare;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class table_6_2 extends AppCompatActivity {
    TextView L6_8, L6_11;
    Spanned Link_6_8, Link_6_11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_6_2);
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
        L6_8 = findViewById(R.id.tableLink_6_8);
        L6_11 = findViewById(R.id.tableLink_6_11);
        Link_6_8 = Html.fromHtml(getString(R.string.Link_6_8));
        Link_6_11 = Html.fromHtml(getString(R.string.Link_6_11));
        L6_8.setText(Link_6_8);
        L6_11.setText(Link_6_11);
        L6_8.setMovementMethod(LinkMovementMethod.getInstance());
        L6_11.setMovementMethod(LinkMovementMethod.getInstance());

    }

}
