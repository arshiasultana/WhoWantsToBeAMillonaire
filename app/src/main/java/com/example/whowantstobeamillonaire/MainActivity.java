package com.example.whowantstobeamillonaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   //creating variables

    private TextView msg;
    private ImageView strt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assigning values to variables usind ids

        msg=(TextView)findViewById(R.id.message);
        strt=(ImageView)findViewById(R.id.start);


        strt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,question1.class);
                startActivity(intent);
            }
        });




    }
}
