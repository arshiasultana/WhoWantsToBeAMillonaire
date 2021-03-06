package com.example.whowantstobeamillonaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class question2 extends AppCompatActivity {


    //defining the variables

    private TextView mscore, mquestion2;
    private RadioGroup mradioGroup;
    private RadioButton manswer1,manswer2,manswer3,manswer4;
    private Button mconfirm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        mscore=(TextView)findViewById(R.id.score);

        //getting the score from previous screen
        mscore.setText(getIntent().getStringExtra("YOU EARNED"));
        mquestion2=(TextView)findViewById(R.id.question2);
        mradioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        manswer1=(RadioButton)findViewById(R.id.answer1);
        manswer2=(RadioButton)findViewById(R.id.answer2);
        manswer3=(RadioButton)findViewById(R.id.answer3);
        manswer4=(RadioButton)findViewById(R.id.answer4);
        mconfirm=(Button)findViewById(R.id.confirm);

        //getting the score from previous page
       //String scr=mscore.getText().toString();


        //setting onclick listener for confirm button
        mconfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(manswer3.isChecked()){

                    //if the answer is correct,go to next activity
                    mscore.setText("YOU EARNED: $250");

                    Toast.makeText(getApplicationContext(), "Correct answer", Toast.LENGTH_LONG).show();
                    String scr=mscore.getText().toString();
                    Intent intent = new Intent(question2.this,question3.class);

                    intent.putExtra("YOU EARNED: $250",scr);
                    startActivity(intent);
                }

                else{

                    //go to game over activity
                    Toast.makeText(getApplicationContext(), "Wrong answer", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(question2.this,gameOver.class);
                    String scr=mscore.getText().toString();
                    intent.putExtra("earned",scr);

                    startActivity(intent);



                }

            }
        });




    }
}

