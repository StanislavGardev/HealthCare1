package com.example.healthcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Activity_2 extends AppCompatActivity implements View.OnClickListener{
    ImageButton btn3,btn3_2,btn4,btn5,btn5_2,btn5_4,btn5_4_2,btn5_4_3,btn6,
            btn6_3, btn6_3_3, btn6_4, btn6_4_5, btn7, btn7_2, btn7_4, btn7_4_3, btn7_6, btn7_6_1, btn8, btn8_1, btn8_2, btn8_3, btn9, btn9_1, btn9_2, btn9_3
            ,btn10,btn10_1,btn10_2,btn11,btn13,btn14;

    TextView row0, row1, row2, row3, row3_1, row3_2, row3_2_1, row3_2_2, row3_3, row4_1, row5_1, row5_2, row5_2_1, row5_2_2, row5_3,
            row5_4, row5_4_1, row5_4_2, row5_4_2_1, row5_4_2_2, row5_4_2_3, row5_4_3, row5_4_3_1, row5_4_3_2, row5_4_3_3, row5_4_3_4, row5_4_4, row6_1,
            row6_2, row6_3_1, row6_3_2, row6_3_3_1, row6_3_3_2, row6_3_4, row6_3_5, row6_4_1, row6_4_2, row6_4_3, row6_4_4, row6_4_5, row6_4_5_1, row6_4_5_2, row6_4_5_3, row6_4_6, row6_5, row6_6, row6_7,
            row7, row7_1, row7_2, row7_2_1, row7_2_2, row7_2_3, row7_3, row7_4, row7_4_1, row7_4_2, row7_4_3, row7_4_3_1, row7_4_3_2, row7_5, row7_6, row7_6_1, row7_6_1_1,
            row7_6_1_2, row7_6_1_3, row7_6_1_4, row7_6_2, row8, row8_1, row8_2, row8_3, row9_1, row9_2, row9_3, row10_1, row10_2, row11, row12, row13;

    LinearLayout Layout3_1, Layout3_2, Layout3_2_1, Layout3_2_2,Layout3_3,Layout4_1,Layout5_1,
            Layout5_2,Layout5_2_1,Layout5_2_2,Layout5_3,Layout5_4,Layout5_4_1,Layout5_4_2,Layout5_4_2_1,
            Layout5_4_2_2,Layout5_4_2_3,Layout5_4_3,Layout5_4_3_1,Layout5_4_3_2,Layout5_4_3_3,Layout5_4_3_4,Layout5_4_4,
           Layout6_1, Layout6_2, Layout6_3,Layout6_3_1,Layout6_3_2,Layout6_3_3,Layout6_3_3_1,Layout6_3_3_2,Layout6_3_4,Layout6_3_5,
            Layout6_4, Layout6_4_1, Layout6_4_2, Layout6_4_3, Layout6_4_4, Layout6_4_5, Layout6_4_5_1, Layout6_4_5_2, Layout6_4_5_3, Layout6_4_6, Layout6_5, Layout6_6, Layout6_7,
            Layout7_1, Layout7_2,Layout7_2_1,Layout7_2_2,Layout7_2_3,Layout7_3,Layout7_4,Layout7_4_1,Layout7_4_2,Layout7_4_3,Layout7_4_3_1,Layout7_4_3_2
            ,Layout7_5,Layout7_6,Layout7_6_1,Layout7_6_1_1,Layout7_6_1_2,Layout7_6_1_3,Layout7_6_1_4,Layout7_6_2,
    Layout8,Layout8_1,Layout8_2,Layout8_3,Layout9,Layout9_1,Layout9_2,Layout9_3,Layout10,Layout10_1,Layout10_2,Layout11,Layout12,Layout13;

    private boolean openMenu3 =false,openMenu3_2 =false,openMenu4 =false,openMenu5 =false,openMenu5_2 =false,
            openMenu5_4 = false, openMenu5_4_2 = false, openMenu5_4_3 = false, openMenu6 = false, openMenu6_3 = false, openMenu6_3_3 = false, openMenu6_4 = false, openMenu6_4_5 = false,
            openMenu7,openMenu7_2,openMenu7_4,openMenu7_4_3,openMenu7_6,openMenu7_6_1,openMenu8,openMenu9,openMenu10;
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
        row3_2_2 =findViewById(R.id.textViewRow3_2_2);
        row3_3 =findViewById(R.id.textViewRow3_3);
        row4_1 =findViewById(R.id.textViewRow4_1);
        row5_1 =findViewById(R.id.textViewRow5_1);
        row5_2 =findViewById(R.id.textViewRow5_2);
        row5_2_1 = findViewById(R.id.textViewRow5_2_1);
        row5_2_2 = findViewById(R.id.textViewRow5_2_2);
        row5_3 = findViewById(R.id.textViewRow5_3);
        row5_4 = findViewById(R.id.textViewRow5_4);
        row5_4_1 = findViewById(R.id.textViewRow5_4_1);
        row5_4_2 = findViewById(R.id.textViewRow5_4_2);
        row5_4_2_1 = findViewById(R.id.textViewRow5_4_2_1);
        row5_4_2_2 = findViewById(R.id.textViewRow5_4_2_2);
        row5_4_2_3 = findViewById(R.id.textViewRow5_4_2_3);
        row5_4_3 = findViewById(R.id.textViewRow5_4_3);
        row5_4_3_1 = findViewById(R.id.textViewRow5_4_3_1);
        row5_4_3_2 = findViewById(R.id.textViewRow5_4_3_2);
        row5_4_3_3 = findViewById(R.id.textViewRow5_4_3_3);
        row5_4_3_4 = findViewById(R.id.textViewRow5_4_3_4);
        row5_4_4 = findViewById(R.id.textViewRow5_4_4);
        row6_1 = findViewById(R.id.textViewRow6_1);
        row6_2 = findViewById(R.id.textViewRow6_2);
        row6_3_1 = findViewById(R.id.textViewRow6_3_1);
        row6_3_2 = findViewById(R.id.textViewRow6_3_2);
        row6_3_3_1 = findViewById(R.id.textViewRow6_3_3_1);
        row6_3_3_2 = findViewById(R.id.textViewRow6_3_3_2);
        row6_3_4 = findViewById(R.id.textViewRow6_3_4);
        row6_3_5 = findViewById(R.id.textViewRow6_3_5);
        row6_4_1 = findViewById(R.id.textViewRow6_4_1);
        row6_4_2 = findViewById(R.id.textViewRow6_4_2);
        row6_4_3 = findViewById(R.id.textViewRow6_4_3);
        row6_4_4 = findViewById(R.id.textViewRow6_4_4);
        row6_4_5 = findViewById(R.id.textViewRow6_4_5);
        row6_4_5_1 = findViewById(R.id.textViewRow6_4_5_1);
        row6_4_5_2 = findViewById(R.id.textViewRow6_4_5_2);
        row6_4_5_3 = findViewById(R.id.textViewRow6_4_5_3);
        row6_4_6 = findViewById(R.id.textViewRow6_4_6);
        row6_5 = findViewById(R.id.textViewRow6_5);
        row6_6 = findViewById(R.id.textViewRow6_6);
        row6_7 = findViewById(R.id.textViewRow6_7);
        row6_7 = findViewById(R.id.textViewRow6_7);
        row7 = findViewById(R.id.textViewRow7);
        row7_1 = findViewById(R.id.textViewRow7_1);
        row7_2 = findViewById(R.id.textViewRow7_2);
        row7_2_1 = findViewById(R.id.textViewRow7_2_1);
        row7_2_2 = findViewById(R.id.textViewRow7_2_2);
        row7_2_3 = findViewById(R.id.textViewRow7_2_3);
        row7_3 = findViewById(R.id.textViewRow7_3);
        row7_4 = findViewById(R.id.textViewRow7_4);
        row7_4_1 = findViewById(R.id.textViewRow7_4_1);
        row7_4_2 = findViewById(R.id.textViewRow7_4_2);
        row7_4_3 = findViewById(R.id.textViewRow7_4_3);
        row7_4_3_1 = findViewById(R.id.textViewRow7_4_3_1);
        row7_4_3_2 = findViewById(R.id.textViewRow7_4_3_2);
        row7_5 = findViewById(R.id.textViewRow7_5);
        row7_6 = findViewById(R.id.textViewRow7_6);
        row7_6_1 = findViewById(R.id.textViewRow7_6_1);
        row7_6_1_1 = findViewById(R.id.textViewRow7_6_1_1);
        row7_6_1_2 = findViewById(R.id.textViewRow7_6_1_2);
        row7_6_1_3 = findViewById(R.id.textViewRow7_6_1_3);
        row7_6_1_4 = findViewById(R.id.textViewRow7_6_1_4);
        row7_6_2 = findViewById(R.id.textViewRow7_6_2);
        row8 = findViewById(R.id.textViewRow8);
        row8_1 = findViewById(R.id.textViewRow8_1);
        row8_2 = findViewById(R.id.textViewRow8_2);
        row8_3 = findViewById(R.id.textViewRow8_3);
        row9_1 = findViewById(R.id.textViewRow9_1);
        row9_2 = findViewById(R.id.textViewRow9_2);
        row9_3 = findViewById(R.id.textViewRow9_3);
        row10_1 = findViewById(R.id.textViewRow10_1);
        row10_2 = findViewById(R.id.textViewRow10_2);
        row11 = findViewById(R.id.textViewRow11);
        row13 = findViewById(R.id.textViewRow12);

        btn3=findViewById(R.id.imageButton3);
        btn3_2=findViewById(R.id.imageButton3_2);
        btn4=findViewById(R.id.imageButton4);
        btn5=findViewById(R.id.imageButton5);
        btn5_2=findViewById(R.id.imageButton5_2);
        btn5_4=findViewById(R.id.imageButton5_4);
        btn5_4_2=findViewById(R.id.imageButton5_4_2);
        btn5_4_3=findViewById(R.id.imageButton5_4_3);
        btn6=findViewById(R.id.imageButton6);
        btn6_3=findViewById(R.id.imageButton6_3);
        btn6_3_3=findViewById(R.id.imageButton6_3_3);
        btn6_4=findViewById(R.id.imageButton6_4);
        btn6_4_5 = findViewById(R.id.imageButton6_4_5);
        btn7=findViewById(R.id.imageButton7);
        btn7_2=findViewById(R.id.imageButton7_2);
        btn7_4=findViewById(R.id.imageButton7_4);
        btn7_4_3=findViewById(R.id.imageButton7_4_3);
        btn7_6=findViewById(R.id.imageButton7_6);
        btn7_6_1=findViewById(R.id.imageButton7_6_1);
        btn8=findViewById(R.id.imageButton8);
        btn9=findViewById(R.id.imageButton9);
        btn10=findViewById(R.id.imageButton10);


        Layout3_1 = findViewById(R.id.layout3_1);
        Layout3_2 = findViewById(R.id.layout3_2);
        Layout3_2_1 = findViewById(R.id.layout3_2_1);
        Layout3_2_2 = findViewById(R.id.layout3_2_2);
        Layout3_3 = findViewById(R.id.layout3_3);
        Layout4_1 = findViewById(R.id.layout4_1);
        Layout5_1 = findViewById(R.id.layout5_1);
        Layout5_2 = findViewById(R.id.layout5_2);
        Layout5_2_1 = findViewById(R.id.layout5_2_1);
        Layout5_2_2 = findViewById(R.id.layout5_2_2);
        Layout5_3 = findViewById(R.id.layout5_3);
        Layout5_4 = findViewById(R.id.layout5_4);
        Layout5_4_1 = findViewById(R.id.layout5_4_1);
        Layout5_4_2 = findViewById(R.id.layout5_4_2);
        Layout5_4_2_1 = findViewById(R.id.layout5_4_2_1);
        Layout5_4_2_2 = findViewById(R.id.layout5_4_2_2);
        Layout5_4_2_3 = findViewById(R.id.layout5_4_2_3);
        Layout5_4_3 = findViewById(R.id.layout5_4_3);
        Layout5_4_3_1 = findViewById(R.id.layout5_4_3_1);
        Layout5_4_3_2 = findViewById(R.id.layout5_4_3_2);
        Layout5_4_3_3 = findViewById(R.id.layout5_4_3_3);
        Layout5_4_3_4 = findViewById(R.id.layout5_4_3_4);
        Layout5_4_4 = findViewById(R.id.layout5_4_4);
        Layout6_1 = findViewById(R.id.layout6_1);
        Layout6_2 = findViewById(R.id.layout6_2);
        Layout6_3 = findViewById(R.id.layout6_3);
        Layout6_3_1 = findViewById(R.id.layout6_3_1);
        Layout6_3_2 = findViewById(R.id.layout6_3_2);
        Layout6_3_3 = findViewById(R.id.layout6_3_3);
        Layout6_3_3_1 = findViewById(R.id.layout6_3_3_1);
        Layout6_3_3_2 = findViewById(R.id.layout6_3_3_2);
        Layout6_3_4 = findViewById(R.id.layout6_3_4);
        Layout6_3_5 = findViewById(R.id.layout6_3_5);
        Layout6_4 = findViewById(R.id.layout6_4);
        Layout6_4_1 = findViewById(R.id.layout6_4_1);
        Layout6_4_2 = findViewById(R.id.layout6_4_2);
        Layout6_4_3 = findViewById(R.id.layout6_4_3);
        Layout6_4_4 = findViewById(R.id.layout6_4_4);
        Layout6_4_5 = findViewById(R.id.layout6_4_5);
        Layout6_4_5_1 = findViewById(R.id.layout6_4_5_1);
        Layout6_4_5_2 = findViewById(R.id.layout6_4_5_2);
        Layout6_4_5_3 = findViewById(R.id.layout6_4_5_3);
        Layout6_4_6 = findViewById(R.id.layout6_4_6);
        Layout6_5 = findViewById(R.id.layout6_5);
        Layout6_6 = findViewById(R.id.layout6_6);
        Layout6_7 = findViewById(R.id.layout6_7);
        Layout7_1 = findViewById(R.id.layout7_1);
        Layout7_2 = findViewById(R.id.layout7_2);
        Layout7_2_1 = findViewById(R.id.layout7_2_1);
        Layout7_2_2 = findViewById(R.id.layout7_2_2);
        Layout7_2_3 = findViewById(R.id.layout7_2_3);
        Layout7_3 = findViewById(R.id.layout7_3);
        Layout7_4 = findViewById(R.id.layout7_4);
        Layout7_4_1 = findViewById(R.id.layout7_4_1);
        Layout7_4_2 = findViewById(R.id.layout7_4_2);
        Layout7_4_3 = findViewById(R.id.layout7_4_3);
        Layout7_4_3_1 = findViewById(R.id.layout7_4_3_1);
        Layout7_4_3_2 = findViewById(R.id.layout7_4_3_2);
        Layout7_5 = findViewById(R.id.layout7_5);
        Layout7_6 = findViewById(R.id.layout7_6);
        Layout7_6_1 = findViewById(R.id.layout7_6_1);
        Layout7_6_1_1 = findViewById(R.id.layout7_6_1_1);
        Layout7_6_1_2 = findViewById(R.id.layout7_6_1_2);
        Layout7_6_1_3 = findViewById(R.id.layout7_6_1_3);
        Layout7_6_1_4 = findViewById(R.id.layout7_6_1_4);
        Layout7_6_2 = findViewById(R.id.layout7_6_2);
        Layout8 = findViewById(R.id.layout8);
        Layout8_1 = findViewById(R.id.layout8_1);
        Layout8_2 = findViewById(R.id.layout8_2);
        Layout8_3 = findViewById(R.id.layout8_3);
        Layout9 = findViewById(R.id.layout9);
        Layout9_1 = findViewById(R.id.layout9_1);
        Layout9_2 = findViewById(R.id.layout9_2);
        Layout9_3 = findViewById(R.id.layout9_3);
        Layout10 = findViewById(R.id.layout10);
        Layout10_1 = findViewById(R.id.layout10_1);
        Layout10_2 = findViewById(R.id.layout10_2);
        Layout11 = findViewById(R.id.layout11);
        Layout12 = findViewById(R.id.layout12);


        btn3.setOnClickListener(this);
        btn3_2.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn5_2.setOnClickListener(this);
        btn5_4.setOnClickListener(this);
        btn5_4_2.setOnClickListener(this);
        btn5_4_3.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn6_3.setOnClickListener(this);
        btn6_3_3.setOnClickListener(this);
        btn6_4.setOnClickListener(this);
        btn6_4_5.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn7_2.setOnClickListener(this);
        btn7_4.setOnClickListener(this);
        btn7_4_3.setOnClickListener(this);
        btn7_6.setOnClickListener(this);
        btn7_6_1.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);


        row0.setOnClickListener(this);
        row1.setOnClickListener(this);
        row2.setOnClickListener(this);
        row3.setOnClickListener(this);
        row3_1.setOnClickListener(this);
        row3_2_1.setOnClickListener(this);
        row3_2_2.setOnClickListener(this);
        row3_3.setOnClickListener(this);
        row4_1.setOnClickListener(this);
        row5_1.setOnClickListener(this);
        row5_2.setOnClickListener(this);
        row5_2_1.setOnClickListener(this);
        row5_2_2.setOnClickListener(this);
        row5_3.setOnClickListener(this);
        row5_4.setOnClickListener(this);
        row5_4_1.setOnClickListener(this);
        row5_4_2.setOnClickListener(this);
        row5_4_2_1.setOnClickListener(this);
        row5_4_2_2.setOnClickListener(this);
        row5_4_2_3.setOnClickListener(this);
        row5_4_3.setOnClickListener(this);
        row5_4_3_1.setOnClickListener(this);
        row5_4_3_2.setOnClickListener(this);
        row5_4_3_3.setOnClickListener(this);
        row5_4_3_4.setOnClickListener(this);
        row5_4_4.setOnClickListener(this);
        row6_1.setOnClickListener(this);
        row6_2.setOnClickListener(this);
        row6_3_1.setOnClickListener(this);
        row6_3_2.setOnClickListener(this);
        row6_3_3_1.setOnClickListener(this);
        row6_3_3_2.setOnClickListener(this);
        row6_3_4.setOnClickListener(this);
        row6_3_5.setOnClickListener(this);
        row6_4_1.setOnClickListener(this);
        row6_4_2.setOnClickListener(this);
        row6_4_3.setOnClickListener(this);
        row6_4_4.setOnClickListener(this);
        row6_4_5.setOnClickListener(this);
        row6_4_5_1.setOnClickListener(this);
        row6_4_5_2.setOnClickListener(this);
        row6_4_5_3.setOnClickListener(this);
        row6_4_6.setOnClickListener(this);
        row6_5.setOnClickListener(this);
        row6_6.setOnClickListener(this);
        row6_7.setOnClickListener(this);
        row7.setOnClickListener(this);
        row7_1.setOnClickListener(this);
        row7_2.setOnClickListener(this);
        row7_2_1.setOnClickListener(this);
        row7_2_2.setOnClickListener(this);
        row7_2_3.setOnClickListener(this);
        row7_3.setOnClickListener(this);
        row7_4.setOnClickListener(this);
        row7_4_1.setOnClickListener(this);
        row7_4_2.setOnClickListener(this);
        row7_4_3.setOnClickListener(this);
        row7_4_3_1.setOnClickListener(this);
        row7_4_3_2.setOnClickListener(this);
        row7_5.setOnClickListener(this);
        row7_6.setOnClickListener(this);
        row7_6_1.setOnClickListener(this);
        row7_6_1_1.setOnClickListener(this);
        row7_6_1_2.setOnClickListener(this);
        row7_6_1_3.setOnClickListener(this);
        row7_6_1_4.setOnClickListener(this);
        row7_6_2.setOnClickListener(this);
        row8.setOnClickListener(this);
        row8_1.setOnClickListener(this);
        row8_2.setOnClickListener(this);
        row8_3.setOnClickListener(this);
        row9_1.setOnClickListener(this);
        row9_2.setOnClickListener(this);
        row9_3.setOnClickListener(this);
        row10_1.setOnClickListener(this);
        row10_2.setOnClickListener(this);
        row11.setOnClickListener(this);
        row13.setOnClickListener(this);


//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
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
            case R.id.imageButton3:
            case R.id.textViewRow3: {
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

                }




                break;
            }
            case R.id.imageButton3_2:
            case R.id.textViewRow3_2: {
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
                                    }
                break;
            }
            case R.id.imageButton4:
            case R.id.textViewRow4: {
                if(!openMenu4){
                    btn4.setImageResource(R.drawable.icon_minus);
                    Layout4_1.setVisibility(View.VISIBLE);
                    openMenu4 =true;
                }
                else {
                    btn4.setImageResource(R.drawable.icon_plus);
                    Layout4_1.setVisibility(View.GONE);
                    openMenu4 =false;
                                }
                break;
            }
            case R.id.imageButton5:
            case R.id.textViewRow5: {
                if(!openMenu5){
                    btn5.setImageResource(R.drawable.icon_minus);
                    Layout5_1.setVisibility(View.VISIBLE);
                    Layout5_2.setVisibility(View.VISIBLE);
                    Layout5_3.setVisibility(View.VISIBLE);
                    Layout5_4.setVisibility(View.VISIBLE);
                    openMenu5 =true;
                }
                else {
                    btn5.setImageResource(R.drawable.icon_plus);
                    btn5_2.setImageResource(R.drawable.icon_plus);
                    btn5_4.setImageResource(R.drawable.icon_plus);
                    btn5_4_2.setImageResource(R.drawable.icon_plus);
                    btn5_4_3.setImageResource(R.drawable.icon_plus);
                    Layout5_1.setVisibility(View.GONE);
                    Layout5_2.setVisibility(View.GONE);
                    Layout5_2_1.setVisibility(View.GONE);
                    Layout5_2_2.setVisibility(View.GONE);
                    Layout5_3.setVisibility(View.GONE);
                    Layout5_4.setVisibility(View.GONE);
                    Layout5_4_1.setVisibility(View.GONE);
                    Layout5_4_2.setVisibility(View.GONE);
                    Layout5_4_2_1.setVisibility(View.GONE);
                    Layout5_4_2_2.setVisibility(View.GONE);
                    Layout5_4_2_3.setVisibility(View.GONE);
                    Layout5_4_3.setVisibility(View.GONE);
                    Layout5_4_3_1.setVisibility(View.GONE);
                    Layout5_4_3_2.setVisibility(View.GONE);
                    Layout5_4_3_3.setVisibility(View.GONE);
                    Layout5_4_3_4.setVisibility(View.GONE);
                    Layout5_4_4.setVisibility(View.GONE);
                    openMenu5 =false;
                    openMenu5_2 =false;
                    openMenu5_4 =false;
                    openMenu5_4_2=false;
                    openMenu5_4_3 =false;
                }
                break;
            }
            case R.id.imageButton5_2: {
                if(!openMenu5_2){
                    btn5_2.setImageResource(R.drawable.icon_minus);
                    Layout5_2_1.setVisibility(View.VISIBLE);
                    Layout5_2_2.setVisibility(View.VISIBLE);
                    openMenu5_2=true;
                }
                else {
                    btn5_2.setImageResource(R.drawable.icon_plus);
                    Layout5_2_1.setVisibility(View.GONE);
                    Layout5_2_2.setVisibility(View.GONE);
                    openMenu5_2 =false;
                }
                break;
            }
            case R.id.imageButton5_4:
            case R.id.textViewRow5_4: {
                if(!openMenu5_4){
                    btn5_4.setImageResource(R.drawable.icon_minus);
                    Layout5_4_1.setVisibility(View.VISIBLE);
                    Layout5_4_2.setVisibility(View.VISIBLE);
                    Layout5_4_3.setVisibility(View.VISIBLE);
                    Layout5_4_4.setVisibility(View.VISIBLE);
                    openMenu5_4=true;
                }
                else {
                    btn5_4.setImageResource(R.drawable.icon_plus);
                    btn5_4_2.setImageResource(R.drawable.icon_plus);
                    btn5_4_3.setImageResource(R.drawable.icon_plus);
                    Layout5_4_1.setVisibility(View.GONE);
                    Layout5_4_2.setVisibility(View.GONE);
                    Layout5_4_2_1.setVisibility(View.GONE);
                    Layout5_4_2_2.setVisibility(View.GONE);
                    Layout5_4_2_3.setVisibility(View.GONE);
                    Layout5_4_3.setVisibility(View.GONE);
                    Layout5_4_3_1.setVisibility(View.GONE);
                    Layout5_4_3_2.setVisibility(View.GONE);
                    Layout5_4_3_3.setVisibility(View.GONE);
                    Layout5_4_3_4.setVisibility(View.GONE);
                    Layout5_4_4.setVisibility(View.GONE);
                    openMenu5_4 =false;
                    openMenu5_4_2 =false;
                    openMenu5_4_3 =false;
                }
                break;
            }
            case R.id.imageButton5_4_2:
            case R.id.textViewRow5_4_2: {
                if(!openMenu5_4_2){
                    btn5_4_2.setImageResource(R.drawable.icon_minus);
                    Layout5_4_2_1.setVisibility(View.VISIBLE);
                    Layout5_4_2_2.setVisibility(View.VISIBLE);
                    Layout5_4_2_3.setVisibility(View.VISIBLE);

                    openMenu5_4_2=true;
                }
                else {
                    btn5_4_2.setImageResource(R.drawable.icon_plus);

                    Layout5_4_2_1.setVisibility(View.GONE);
                    Layout5_4_2_2.setVisibility(View.GONE);
                    Layout5_4_2_3.setVisibility(View.GONE);

                    openMenu5_4_2 =false;

                }
                break;
            }
            case R.id.imageButton5_4_3:
            case R.id.textViewRow5_4_3: {
                if(!openMenu5_4_3){
                    btn5_4_3.setImageResource(R.drawable.icon_minus);
                    Layout5_4_3_1.setVisibility(View.VISIBLE);
                    Layout5_4_3_2.setVisibility(View.VISIBLE);
                    Layout5_4_3_3.setVisibility(View.VISIBLE);
                    Layout5_4_3_4.setVisibility(View.VISIBLE);
                    openMenu5_4_3=true;
                }
                else {
                    btn5_4_3.setImageResource(R.drawable.icon_plus);

                    Layout5_4_3_1.setVisibility(View.GONE);
                    Layout5_4_3_2.setVisibility(View.GONE);
                    Layout5_4_3_3.setVisibility(View.GONE);
                    Layout5_4_3_4.setVisibility(View.GONE);

                    openMenu5_4_3 =false;

                }
                break;
            }
            case R.id.imageButton6:
            case R.id.textViewRow6: {
                if(!openMenu6){

                    btn6.setImageResource(R.drawable.icon_minus);

                    Layout6_1.setVisibility(View.VISIBLE);
                    Layout6_2.setVisibility(View.VISIBLE);
                    Layout6_3.setVisibility(View.VISIBLE);
                    Layout6_4.setVisibility(View.VISIBLE);
                    Layout6_5.setVisibility(View.VISIBLE);
                    Layout6_6.setVisibility(View.VISIBLE);
                    Layout6_7.setVisibility(View.VISIBLE);
                    openMenu6 =true;
                }
                else {
                    btn6.setImageResource(R.drawable.icon_plus);
                    btn6_3.setImageResource(R.drawable.icon_plus);
                    btn6_3_3.setImageResource(R.drawable.icon_plus);
                    btn6_4.setImageResource(R.drawable.icon_plus);

                    Layout6_1.setVisibility(View.GONE);
                    Layout6_2.setVisibility(View.GONE);
                    Layout6_3.setVisibility(View.GONE);
                    Layout6_3_1.setVisibility(View.GONE);
                    Layout6_3_2.setVisibility(View.GONE);
                    Layout6_3_3.setVisibility(View.GONE);
                    Layout6_3_3_1.setVisibility(View.GONE);
                    Layout6_3_3_2.setVisibility(View.GONE);
                    Layout6_3_4.setVisibility(View.GONE);
                    Layout6_3_5.setVisibility(View.GONE);
                    Layout6_4.setVisibility(View.GONE);
                    Layout6_4_1.setVisibility(View.GONE);
                    Layout6_4_2.setVisibility(View.GONE);
                    Layout6_4_3.setVisibility(View.GONE);
                    Layout6_4_4.setVisibility(View.GONE);
                    Layout6_4_5.setVisibility(View.GONE);
                    Layout6_4_5_1.setVisibility(View.GONE);
                    Layout6_4_5_2.setVisibility(View.GONE);
                    Layout6_4_5_3.setVisibility(View.GONE);
                    Layout6_4_6.setVisibility(View.GONE);
                    Layout6_5.setVisibility(View.GONE);
                    Layout6_6.setVisibility(View.GONE);
                    Layout6_7.setVisibility(View.GONE);

                    openMenu6 =false;
                    openMenu6_3 =false;
                    openMenu6_3_3 =false;
                    openMenu6_4 =false;

                }
                break;
            }
            case R.id.imageButton6_3:
            case R.id.textViewRow6_3: {
                if(!openMenu6_3){
                    btn6_3.setImageResource(R.drawable.icon_minus);
                    Layout6_3_1.setVisibility(View.VISIBLE);
                    Layout6_3_2.setVisibility(View.VISIBLE);
                    Layout6_3_3.setVisibility(View.VISIBLE);
                    Layout6_3_4.setVisibility(View.VISIBLE);
                    Layout6_3_5.setVisibility(View.VISIBLE);
                    openMenu6_3 =true;
                }
                else {
                    btn6_3.setImageResource(R.drawable.icon_plus);
                    btn6_3_3.setImageResource(R.drawable.icon_plus);
                    Layout6_3_1.setVisibility(View.GONE);
                    Layout6_3_2.setVisibility(View.GONE);
                    Layout6_3_3.setVisibility(View.GONE);
                    Layout6_3_3_1.setVisibility(View.GONE);
                    Layout6_3_3_2.setVisibility(View.GONE);
                    Layout6_3_4.setVisibility(View.GONE);
                    Layout6_3_5.setVisibility(View.GONE);
                    openMenu6_3 =false;
                    openMenu6_3_3 =false;
                }
                break;
            }
            case R.id.imageButton6_3_3:
            case R.id.textViewRow6_3_3: {
                if(!openMenu6_3_3){
                    btn6_3_3.setImageResource(R.drawable.icon_minus);
                    Layout6_3_3_1.setVisibility(View.VISIBLE);
                    Layout6_3_3_2.setVisibility(View.VISIBLE);
                    openMenu6_3_3 =true;
                }
                else {

                    btn6_3_3.setImageResource(R.drawable.icon_plus);
                    Layout6_3_3_1.setVisibility(View.GONE);
                    Layout6_3_3_2.setVisibility(View.GONE);
                    openMenu6_3_3 =false;
                }
                break;
            }
            case R.id.imageButton6_4:
            case R.id.textViewRow6_4: {
                if(!openMenu6_4){
                    btn6_4.setImageResource(R.drawable.icon_minus);
                    Layout6_4_1.setVisibility(View.VISIBLE);
                    Layout6_4_2.setVisibility(View.VISIBLE);
                    Layout6_4_3.setVisibility(View.VISIBLE);
                    Layout6_4_4.setVisibility(View.VISIBLE);
                    Layout6_4_5.setVisibility(View.VISIBLE);
                    Layout6_4_6.setVisibility(View.VISIBLE);
                    openMenu6_4 =true;
                } else {
                    btn6_4.setImageResource(R.drawable.icon_plus);
                    btn6_4_5.setImageResource(R.drawable.icon_plus);
                    Layout6_4_1.setVisibility(View.GONE);
                    Layout6_4_2.setVisibility(View.GONE);
                    Layout6_4_3.setVisibility(View.GONE);
                    Layout6_4_4.setVisibility(View.GONE);
                    Layout6_4_5.setVisibility(View.GONE);
                    Layout6_4_6.setVisibility(View.GONE);
                    Layout6_4_5_1.setVisibility(View.GONE);
                    Layout6_4_5_2.setVisibility(View.GONE);
                    Layout6_4_5_3.setVisibility(View.GONE);
                    openMenu6_4 =false;

                }
                break;
            }
            case R.id.imageButton6_4_5:
            case R.id.textViewRow6_4_5: {
                if (!openMenu6_4_5) {
                    btn6_4_5.setImageResource(R.drawable.icon_minus);
                    Layout6_4_5_1.setVisibility(View.VISIBLE);
                    Layout6_4_5_2.setVisibility(View.VISIBLE);
                    Layout6_4_5_3.setVisibility(View.VISIBLE);
                    openMenu6_4_5 = true;
                } else {

                    btn6_4_5.setImageResource(R.drawable.icon_plus);
                    Layout6_4_5_1.setVisibility(View.GONE);
                    Layout6_4_5_2.setVisibility(View.GONE);
                    Layout6_4_5_3.setVisibility(View.GONE);
                    openMenu6_4_5 = false;
                }
                break;
            }
            case R.id.imageButton7:
            case R.id.textViewRow7: {
                if(!openMenu7){

                    btn7.setImageResource(R.drawable.icon_minus);

                    Layout7_1.setVisibility(View.VISIBLE);
                    Layout7_2.setVisibility(View.VISIBLE);
                    Layout7_3.setVisibility(View.VISIBLE);
                    Layout7_4.setVisibility(View.VISIBLE);
                    Layout7_5.setVisibility(View.VISIBLE);
                    Layout7_6.setVisibility(View.VISIBLE);

                    openMenu7 =true;
                }
                else {
                    btn7.setImageResource(R.drawable.icon_plus);
                    btn7_2.setImageResource(R.drawable.icon_plus);
                    btn7_4.setImageResource(R.drawable.icon_plus);
                    btn7_4_3.setImageResource(R.drawable.icon_plus);
                    btn7_6.setImageResource(R.drawable.icon_plus);
                    btn7_6_1.setImageResource(R.drawable.icon_plus);

                    Layout7_1.setVisibility(View.GONE);
                    Layout7_2.setVisibility(View.GONE);
                    Layout7_2_1.setVisibility(View.GONE);
                    Layout7_2_2.setVisibility(View.GONE);
                    Layout7_2_3.setVisibility(View.GONE);
                    Layout7_3.setVisibility(View.GONE);
                    Layout7_4.setVisibility(View.GONE);
                    Layout7_4_1.setVisibility(View.GONE);
                    Layout7_4_2.setVisibility(View.GONE);
                    Layout7_4_3.setVisibility(View.GONE);
                    Layout7_4_3_1.setVisibility(View.GONE);
                    Layout7_4_3_2.setVisibility(View.GONE);
                    Layout7_5.setVisibility(View.GONE);
                    Layout7_6.setVisibility(View.GONE);
                    Layout7_6_1.setVisibility(View.GONE);
                    Layout7_6_1_1.setVisibility(View.GONE);
                    Layout7_6_1_2.setVisibility(View.GONE);
                    Layout7_6_1_3.setVisibility(View.GONE);
                    Layout7_6_1_4.setVisibility(View.GONE);
                    Layout7_6_2.setVisibility(View.GONE);

                    openMenu7 =false;
                    openMenu7_2 =false;
                    openMenu7_4 =false;
                    openMenu7_4_3 =false;
                    openMenu7_6=false;

                }
                break;
            }
            case R.id.imageButton7_2: {
                if(!openMenu7_2){
                    btn7_2.setImageResource(R.drawable.icon_minus);
                    Layout7_2_1.setVisibility(View.VISIBLE);
                    Layout7_2_2.setVisibility(View.VISIBLE);
                    Layout7_2_3.setVisibility(View.VISIBLE);
                    openMenu7_2 =true;
                }
                else {

                    btn7_2.setImageResource(R.drawable.icon_plus);
                    Layout7_2_1.setVisibility(View.GONE);
                    Layout7_2_2.setVisibility(View.GONE);
                    Layout7_2_3.setVisibility(View.GONE);
                    openMenu7_2 =false;
                }
                break;
            }
            case R.id.imageButton7_4: {
                if(!openMenu7_4){
                    btn7_4.setImageResource(R.drawable.icon_minus);
                    Layout7_4_1.setVisibility(View.VISIBLE);
                    Layout7_4_2.setVisibility(View.VISIBLE);
                    Layout7_4_3.setVisibility(View.VISIBLE);
                    openMenu7_4 =true;
                }
                else {

                    btn7_4.setImageResource(R.drawable.icon_plus);
                    btn7_4_3.setImageResource(R.drawable.icon_plus);
                    Layout7_4_1.setVisibility(View.GONE);
                    Layout7_4_2.setVisibility(View.GONE);
                    Layout7_4_3.setVisibility(View.GONE);
                    Layout7_4_3_1.setVisibility(View.GONE);
                    Layout7_4_3_2.setVisibility(View.GONE);
                    openMenu7_4 =false;
                    openMenu7_4_3 =false;
                }
                break;
            }
            case R.id.imageButton7_4_3:
            case R.id.textViewRow7_4_3: {
                if(!openMenu7_4_3){
                    btn7_4_3.setImageResource(R.drawable.icon_minus);
                    Layout7_4_3_1.setVisibility(View.VISIBLE);
                    Layout7_4_3_2.setVisibility(View.VISIBLE);
                    openMenu7_4_3 =true;
                }
                else {

                    btn7_4_3.setImageResource(R.drawable.icon_plus);
                    Layout7_4_3_1.setVisibility(View.GONE);
                    Layout7_4_3_2.setVisibility(View.GONE);
                    openMenu7_4_3 =false;
                }
                break;
            }
            case R.id.imageButton7_6: {
                if(!openMenu7_6){
                    btn7_6.setImageResource(R.drawable.icon_minus);
                    Layout7_6_1.setVisibility(View.VISIBLE);
                    Layout7_6_2.setVisibility(View.VISIBLE);
                    Layout7_2_3.setVisibility(View.VISIBLE);
                    openMenu7_6 =true;
                }
                else {

                    btn7_6.setImageResource(R.drawable.icon_plus);
                    btn7_6_1.setImageResource(R.drawable.icon_plus);
                    Layout7_6_1.setVisibility(View.GONE);
                    Layout7_6_2.setVisibility(View.GONE);
                    Layout7_6_1_1.setVisibility(View.GONE);
                    Layout7_6_1_2.setVisibility(View.GONE);
                    Layout7_6_1_3.setVisibility(View.GONE);
                    Layout7_6_1_4.setVisibility(View.GONE);
                    openMenu7_6 =false;
                    openMenu7_6_1 =false;
                }
                break;
            }
            case R.id.imageButton7_6_1:
            case R.id.textViewRow7_6_1: {
                if(!openMenu7_6_1){
                    btn7_6_1.setImageResource(R.drawable.icon_minus);
                    Layout7_6_1_1.setVisibility(View.VISIBLE);
                    Layout7_6_1_2.setVisibility(View.VISIBLE);
                    Layout7_6_1_3.setVisibility(View.VISIBLE);
                    Layout7_6_1_4.setVisibility(View.VISIBLE);
                    openMenu7_6_1 =true;
                }
                else {
                    btn7_6_1.setImageResource(R.drawable.icon_plus);
                    Layout7_6_1_1.setVisibility(View.GONE);
                    Layout7_6_1_2.setVisibility(View.GONE);
                    Layout7_6_1_3.setVisibility(View.GONE);
                    Layout7_6_1_4.setVisibility(View.GONE);
                    openMenu7_6_1 =false;
                }
                break;
            }
            case R.id.imageButton8:
            case R.id.textViewRow8: {
                if(!openMenu8){
                    btn8.setImageResource(R.drawable.icon_minus);
                    Layout8_1.setVisibility(View.VISIBLE);
                    Layout8_2.setVisibility(View.VISIBLE);
                    Layout8_3.setVisibility(View.VISIBLE);
                    openMenu8 =true;
                }
                else {

                    btn8.setImageResource(R.drawable.icon_plus);
                    Layout8_1.setVisibility(View.GONE);
                    Layout8_2.setVisibility(View.GONE);
                    Layout8_3.setVisibility(View.GONE);
                    openMenu8 =false;
                }
                break;
            }
            case R.id.imageButton9:
            case R.id.textViewRow9: {
                if(!openMenu9){
                    btn9.setImageResource(R.drawable.icon_minus);
                    Layout9_1.setVisibility(View.VISIBLE);
                    Layout9_2.setVisibility(View.VISIBLE);
                    Layout9_3.setVisibility(View.VISIBLE);
                    openMenu9 =true;
                }
                else {

                    btn9.setImageResource(R.drawable.icon_plus);
                    Layout9_1.setVisibility(View.GONE);
                    Layout9_2.setVisibility(View.GONE);
                    Layout9_3.setVisibility(View.GONE);
                    openMenu9 =false;
                }
                break;
            }
            case R.id.imageButton10:
            case R.id.textViewRow10: {
                if(!openMenu10){
                    btn10.setImageResource(R.drawable.icon_minus);
                    Layout10_1.setVisibility(View.VISIBLE);
                    Layout10_2.setVisibility(View.VISIBLE);
                    openMenu10 =true;
                }
                else {

                    btn10.setImageResource(R.drawable.icon_plus);
                    Layout10_1.setVisibility(View.GONE);
                    Layout10_2.setVisibility(View.GONE);
                    openMenu10 =false;
                }
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
                intent = new Intent(Activity_2.this, table_3_2_1.class );
//                intent.putExtra("textToLoad_1_0","3.1");
//                 intent.putExtra("textToLoad_1_1",R.string.text3_1);
//                intent.putExtra("textToLoad_1_2","A");
//               intent.putExtra("textToLoad_1_3","4");
//                intent.putExtra("textToLoad_1_4","EK");
//                intent.putExtra("textToLoad_2_0","3.2");
//                intent.putExtra("textToLoad_2_1",R.string.text3_2);
//                intent.putExtra("textToLoad_2_2","A");
//                intent.putExtra("textToLoad_2_3","2++");
//                intent.putExtra("textToLoadLink_2_4",R.string.Link_8);
               startActivity(intent);
                break;
            }
            case R.id.textViewRow3_2_2: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_3_2_2.class );
//                intent.putExtra("textToLoad_2_0","0");
//                intent.putExtra("textToLoad_2_1",R.string.text3_2_2);
//                intent.putExtra("textToLoad_2_2","A");
//                intent.putExtra("textToLoad_2_3","2++");
//                intent.putExtra("textToLoadLink_2_0",R.string.Link_8);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow3_3: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_3_3.class );

                startActivity(intent);
                break;
            }
            case R.id.textViewRow4_1: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_4_1.class );
                startActivity(intent);
                break;
            }
            case R.id.textViewRow5_1: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_5_1.class );
                startActivity(intent);
                break;
            }
            case R.id.textViewRow5_2: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_5_2.class );
                startActivity(intent);
                break;
            }
            case R.id.textViewRow5_2_1: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_5_2_1.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow5_2_2: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_5_2_2.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow5_3: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_5_3.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow5_4_1: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_5_4_1.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow5_4_2_1: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_5_4_2_1.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow5_4_2_2: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_5_4_2_2.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow5_4_2_3: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_5_4_2_3.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow5_4_3_1: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_5_4_3_1.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow5_4_3_2: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_5_4_3_2.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow5_4_3_3: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_5_4_3_3.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow5_4_3_4: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_5_4_3_4.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow5_4_4: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_5_4_4.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow6_1: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_6_1.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow6_2: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_6_2.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow6_3_1: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_6_3_1.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow6_3_2: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_6_3_2.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow6_3_3_1: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_6_3_3_1.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow6_3_3_2: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_6_3_3_2.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow6_3_4: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_6_3_4.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow6_3_5: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_6_3_5.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow6_4_1: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_6_4_1.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow6_4_2: {
                Intent intent;
                intent = new Intent(Activity_2.this, table6_4_2.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow6_4_3: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_6_4_3.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow6_4_4: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_6_4_4.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow6_4_5_1: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_6_4_5_1.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow6_4_5_2: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_6_4_5_2.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow6_4_5_3: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_6_4_5_3.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow6_4_6: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_6_4_6.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow6_5: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_6_5.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow6_6: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_6_6.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow6_7: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_6_7.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow7_1: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_7_1.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow7_2: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_7_2.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow7_2_1: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_7_2_1.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow7_2_2: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_7_2_2.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow7_2_3: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_7_2_3.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow7_3: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_7_3.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow7_4: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_7_4.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow7_4_1: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_7_4_1.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow7_4_2: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_7_4_2.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow7_4_3_1: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_7_4_3_1.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow7_4_3_2: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_7_4_3_2.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow7_5: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_7_5.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow7_6: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_7_6.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow7_6_1_1: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_7_6_1_1.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow7_6_1_2: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_7_6_1_2.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow7_6_1_3: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_7_6_1_3.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow7_6_1_4: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_7_6_1_4.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow7_6_2: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_7_6_2.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow8_1: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_8_1.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow8_2: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_8_2.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow8_3: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_8_3.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow9_1: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_9_1.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow9_2: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_9_2.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow9_3: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_9_3.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow10_1: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_10_1.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow10_2: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_10_2.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow11: {
                Intent intent;
                intent = new Intent(Activity_2.this, Table_11.class);
                startActivity(intent);
                break;
            }
            case R.id.textViewRow12: {
                Intent intent;
                intent = new Intent(Activity_2.this, table_13.class);
                startActivity(intent);
                break;
            }


        }
    }
}
