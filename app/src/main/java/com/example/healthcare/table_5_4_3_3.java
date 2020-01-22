package com.example.healthcare;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class table_5_4_3_3 extends AppCompatActivity {
    TextView Link5_47, Link5_48;
    Spanned Link_5_47, Link_5_48;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_5_4_3_3);
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
        Link5_47 = findViewById(R.id.tableLink_5_47);
        Link5_48 = findViewById(R.id.tableLink_5_48);
        Link_5_47 = Html.fromHtml(getString(R.string.Link_5_47));
        Link_5_48 = Html.fromHtml(getString(R.string.Link_5_48));
        Link5_47.setText(Link_5_47);
        Link5_48.setText(Link_5_48);
        Link5_47.setMovementMethod(LinkMovementMethod.getInstance());
        Link5_48.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
