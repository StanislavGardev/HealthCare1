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

public class table_5_4_3_1 extends AppCompatActivity {

    TextView L5_41, L5_42, L5_44;
    Spanned Link_5_41, Link_5_42, Link_5_44;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_5_4_3_1);
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
        L5_41 = findViewById(R.id.tableLink_5_41);
        L5_42 = findViewById(R.id.tableLink_5_42);
        L5_44 = findViewById(R.id.tableLink_5_44);
        Link_5_41 = Html.fromHtml(getString(R.string.Link_5_41));
        Link_5_42 = Html.fromHtml(getString(R.string.Link_5_42));
        Link_5_44 = Html.fromHtml(getString(R.string.Link_5_44));
        L5_41.setText(Link_5_41);
        L5_42.setText(Link_5_42);
        L5_44.setText(Link_5_44);
        L5_41.setMovementMethod(LinkMovementMethod.getInstance());
        L5_42.setMovementMethod(LinkMovementMethod.getInstance());
        L5_44.setMovementMethod(LinkMovementMethod.getInstance());

    }

}
