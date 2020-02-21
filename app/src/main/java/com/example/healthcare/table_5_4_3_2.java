package com.example.healthcare;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class table_5_4_3_2 extends AppCompatActivity {
    Spanned Link_5_46;
    TextView text_5_4_6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_5_4_3_2);
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
        text_5_4_6 = findViewById(R.id.table_1_1);
        Link_5_46 = Html.fromHtml(getString(R.string.text5_46));
        text_5_4_6.setText(Link_5_46);
        text_5_4_6.setMovementMethod(LinkMovementMethod.getInstance());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
