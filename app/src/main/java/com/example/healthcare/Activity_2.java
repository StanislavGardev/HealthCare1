package com.example.healthcare;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_2 extends AppCompatActivity implements View.OnClickListener{
    ImageButton btn3,btn3_2,btn4,btn5,btn6;
    TextView row0,row1,row2,row3,row3_1,row3_2, row3_2_1,row3_2_2,row3_3,row4;
    LinearLayout Layout3_1, Layout3_2, Layout3_2_1, Layout3_2_2,Layout3_3;

    private boolean openMenu3 =false,openMenu3_2 =false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        row0=findViewById(R.id.textViewRow0);
        row1=findViewById(R.id.textViewRow1);
        row2=findViewById(R.id.textViewRow2);
        row3=findViewById(R.id.textViewRow3);
        row3_1=findViewById(R.id.textViewRow3_1);
        row3_2_1 =findViewById(R.id.textViewRow3_2_1);

        btn3=findViewById(R.id.imageButton3);
        btn3_2=findViewById(R.id.imageButton3_2);

        Layout3_1 =findViewById(R.id.layout3_1);
        Layout3_2 =findViewById(R.id.layout3_2);
        Layout3_2_1 =findViewById(R.id.layout3_2_1);
        Layout3_2_2 =findViewById(R.id.layout3_2_2);
        Layout3_3 =findViewById(R.id.layout3_3);

        btn3.setOnClickListener(this);
        btn3_2.setOnClickListener(this);

        row0.setOnClickListener(this);
        row1.setOnClickListener(this);
        row2.setOnClickListener(this);
        row3.setOnClickListener(this);
        row3_1.setOnClickListener(this);
        row3_2_1.setOnClickListener(this);
      //  btn2.setOnClickListener(this);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onClick(View v) {



        switch (v.getId()) {

            case R.id.textViewRow0:{
                Intent intent;

                intent = new Intent(Activity_2.this, ScrollingActivity.class );
                intent.putExtra("textToLoad",R.string.this_is_new);
                startActivity(intent);
                // ScrollingActivity.text.setText(R.string.this_is_new);
                break;
            }
            case R.id.textViewRow1:{
                Intent intent;
                intent = new Intent(Activity_2.this, ScrollingActivity.class );
                intent.putExtra("textToLoad",R.string.informationForThisVer);
                startActivity(intent);               // ScrollingActivity.text.setText(R.string.informationForThosVer);
                break;
            }
            case R.id.textViewRow2:{
                Intent intent;
                intent = new Intent(Activity_2.this, ScrollingActivity.class );
                intent.putExtra("textToLoad",R.string.introduction);
                startActivity(intent);               // ScrollingActivity.text.setText(R.string.informationForThosVer);
                break;
            }
//
            case R.id.imageButton3: {
                if(!openMenu3){
                    btn3.setImageResource(R.drawable.icon_minus);
                    Layout3_1.setVisibility(View.VISIBLE);
                    Layout3_2.setVisibility(View.VISIBLE);
                    Layout3_3.setVisibility(View.VISIBLE);
                    openMenu3 =true;
                }
                else {
                    btn3.setImageResource(R.drawable.icon_plus);
                    btn3_2.setImageResource(R.drawable.icon_plus);
                    Layout3_1.setVisibility(View.GONE);
                    Layout3_2.setVisibility(View.GONE);
                    Layout3_3.setVisibility(View.GONE);
                    Layout3_2_1.setVisibility(View.GONE);
                    Layout3_2_2.setVisibility(View.GONE);
                    openMenu3 =false;
                    openMenu3_2 =false;
                    //   btn1.setVisibility(View.INVISIBLE);
                }

                Toast.makeText(getBaseContext(), "Отваря се  подменю",
                        Toast.LENGTH_LONG).show();


                break;
            }
            case R.id.imageButton3_2: {
                if(!openMenu3_2){
                    btn3_2.setImageResource(R.drawable.icon_minus);

                    Layout3_2_1.setVisibility(View.VISIBLE);
                    Layout3_2_2.setVisibility(View.VISIBLE);
                    openMenu3_2 =true;
                }
                else {
                    btn3_2.setImageResource(R.drawable.icon_plus);
                    Layout3_2_1.setVisibility(View.GONE);
                    Layout3_2_2.setVisibility(View.GONE);

                    openMenu3_2 =false;
                    //   btn1.setVisibility(View.INVISIBLE);
                }

                Toast.makeText(getBaseContext(), "Отваря се  подменю",
                        Toast.LENGTH_LONG).show();


                break;
            }
            case R.id.textViewRow3_1: {
                Intent intent;
                intent = new Intent(Activity_2.this, ScrollingActivity.class );
                intent.putExtra("textToLoad",R.string.epidemiology);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow3_2_1: {
                Intent intent;
                intent = new Intent(Activity_2.this, TableActivity.class );
               intent.putExtra("textToLoad1",R.string.title_3_2_2);
                intent.putExtra("textToLoad4",R.string.Link_8);
                startActivity(intent);
                break;
            }


        }
    }
}
