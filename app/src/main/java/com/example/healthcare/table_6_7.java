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

public class table_6_7 extends AppCompatActivity {
    TextView L6_68, L6_70, L6_71;
    Spanned Link_6_68, Link_6_70, Link_6_71;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_6_7);
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
        L6_68 = findViewById(R.id.tableLink_6_68);
        L6_70 = findViewById(R.id.tableLink_6_70);
        L6_71 = findViewById(R.id.tableLink_6_71);
        Link_6_68 = Html.fromHtml(getString(R.string.Link_6_68));
        Link_6_70 = Html.fromHtml(getString(R.string.Link_6_70));
        Link_6_71 = Html.fromHtml(getString(R.string.Link_6_71));
        L6_68.setText(Link_6_68);
        L6_70.setText(Link_6_70);
        L6_71.setText(Link_6_71);
        L6_68.setMovementMethod(LinkMovementMethod.getInstance());
        L6_70.setMovementMethod(LinkMovementMethod.getInstance());
        L6_71.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
