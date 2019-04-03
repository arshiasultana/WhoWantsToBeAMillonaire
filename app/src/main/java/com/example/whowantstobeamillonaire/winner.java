package com.example.whowantstobeamillonaire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class winner extends AppCompatActivity {

    //defining the variables

    private TextView winner;
    private Button exit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);

        winner=(TextView)findViewById(R.id.winner);
        exit=(Button)findViewById(R.id.exit);

        //onclick listener for exit
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAndRemoveTask();

            }
        });

    }
}
