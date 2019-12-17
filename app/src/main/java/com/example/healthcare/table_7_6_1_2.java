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

public class table_7_6_1_2 extends AppCompatActivity {
    TextView L7_55, L7_56;
    Spanned Link_7_55, Link_7_56;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_7_6_1_2);
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
        L7_55 = findViewById(R.id.tableLink_7_55);
        L7_56 = findViewById(R.id.tableLink_7_56);
        Link_7_55 = Html.fromHtml(getString(R.string.Link_7_55));
        Link_7_56 = Html.fromHtml(getString(R.string.Link_7_56));
        L7_55.setText(Link_7_55);
        L7_56.setText(Link_7_56);
        L7_55.setMovementMethod(LinkMovementMethod.getInstance());
        L7_56.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
