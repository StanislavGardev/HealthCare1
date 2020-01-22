package com.example.healthcare;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class table_5_4_2_2 extends AppCompatActivity {
    TextView L5_33, L5_37;
    Spanned Link_5_33, Link_5_37;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_5_4_2_2);
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
        L5_33 = findViewById(R.id.tableLink_5_33);
        L5_37 = findViewById(R.id.tableLink_5_37);
        Link_5_33 = Html.fromHtml(getString(R.string.Link_5_33));
        Link_5_37 = Html.fromHtml(getString(R.string.Link_5_37));
        L5_33.setText(Link_5_33);
        L5_37.setText(Link_5_37);
        L5_33.setMovementMethod(LinkMovementMethod.getInstance());
        L5_37.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
