package com.example.it2_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class Survey1 extends AppCompatActivity {

    Button next;
    RadioGroup rg1,rg2,rg3,rg4,rg5,rg6,rg7,rg8,rg9,rg10;

    public static ArrayList<Question> survey = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey1);

        next = (Button)findViewById(R.id.NEXT);
        rg1 = (RadioGroup)findViewById(R.id.radioGroupQ1);
        rg2 = (RadioGroup)findViewById(R.id.radioGroupQ2);
        rg3 = (RadioGroup)findViewById(R.id.radioGroupQ3);
        rg4 = (RadioGroup)findViewById(R.id.radioGroupQ4);
        rg5 = (RadioGroup)findViewById(R.id.radioGroupQ5);
        rg6 = (RadioGroup)findViewById(R.id.radioGroupQ6);
        rg7 = (RadioGroup)findViewById(R.id.radioGroupQ7);
        rg8 = (RadioGroup)findViewById(R.id.radioGroupQ8);
        rg9 = (RadioGroup)findViewById(R.id.radioGroupQ9);
        rg10 = (RadioGroup)findViewById(R.id.radioGroupQ10);

        next.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(getApplicationContext(), Survey2.class);
                startActivity(intent1);

            }
        });


        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q1_1){
                    Question q1 = new Question("Q1", 1, true);
                    survey.set(0, q1);
                }
                else if(checkedId == R.id.Q1_2){
                    Question q1 = new Question("Q1", 2, true);
                    survey.add(q1);
                }
                else if(checkedId == R.id.Q1_3){
                    Question q1 = new Question("Q1", 3, true);
                    survey.add(q1);
                }
                else if(checkedId == R.id.Q1_4){
                    Question q1 = new Question("Q1", 4, true);
                    survey.add(q1);
                }
            }
        });


        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q2_1){
                    Question q2 = new Question("Q2", 1, true);
                    survey.add(q2);
                }
                else if(checkedId == R.id.Q2_2){
                    Question q2 = new Question("Q2", 2, true);
                    survey.add(q2);
                }
                else if(checkedId == R.id.Q2_3){
                    Question q2 = new Question("Q2", 3, true);
                    survey.add(q2);
                }
                else if(checkedId == R.id.Q2_4){
                    Question q2 = new Question("Q2", 4, true);
                    survey.add(q2);
                }
            }
        });

        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q3_1){
                    Question q3 = new Question("Q3", 1, true);
                    survey.add(q3);
                }
                else if(checkedId == R.id.Q3_2){
                    Question q3 = new Question("Q3", 2, true);
                    survey.add(q3);
                }
                else if(checkedId == R.id.Q3_3){
                    Question q3 = new Question("Q3", 3, true);
                    survey.add(q3);
                }
                else if(checkedId == R.id.Q2_4){
                    Question q3 = new Question("Q3", 4, true);
                    survey.add(q3);
                }
            }
        });








    }
}
