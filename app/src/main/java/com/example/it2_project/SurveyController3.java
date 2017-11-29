package com.example.it2_project;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class SurveyController3 extends AppCompatActivity {

    Button finish;
    boolean questioncheck=true;
    RadioGroup rg21,rg22,rg23,rg24,rg25,rg26,rg27,rg28,rg29,rg30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey2);

        finish = (Button)findViewById(R.id.FINISH);
        rg21 = (RadioGroup)findViewById(R.id.radioGroupQ11);
        rg22 = (RadioGroup)findViewById(R.id.radioGroupQ12);
        rg23 = (RadioGroup)findViewById(R.id.radioGroupQ13);
        rg24 = (RadioGroup)findViewById(R.id.radioGroupQ14);
        rg25 = (RadioGroup)findViewById(R.id.radioGroupQ15);
        rg26 = (RadioGroup)findViewById(R.id.radioGroupQ16);
        rg27 = (RadioGroup)findViewById(R.id.radioGroupQ17);
        rg28 = (RadioGroup)findViewById(R.id.radioGroupQ18);
        rg29 = (RadioGroup)findViewById(R.id.radioGroupQ19);
        rg30 = (RadioGroup)findViewById(R.id.radioGroupQ20);


        rg21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q21_1){
                    Question q1 = new Question("Q1", 1, true);
                    SurveyList.getInstance().getSurvey().set(1, q1);
                }
                else if(checkedId == R.id.Q21_2){
                    Question q1 = new Question("Q1", 2, true);
                    SurveyList.getInstance().getSurvey().set(1, q1);
                }
                else if(checkedId == R.id.Q21_3){
                    Question q1 = new Question("Q1", 3, true);
                    SurveyList.getInstance().getSurvey().set(1, q1);
                }
                else if(checkedId == R.id.Q21_4){
                    Question q1 = new Question("Q1", 4, true);
                    SurveyList.getInstance().getSurvey().set(1, q1);
                }
            }
        });


        rg22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q22_1){
                    Question q2 = new Question("Q2", 1, true);
                    SurveyList.getInstance().getSurvey().set(2, q2);
                }
                else if(checkedId == R.id.Q22_2){
                    Question q2 = new Question("Q2", 2, true);
                    SurveyList.getInstance().getSurvey().set(2, q2);
                }
                else if(checkedId == R.id.Q12_3){
                    Question q2 = new Question("Q2", 3, true);
                    SurveyList.getInstance().getSurvey().set(2, q2);
                }
                else if(checkedId == R.id.Q12_4){
                    Question q2 = new Question("Q2", 4, true);
                    SurveyList.getInstance().getSurvey().set(2, q2);
                }
            }
        });

        rg23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q13_1){
                    Question q3 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey().set(3, q3);
                }
                else if(checkedId == R.id.Q13_2){
                    Question q3 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey().set(3, q3);
                }
                else if(checkedId == R.id.Q13_3){
                    Question q3 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey().set(3, q3);
                }
                else if(checkedId == R.id.Q13_4){
                    Question q3 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey().set(3, q3);
                }
            }
        });

        rg24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q24_1){
                    Question q4 = new Question("Q4", 1, true);
                    SurveyList.getInstance().getSurvey().set(4, q4);
                }
                else if(checkedId == R.id.Q24_2){
                    Question q4 = new Question("Q4", 2, true);
                    SurveyList.getInstance().getSurvey().set(4, q4);
                }
                else if(checkedId == R.id.Q24_3){
                    Question q4 = new Question("Q4", 3, true);
                    SurveyList.getInstance().getSurvey().set(4, q4);
                }
                else if(checkedId == R.id.Q24_4){
                    Question q4 = new Question("Q4", 4, true);
                    SurveyList.getInstance().getSurvey().set(4, q4);
                }
            }
        });

        rg25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q25_1){
                    Question q5 = new Question("Q5", 1, true);
                    SurveyList.getInstance().getSurvey().set(5, q5);
                }
                else if(checkedId == R.id.Q25_2){
                    Question q5 = new Question("Q5", 2, true);
                    SurveyList.getInstance().getSurvey().set(5, q5);
                }
                else if(checkedId == R.id.Q25_3){
                    Question q5 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey().set(5, q5);
                }
                else if(checkedId == R.id.Q25_4){
                    Question q5 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey().set(5, q5);
                }
            }
        });

        rg26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q26_1){
                    Question q6 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey().set(6, q6);
                }
                else if(checkedId == R.id.Q26_2){
                    Question q6 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey().set(6, q6);
                }
                else if(checkedId == R.id.Q26_3){
                    Question q6 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey().set(6, q6);
                }
                else if(checkedId == R.id.Q26_4){
                    Question q6 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey().set(6, q6);
                }
            }
        });

        rg27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q27_1){
                    Question q7 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey().set(7, q7);
                }
                else if(checkedId == R.id.Q27_2){
                    Question q7 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey().set(7, q7);
                }
                else if(checkedId == R.id.Q27_3){
                    Question q7 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey().set(7, q7);
                }
                else if(checkedId == R.id.Q27_4){
                    Question q7 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey().set(7, q7);                }
            }
        });
        rg28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q28_1){
                    Question q8 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey().set(8, q8);
                }
                else if(checkedId == R.id.Q28_2){
                    Question q8 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey().set(8, q8);

                }
                else if(checkedId == R.id.Q28_3){
                    Question q8 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey().set(8, q8);
                }
                else if(checkedId == R.id.Q28_4){
                    Question q8 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey().set(8, q8);

                }
            }
        });
        rg29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q29_1){
                    Question q9 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey().set(9, q9);

                }
                else if(checkedId == R.id.Q29_2){
                    Question q9 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey().set(9, q9);
                }
                else if(checkedId == R.id.Q29_3){
                    Question q9 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey().set(9, q9);
                }
                else if(checkedId == R.id.Q29_4){
                    Question q9 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey().set(9, q9);
                }
            }
        });
        rg30.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q30_1){
                    Question q10 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey().set(10, q10);
                }
                else if(checkedId == R.id.Q30_2){
                    Question q10 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey().set(10, q10);
                }
                else if(checkedId == R.id.Q30_3){
                    Question q10= new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey().set(10, q10);
                }
                else if(checkedId == R.id.Q30_4){
                    Question q10= new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey().set(10, q10);
                }
            }
        });


        finish.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {



            }
        });

    }
}
