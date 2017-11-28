package com.example.it2_project;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class SurveyController2 extends AppCompatActivity {

    Button next;
    boolean questioncheck=true;
    RadioGroup rg11,rg12,rg13,rg14,rg15,rg16,rg17,rg18,rg19,rg20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey2);

        next = (Button)findViewById(R.id.NEXT2);
        rg11 = (RadioGroup)findViewById(R.id.radioGroupQ11);
        rg12 = (RadioGroup)findViewById(R.id.radioGroupQ12);
        rg13 = (RadioGroup)findViewById(R.id.radioGroupQ13);
        rg14 = (RadioGroup)findViewById(R.id.radioGroupQ14);
        rg15 = (RadioGroup)findViewById(R.id.radioGroupQ15);
        rg16 = (RadioGroup)findViewById(R.id.radioGroupQ16);
        rg17 = (RadioGroup)findViewById(R.id.radioGroupQ17);
        rg18 = (RadioGroup)findViewById(R.id.radioGroupQ18);
        rg19 = (RadioGroup)findViewById(R.id.radioGroupQ19);
        rg20 = (RadioGroup)findViewById(R.id.radioGroupQ20);


        rg11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q11_1){
                    Question q1 = new Question("Q1", 1, true);
                    SurveyList.getInstance().getSurvey().set(1, q1);
                }
                else if(checkedId == R.id.Q11_2){
                    Question q1 = new Question("Q1", 2, true);
                    SurveyList.getInstance().getSurvey().set(1, q1);
                }
                else if(checkedId == R.id.Q11_3){
                    Question q1 = new Question("Q1", 3, true);
                    SurveyList.getInstance().getSurvey().set(1, q1);
                }
                else if(checkedId == R.id.Q11_4){
                    Question q1 = new Question("Q1", 4, true);
                    SurveyList.getInstance().getSurvey().set(1, q1);
                }
            }
        });


        rg12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q12_1){
                    Question q2 = new Question("Q2", 1, true);
                    SurveyList.getInstance().getSurvey().set(2, q2);
                }
                else if(checkedId == R.id.Q12_2){
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

        rg13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

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

        rg14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q14_1){
                    Question q4 = new Question("Q4", 1, true);
                    SurveyList.getInstance().getSurvey().set(4, q4);
                }
                else if(checkedId == R.id.Q14_2){
                    Question q4 = new Question("Q4", 2, true);
                    SurveyList.getInstance().getSurvey().set(4, q4);
                }
                else if(checkedId == R.id.Q14_3){
                    Question q4 = new Question("Q4", 3, true);
                    SurveyList.getInstance().getSurvey().set(4, q4);
                }
                else if(checkedId == R.id.Q14_4){
                    Question q4 = new Question("Q4", 4, true);
                    SurveyList.getInstance().getSurvey().set(4, q4);
                }
            }
        });

        rg15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q15_1){
                    Question q5 = new Question("Q5", 1, true);
                    SurveyList.getInstance().getSurvey().set(5, q5);
                }
                else if(checkedId == R.id.Q15_2){
                    Question q5 = new Question("Q5", 2, true);
                    SurveyList.getInstance().getSurvey().set(5, q5);
                }
                else if(checkedId == R.id.Q15_3){
                    Question q5 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey().set(5, q5);
                }
                else if(checkedId == R.id.Q15_4){
                    Question q5 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey().set(5, q5);
                }
            }
        });

        rg16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q16_1){
                    Question q6 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey().set(6, q6);
                }
                else if(checkedId == R.id.Q16_2){
                    Question q6 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey().set(6, q6);
                }
                else if(checkedId == R.id.Q16_3){
                    Question q6 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey().set(6, q6);
                }
                else if(checkedId == R.id.Q16_4){
                    Question q6 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey().set(6, q6);
                }
            }
        });

        rg17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q17_1){
                    Question q7 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey().set(7, q7);
                }
                else if(checkedId == R.id.Q17_2){
                    Question q7 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey().set(7, q7);
                }
                else if(checkedId == R.id.Q17_3){
                    Question q7 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey().set(7, q7);
                }
                else if(checkedId == R.id.Q17_4){
                    Question q7 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey().set(7, q7);                }
            }
        });
        rg18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q18_1){
                    Question q8 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey().set(8, q8);
                }
                else if(checkedId == R.id.Q18_2){
                    Question q8 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey().set(8, q8);

                }
                else if(checkedId == R.id.Q18_3){
                    Question q8 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey().set(8, q8);
                }
                else if(checkedId == R.id.Q18_4){
                    Question q8 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey().set(8, q8);

                }
            }
        });
        rg19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q19_1){
                    Question q9 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey().set(9, q9);

                }
                else if(checkedId == R.id.Q19_2){
                    Question q9 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey().set(9, q9);
                }
                else if(checkedId == R.id.Q19_3){
                    Question q9 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey().set(9, q9);
                }
                else if(checkedId == R.id.Q19_4){
                    Question q9 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey().set(9, q9);
                }
            }
        });
        rg20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q20_1){
                    Question q10 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey().set(10, q10);
                }
                else if(checkedId == R.id.Q20_2){
                    Question q10 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey().set(10, q10);
                }
                else if(checkedId == R.id.Q20_3){
                    Question q10= new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey().set(10, q10);
                }
                else if(checkedId == R.id.Q20_4){
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
                    AlertDialog.Builder alert = new AlertDialog.Builder(SurveyController2.this);
                    alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    alert.setMessage("설문조사가 완료되지 않았습니다.");
                    alert.show();
                }
                else{
                    Intent intent1 = new Intent(getApplicationContext(), SurveyController3.class);
                    startActivity(intent1);
                }



            }
        });






    }
}
