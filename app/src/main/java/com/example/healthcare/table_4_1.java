package com.example.healthcare;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class table_4_1 extends AppCompatActivity {
    TextView L4_2, L4_3;
    Spanned Link_4_2, Link_4_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_4_1);
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
        L4_2 = findViewById(R.id.tableLink_4_2);
        L4_3 = findViewById(R.id.tableLink_4_3);
        Link_4_2 = Html.fromHtml(getString(R.string.Link_4_2));
        Link_4_3 = Html.fromHtml(getString(R.string.Link_4_3));
        L4_2.setText(Link_4_2);
        L4_3.setText(Link_4_3);
        L4_2.setMovementMethod(LinkMovementMethod.getInstance());
        L4_3.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
