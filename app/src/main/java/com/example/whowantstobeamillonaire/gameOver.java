package com.example.whowantstobeamillonaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class gameOver extends AppCompatActivity {

    //defining the variables


    private Button exit,tryagain;
    private TextView mscore;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

       tryagain=(Button)findViewById(R.id.tryagain);
        exit=(Button)findViewById(R.id.exit);
        mscore=(TextView)findViewById(R.id.score);
        mscore.setText(getIntent().getStringExtra("earned"));

        //onclick listener for exit
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAndRemoveTask();

            }
        });

        //setting onclick listener for try again button

        tryagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(gameOver.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
