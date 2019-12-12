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

public class table_5_4_2_3 extends AppCompatActivity {
    TextView L5_39, L5_40;
    Spanned Link_5_39, Link_5_40;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_5_4_2_3);
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
        L5_39 = findViewById(R.id.tableLink_5_39);
        L5_40 = findViewById(R.id.tableLink_5_40);
        Link_5_39 = Html.fromHtml(getString(R.string.Link_5_39));
        Link_5_40 = Html.fromHtml(getString(R.string.Link_5_40));
        L5_39.setText(Link_5_39);
        L5_40.setText(Link_5_40);
        L5_39.setMovementMethod(LinkMovementMethod.getInstance());
        L5_40.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
