package com.example.it2_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SurveyController1 extends AppCompatActivity {

    Button next;
    boolean questioncheck=true;
    RadioGroup rg1,rg2,rg3,rg4,rg5,rg6,rg7,rg8,rg9,rg10;

    //public static ArrayList<Question> survey = new ArrayList<>();

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


        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q1_1){
                    Question q1 = new Question("Q1", 1, true);
                    SurveyList.getInstance().getSurvey().set(1, q1);
                }
                else if(checkedId == R.id.Q1_2){
                    Question q1 = new Question("Q1", 2, true);
                    SurveyList.getInstance().getSurvey().set(1, q1);
                }
                else if(checkedId == R.id.Q1_3){
                    Question q1 = new Question("Q1", 3, true);
                    SurveyList.getInstance().getSurvey().set(1, q1);
                }
                else if(checkedId == R.id.Q1_4){
                    Question q1 = new Question("Q1", 4, true);
                    SurveyList.getInstance().getSurvey().set(1, q1);
                }
            }
        });


        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q2_1){
                    Question q2 = new Question("Q2", 1, true);
                    SurveyList.getInstance().getSurvey().set(2, q2);
                }
                else if(checkedId == R.id.Q2_2){
                    Question q2 = new Question("Q2", 2, true);
                    SurveyList.getInstance().getSurvey().set(2, q2);
                }
                else if(checkedId == R.id.Q2_3){
                    Question q2 = new Question("Q2", 3, true);
                    SurveyList.getInstance().getSurvey().set(2, q2);
                }
                else if(checkedId == R.id.Q2_4){
                    Question q2 = new Question("Q2", 4, true);
                    SurveyList.getInstance().getSurvey().set(2, q2);
                }
            }
        });

        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q3_1){
                    Question q3 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey().set(3, q3);
                }
                else if(checkedId == R.id.Q3_2){
                    Question q3 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey().set(3, q3);
                }
                else if(checkedId == R.id.Q3_3){
                    Question q3 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey().set(3, q3);
                }
                else if(checkedId == R.id.Q3_4){
                    Question q3 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey().set(3, q3);
                }
            }
        });

        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q4_1){
                    Question q4 = new Question("Q4", 1, true);
                    SurveyList.getInstance().getSurvey().set(4, q4);
                }
                else if(checkedId == R.id.Q4_2){
                    Question q4 = new Question("Q4", 2, true);
                    SurveyList.getInstance().getSurvey().set(4, q4);
                }
                else if(checkedId == R.id.Q4_3){
                    Question q4 = new Question("Q4", 3, true);
                    SurveyList.getInstance().getSurvey().set(4, q4);
                }
                else if(checkedId == R.id.Q4_4){
                    Question q4 = new Question("Q4", 4, true);
                    SurveyList.getInstance().getSurvey().set(4, q4);
                }
            }
        });

        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q5_1){
                    Question q5 = new Question("Q5", 1, true);
                    SurveyList.getInstance().getSurvey().set(5, q5);
                }
                else if(checkedId == R.id.Q5_2){
                    Question q5 = new Question("Q5", 2, true);
                    SurveyList.getInstance().getSurvey().set(5, q5);
                }
                else if(checkedId == R.id.Q5_3){
                    Question q5 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey().set(5, q5);
                }
                else if(checkedId == R.id.Q5_4){
                    Question q5 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey().set(5, q5);
                }
            }
        });

        rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q6_1){
                    Question q6 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey().set(6, q6);
                }
                else if(checkedId == R.id.Q6_2){
                    Question q6 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey().set(6, q6);
                }
                else if(checkedId == R.id.Q6_3){
                    Question q6 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey().set(6, q6);
                }
                else if(checkedId == R.id.Q6_4){
                    Question q6 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey().set(6, q6);
                }
            }
        });

        rg7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q7_1){
                    Question q7 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey().set(7, q7);
                }
                else if(checkedId == R.id.Q7_2){
                    Question q7 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey().set(7, q7);
                }
                else if(checkedId == R.id.Q7_3){
                    Question q7 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey().set(7, q7);
                }
                else if(checkedId == R.id.Q7_4){
                    Question q7 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey().set(7, q7);                }
            }
        });
        rg8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q8_1){
                    Question q8 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey().set(8, q8);
                }
                else if(checkedId == R.id.Q8_2){
                    Question q8 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey().set(8, q8);

                }
                else if(checkedId == R.id.Q8_3){
                    Question q8 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey().set(8, q8);
                }
                else if(checkedId == R.id.Q8_4){
                    Question q8 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey().set(8, q8);

                }
            }
        });
        rg9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q9_1){
                    Question q9 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey().set(9, q9);

                }
                else if(checkedId == R.id.Q9_2){
                    Question q9 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey().set(9, q9);
                }
                else if(checkedId == R.id.Q9_3){
                    Question q9 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey().set(9, q9);
                }
                else if(checkedId == R.id.Q9_4){
                    Question q9 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey().set(9, q9);
                }
            }
        });
        rg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q10_1){
                    Question q10 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey().set(10, q10);
                }
                else if(checkedId == R.id.Q10_2){
                    Question q10 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey().set(10, q10);
                }
                else if(checkedId == R.id.Q10_3){
                    Question q10= new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey().set(10, q10);
                }
                else if(checkedId == R.id.Q10_4){
                    Question q10= new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey().set(10, q10);
                }
            }
        });


        next.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                for(int i=1; i<=10;i++){
                    if(SurveyList.getInstance().getSurvey().get(i).isQuestionCheck()==false){
                        questioncheck=false;

                    }

                }

                if(questioncheck==false){
                    for(int i=0;i<=10;i++){
                        if(SurveyList.getInstance().getSurvey().get(i).getSelection()==1){
                            //RadioButton radiobutton1=findViewById(R.id.Q1_1);
                        }
                        else if(SurveyList.getInstance().getSurvey().get(i).getSelection()==2){
                            //RadioButton radiobutton
                        }

                    }
                }


                Intent intent1 = new Intent(getApplicationContext(), SurveyController2.class);
                startActivity(intent1);

            }
        });






    }


}
