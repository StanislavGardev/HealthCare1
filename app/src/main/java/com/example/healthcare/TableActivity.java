package com.example.healthcare;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class TableActivity extends AppCompatActivity {
    TextView column0,column1,column2,column3, column4,column1_4,
    table0,table1,table2,table3,table4,table1_0,table1_1,table1_2,table1_3,table1_4,
            table2_0,table2_1,table2_2,table2_3,table2_4;

        String text_1_0,text_1_2,text_1_3,text_1_4, text_2_0,text_2_2,text_2_3;
        int   text_1_1,textLink_1_4,text_2_1,textLink_2_4;

        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        Intent secondIntent = getIntent();
//        text_1_0 = secondIntent.getStringExtra("textToLoad_1_0");
//        text_1_1 = secondIntent.getIntExtra("textToLoad_1_1",0);
//        text_1_2 = secondIntent.getStringExtra("textToLoad_1_2");
//        text_1_3 = secondIntent.getStringExtra("textToLoad_1_3");
//        text_1_4 = secondIntent.getStringExtra("textToLoad_1_4");
//           // Spanned Link_1_4 = Html.fromHtml(getString(textLink_1_4));
//            text_2_0 = secondIntent.getStringExtra("textToLoad_2_0");
//            text_2_1 = secondIntent.getIntExtra("textToLoad_2_1",0);
//            text_2_2 = secondIntent.getStringExtra("textToLoad_2_2");
//            text_2_3 = secondIntent.getStringExtra("textToLoad_2_3");
//            textLink_2_4 = secondIntent.getIntExtra("textToLoadLink_2_4",0);
//            Spanned Link_2_4 = Html.fromHtml(getString(textLink_2_4));
//
//            table0 = findViewById(R.id.table_0);
//            table1 = findViewById(R.id.table_1);
//            table2 = findViewById(R.id.table_2);
//            table3 = findViewById(R.id.table_3);
//            table4 = findViewById(R.id.table_4);
//            table1_0 = findViewById(R.id.table_1_0);
//            table1_1 = findViewById(R.id.table_1_1);
//            table1_2 = findViewById(R.id.table_1_2);
//            table1_3 = findViewById(R.id.table_1_3);
//            table1_4 = findViewById(R.id.table_1_4);
//            table2_0 = findViewById(R.id.table_2_0);
//            table2_1 = findViewById(R.id.table_2_1);
//            table2_2 = findViewById(R.id.table_2_2);
//            table2_3 = findViewById(R.id.table_2_3);
//            table2_4 = findViewById(R.id.table_2_4);
//
//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//
//            }
//
//
//        });
//
//           table0.setText(text_1_0);
//           table1.setText(text_1_1);
//           table2.setText(text_1_2);
//           table3.setText(text_1_3);
//           table4.setText(text_1_4);
//          // table4.setMovementMethod(LinkMovementMethod.getInstance());
//
//           table1_0.setText(text_2_0);
//           table1_1.setText(text_2_1);
//           table1_2.setText(text_2_2);
//           table1_3.setText(text_2_3);
//           table1_4.setText(Link_2_4);
//           table1_4.setMovementMethod(LinkMovementMethod.getInstance());
////            table2_0.setText("");
//            table2_1.setText("");
//            table2_2.setText("");
//            table2_3.setText("");
//            table2_4.setText("");




                                                        // Spanned Link = Html.fromHtml(getString(R.string.Link_8));
       // Spanned Link1 = Html.fromHtml(getString(R.string.Link_9))
                ;


        //table2_4.setText(Link);
       // table1_4.setMovementMethod(LinkMovementMethod.getInstance());
       // table2_4.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
