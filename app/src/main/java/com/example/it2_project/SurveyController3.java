package com.example.it2_project;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SurveyController3 extends AppCompatActivity {

    Button finish;
    boolean questioncheck=true;
    RadioGroup rg21,rg22,rg23,rg24,rg25,rg26,rg27,rg28,rg29,rg30;

    HexagonGraph hexagonGraph;
    double hexFac1=0;
    double hexFac2=0;
    double hexFac3=0;
    double hexFac4=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey3);
        Log.d("gyurie", "SC3");

        //final Student nowStudent=(Student)getIntent().getSerializableExtra("student_key");
        hexFac1=SurveyController1.nowStudent.getHistory().get(SurveyController1.nowStudent.getHistory().size()-1).getQT1();
        hexFac2=SurveyController1.nowStudent.getHistory().get(SurveyController1.nowStudent.getHistory().size()-1).getQT2();
        hexFac3=SurveyController1.nowStudent.getHistory().get(SurveyController1.nowStudent.getHistory().size()-1).getQT3();
        hexFac4=SurveyController1.nowStudent.getHistory().get(SurveyController1.nowStudent.getHistory().size()-1).getQT4();
        Log.d("gyurie", "안녕");
        finish = (Button)findViewById(R.id.FINISH);
        rg21 = (RadioGroup)findViewById(R.id.radioGroupQ21);
        rg22 = (RadioGroup)findViewById(R.id.radioGroupQ22);
        rg23 = (RadioGroup)findViewById(R.id.radioGroupQ23);
        rg24 = (RadioGroup)findViewById(R.id.radioGroupQ24);
        rg25 = (RadioGroup)findViewById(R.id.radioGroupQ25);
        rg26 = (RadioGroup)findViewById(R.id.radioGroupQ26);
        rg27 = (RadioGroup)findViewById(R.id.radioGroupQ27);
        rg28 = (RadioGroup)findViewById(R.id.radioGroupQ28);
        rg29 = (RadioGroup)findViewById(R.id.radioGroupQ29);
        rg30 = (RadioGroup)findViewById(R.id.radioGroupQ30);
        Log.d("gyurie", "안녕2");


        rg21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q21_1){
                    Question q21 = new Question("Q1", 1, true);
                    SurveyList.getInstance().getSurvey()[21]=q21;
                    hexFac2=hexFac2+1;
                }
                else if(checkedId == R.id.Q21_2){
                    Question q21 = new Question("Q1", 2, true);
                    SurveyList.getInstance().getSurvey()[21]=q21;
                    hexFac2=hexFac2+2;
                }
                else if(checkedId == R.id.Q21_3){
                    Question q21 = new Question("Q1", 3, true);
                    SurveyList.getInstance().getSurvey()[21]=q21;
                    hexFac2=hexFac2+3;
                }
                else if(checkedId == R.id.Q21_4){
                    Question q21 = new Question("Q1", 4, true);
                    SurveyList.getInstance().getSurvey()[21]=q21;
                    hexFac2=hexFac2+4;
                }

            }
        });


        rg22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q22_1){
                    Question q22 = new Question("Q2", 1, true);
                    SurveyList.getInstance().getSurvey()[22]=q22;
                    hexFac4=hexFac4+1;
                }
                else if(checkedId == R.id.Q22_2){
                    Question q22 = new Question("Q2", 2, true);
                    SurveyList.getInstance().getSurvey()[22]=q22;
                    hexFac4=hexFac4+2;
                }
                else if(checkedId == R.id.Q22_3){
                    Question q22 = new Question("Q2", 3, true);
                    SurveyList.getInstance().getSurvey()[22]=q22;
                    hexFac4=hexFac4+3;
                }
                else if(checkedId == R.id.Q22_4){
                    Question q22 = new Question("Q2", 4, true);
                    SurveyList.getInstance().getSurvey()[22]=q22;
                    hexFac4=hexFac4+4;
                }
            }
        });

        rg23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q23_1){
                    Question q23 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey()[23]=q23;
                    hexFac2=hexFac2+1;
                }
                else if(checkedId == R.id.Q23_2){
                    Question q23 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey()[23]=q23;
                    hexFac2=hexFac2+2;
                }
                else if(checkedId == R.id.Q23_3){
                    Question q23 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey()[23]=q23;
                    hexFac2=hexFac2+3;
                }
                else if(checkedId == R.id.Q23_4){
                    Question q23 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey()[23]=q23;
                    hexFac2=hexFac2+4;
                }
            }
        });

        rg24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q24_1){
                    Question q24 = new Question("Q4", 1, true);
                    SurveyList.getInstance().getSurvey()[24]=q24;
                    hexFac2=hexFac2+1;
                }
                else if(checkedId == R.id.Q24_2){
                    Question q24 = new Question("Q4", 2, true);
                    SurveyList.getInstance().getSurvey()[24]=q24;
                    hexFac2=hexFac2+2;
                }
                else if(checkedId == R.id.Q24_3){
                    Question q24 = new Question("Q4", 3, true);
                    SurveyList.getInstance().getSurvey()[24]=q24;
                    hexFac2=hexFac2+3;
                }
                else if(checkedId == R.id.Q24_4){
                    Question q24 = new Question("Q4", 4, true);
                    SurveyList.getInstance().getSurvey()[24]=q24;
                    hexFac2=hexFac2+4;
                }
            }
        });

        rg25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q25_1){
                    Question q25 = new Question("Q5", 1, true);
                    SurveyList.getInstance().getSurvey()[25]=q25;
                    hexFac4=hexFac4+1;
                }
                else if(checkedId == R.id.Q25_2){
                    Question q25 = new Question("Q5", 2, true);
                    SurveyList.getInstance().getSurvey()[25]=q25;
                    hexFac4=hexFac4+2;
                }
                else if(checkedId == R.id.Q25_3){
                    Question q25 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey()[25]=q25;
                    hexFac4=hexFac4+3;
                }
                else if(checkedId == R.id.Q25_4){
                    Question q25 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey()[25]=q25;
                    hexFac4=hexFac4+4;
                }
            }
        });

        rg26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q26_1){
                    Question q26 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey()[26]=q26;
                    hexFac4=hexFac4+1;
                }
                else if(checkedId == R.id.Q26_2){
                    Question q26 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey()[26]=q26;
                    hexFac4=hexFac4+2;
                }
                else if(checkedId == R.id.Q26_3){
                    Question q26 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey()[26]=q26;
                    hexFac4=hexFac4+3;
                }
                else if(checkedId == R.id.Q26_4){
                    Question q26 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey()[26]=q26;
                    hexFac4=hexFac4+4;
                }
            }
        });

        rg27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q27_1){
                    Question q27 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey()[27]=q27;
                    hexFac4=hexFac4+1;
                }
                else if(checkedId == R.id.Q27_2){
                    Question q27 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey()[27]=q27;
                    hexFac4=hexFac4+2;
                }
                else if(checkedId == R.id.Q27_3){
                    Question q27 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey()[27]=q27;
                    hexFac4=hexFac4+3;
                }
                else if(checkedId == R.id.Q27_4) {
                    Question q27 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey()[27] = q27;
                    hexFac4=hexFac4+4;
                }
            }
        });
        rg28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q28_1){
                    Question q28 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey()[28]=q28;
                    hexFac4=hexFac4+1;
                }
                else if(checkedId == R.id.Q28_2){
                    Question q28 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey()[28]=q28;
                    hexFac4=hexFac4+2;
                }
                else if(checkedId == R.id.Q28_3){
                    Question q28 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey()[28]=q28;
                    hexFac4=hexFac4+3;
                }
                else if(checkedId == R.id.Q28_4){
                    Question q28 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey()[28]=q28;
                    hexFac4=hexFac4+4;
                }
            }
        });
        rg29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q29_1){
                    Question q29 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey()[29]=q29;
                    hexFac4=hexFac4+1;
                }
                else if(checkedId == R.id.Q29_2){
                    Question q29 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey()[29]=q29;
                    hexFac4=hexFac4+2;
                }
                else if(checkedId == R.id.Q29_3){
                    Question q29 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey()[29]=q29;
                    hexFac4=hexFac4+3;
                }
                else if(checkedId == R.id.Q29_4){
                    Question q29 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey()[29]=q29;
                    hexFac4=hexFac4+4;
                }
            }
        });
        rg30.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q30_1){
                    Question q30 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey()[30]=q30;
                    hexFac2=hexFac2+1;
                }
                else if(checkedId == R.id.Q30_2){
                    Question q30 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey()[30]=q30;
                    hexFac2=hexFac2+2;
                }
                else if(checkedId == R.id.Q30_3){
                    Question q30= new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey()[30]=q30;
                    hexFac2=hexFac2+3;
                }
                else if(checkedId == R.id.Q30_4){
                    Question q30= new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey()[30]=q30;
                    hexFac2=hexFac2+4;
                }
            }
        });


        finish.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                for(int i=11; i<=20;i++){
                    if(SurveyList.getInstance().getSurvey()[i].isQuestionCheck()==false){
                        questioncheck=false;

                    }

                }

                if(questioncheck==false){
                    AlertDialog.Builder alert = new AlertDialog.Builder(SurveyController3.this);
                    alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    alert.setMessage("설문조사가 완료되지 않았습니다.");
                    alert.show();
                    questioncheck=true;
                }
                else{
                    Toast.makeText(getApplicationContext(),String.valueOf(hexFac1/5),Toast.LENGTH_SHORT).show();
                    SurveyController1.nowStudent.getHistory().get(SurveyController1.nowStudent.getHistory().size()-1).setQT1(hexFac1/5);

                    SurveyController1.nowStudent.getHistory().get(SurveyController1.nowStudent.getHistory().size()-1).setQT2(hexFac2/9);
                    SurveyController1.nowStudent.getHistory().get(SurveyController1.nowStudent.getHistory().size()-1).setQT3(hexFac3/10);
                    SurveyController1.nowStudent.getHistory().get(SurveyController1.nowStudent.getHistory().size()-1).setQT4(hexFac4/6);

                    Log.d("gyurie", "sc2.3");


                }


            }
        });

    }
}
