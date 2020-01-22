package com.example.healthcare;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class table_5_3 extends AppCompatActivity {
    TextView L5_21, L5_23, L5_24, L5_25, L5_27, L5_28, L5_29;
    Spanned Link_5_21, Link_5_23, Link_5_24, Link_5_25, Link_5_27, Link_5_28, Link_5_29;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_5_3);
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
        L5_21 = findViewById(R.id.tableLink_5_21);
        L5_23 = findViewById(R.id.tableLink_5_23);
        L5_24 = findViewById(R.id.tableLink_5_24);
        L5_25 = findViewById(R.id.tableLink_5_25);
        L5_27 = findViewById(R.id.tableLink_5_27);
        L5_28 = findViewById(R.id.tableLink_5_28);
        L5_29 = findViewById(R.id.tableLink_5_29);
        Link_5_21 = Html.fromHtml(getString(R.string.Link_5_21));
        Link_5_23 = Html.fromHtml(getString(R.string.Link_5_23));
        Link_5_24 = Html.fromHtml(getString(R.string.Link_5_24));
        Link_5_25 = Html.fromHtml(getString(R.string.Link_5_25));
        Link_5_27 = Html.fromHtml(getString(R.string.Link_5_27));
        Link_5_28 = Html.fromHtml(getString(R.string.Link_5_28));
        Link_5_29 = Html.fromHtml(getString(R.string.Link_5_29));
        L5_21.setText(Link_5_21);
        L5_23.setText(Link_5_23);
        L5_24.setText(Link_5_24);
        L5_25.setText(Link_5_25);
        L5_27.setText(Link_5_27);
        L5_28.setText(Link_5_28);
        L5_29.setText(Link_5_29);
        L5_21.setMovementMethod(LinkMovementMethod.getInstance());
        L5_23.setMovementMethod(LinkMovementMethod.getInstance());
        L5_24.setMovementMethod(LinkMovementMethod.getInstance());
        L5_25.setMovementMethod(LinkMovementMethod.getInstance());
        L5_27.setMovementMethod(LinkMovementMethod.getInstance());
        L5_28.setMovementMethod(LinkMovementMethod.getInstance());
        L5_29.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
