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
    ImageButton btn1,btn2,btn3,btn4,btn5,btn6;
    TextView row0,row1,row2,row3,row3_1,row3_2,row321,row322,row3_3,row4;
    LinearLayout Leyout1_2,Leyout1_3;
    private boolean openMenu=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        row0=findViewById(R.id.textViewRow0);
        row1=findViewById(R.id.textViewRow1);
        row2=findViewById(R.id.textViewRow2);
        btn1=findViewById(R.id.imageButton);

        btn1=findViewById(R.id.imageButton);
        btn1=findViewById(R.id.imageButton);
        btn1=findViewById(R.id.imageButton);
        btn1=findViewById(R.id.imageButton);

        Leyout1_2=findViewById(R.id.layout2);
        Leyout1_3=findViewById(R.id.layout3);

        btn1.setOnClickListener(this);
        row0.setOnClickListener(this);
        row1.setOnClickListener(this);
        row2.setOnClickListener(this);
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


//
            case R.id.imageButton: {
                if(!openMenu){
                    btn1.setImageResource(R.drawable.icon_minus);
                    Leyout1_2.setVisibility(View.VISIBLE);
                    Leyout1_3.setVisibility(View.VISIBLE);
                    openMenu=true;
                }
                else {
                    btn1.setImageResource(R.drawable.icon_plus);
                    Leyout1_2.setVisibility(View.GONE);
                    Leyout1_3.setVisibility(View.GONE);
                    openMenu=false;
                    //   btn1.setVisibility(View.INVISIBLE);
                }

                Toast.makeText(getBaseContext(), "Отваря се  подменю",
                        Toast.LENGTH_LONG).show();


                break;
            }
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
                intent.putExtra("textToLoad",R.string.informationForThosVer);
                startActivity(intent);               // ScrollingActivity.text.setText(R.string.informationForThosVer);
                break;
        }

        }
    }
}
