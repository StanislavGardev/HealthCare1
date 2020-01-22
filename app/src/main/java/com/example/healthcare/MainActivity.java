package com.example.healthcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button btn1, btn2;
TextView text;

    View zoomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




//        btn1=findViewById(R.id.button);
//        btn2=findViewById(R.id.button2);
        text=findViewById(R.id.textViewFirstText);
        text.setOnClickListener(this);
//        btn1.setOnClickListener(this);
//        btn2.setOnClickListener(this);


//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//               openScrollingActivity();
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }
    private void openScrollingActivity(){
        Intent intent = new Intent(MainActivity.this, ScrollingActivity.class );
     startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){

            case R.id.textViewFirstText:{
//                Toast.makeText(getBaseContext(), "Button1",
//                        Toast.LENGTH_LONG).show();
             intent = new Intent(MainActivity.this, Activity_2.class );
            startActivity(intent);
            break;}
//            case R.id.button2:{ intent= new Intent(MainActivity.this, ScrollingActivity.class );
//                startActivity(intent);
//                break;}

    }
}}
