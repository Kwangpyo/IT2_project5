package com.example.it2_project;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SurveyController2 extends AppCompatActivity {

    Button next;
    boolean questioncheck=true;
    HexagonGraph hexagonGraph;
    double hexFac1=0;
    double hexFac2=0;
    double hexFac3=0;
    double hexFac4=0;
    RadioGroup rg11,rg12,rg13,rg14,rg15,rg16,rg17,rg18,rg19,rg20;
    //Student nowStudent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("gyurie", "Sc2.1");
        setContentView(R.layout.activity_survey2);
        Log.d("gyurie", "Sc2.2");

        //nowStudent = (Student)getIntent().getSerializableExtra("student_key");


        /*hexFac1=nowStudent.getHistory().get(SurveyController1.nowStudent.getHistory().size()-1).getQT1();
        hexFac2=nowStudent.getHistory().get(SurveyController1.nowStudent.getHistory().size()-1).getQT2();
        hexFac3=nowStudent.getHistory().get(SurveyController1.nowStudent.getHistory().size()-1).getQT3();
        hexFac4=nowStudent.getHistory().get(SurveyController1.nowStudent.getHistory().size()-1).getQT4();*/
        hexFac1=SurveyController1.nowStudent.getHistory().get(SurveyController1.nowStudent.getHistory().size()-1).getQT1();
        hexFac2=SurveyController1.nowStudent.getHistory().get(SurveyController1.nowStudent.getHistory().size()-1).getQT2();
        hexFac3=SurveyController1.nowStudent.getHistory().get(SurveyController1.nowStudent.getHistory().size()-1).getQT3();
        hexFac4=SurveyController1.nowStudent.getHistory().get(SurveyController1.nowStudent.getHistory().size()-1).getQT4();

        Toast.makeText(getApplicationContext(), String.valueOf(hexFac1), Toast.LENGTH_SHORT).show();

        Log.d("gyurie", String.valueOf(hexFac1));

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
                    Question q11 = new Question("Q1", 1, true);
                    SurveyList.getInstance().getSurvey()[11]=q11;
                    hexFac3=hexFac3+1;
                }

                else if(checkedId == R.id.Q11_2){
                    Question q11 = new Question("Q1", 2, true);
                    SurveyList.getInstance().getSurvey()[11]=q11;
                    hexFac3=hexFac3+2;
                }
                else if(checkedId == R.id.Q11_3){
                    Question q11 = new Question("Q1", 3, true);
                    SurveyList.getInstance().getSurvey()[11]=q11;
                    hexFac3=hexFac3+3;
                }
                else if(checkedId == R.id.Q11_4){
                    Question q11 = new Question("Q1", 4, true);
                    SurveyList.getInstance().getSurvey()[11]=q11;
                    hexFac3=hexFac3+4;
                }
            }
        });


        rg12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q12_1){
                    Question q12 = new Question("Q2", 1, true);
                    SurveyList.getInstance().getSurvey()[12]=q12;
                    hexFac3=hexFac3+1;
                }
                else if(checkedId == R.id.Q12_2){
                    Question q12 = new Question("Q2", 2, true);
                    SurveyList.getInstance().getSurvey()[12]=q12;
                    hexFac3=hexFac3+2;
                }
                else if(checkedId == R.id.Q12_3){
                    Question q12 = new Question("Q2", 3, true);
                    SurveyList.getInstance().getSurvey()[12]=q12;
                    hexFac3=hexFac3+3;
                }
                else if(checkedId == R.id.Q12_4){
                    Question q12 = new Question("Q2", 4, true);
                    SurveyList.getInstance().getSurvey()[12]=q12;
                    hexFac3=hexFac3+4;
                }
            }
        });

        rg13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q13_1){
                    Question q13 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey()[13]=q13;
                    hexFac3=hexFac3+1;
                }
                else if(checkedId == R.id.Q13_2){
                    Question q13 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey()[13]=q13;
                    hexFac3=hexFac3+2;
                }
                else if(checkedId == R.id.Q13_3){
                    Question q13 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey()[13]=q13;
                    hexFac3=hexFac3+3;
                }
                else if(checkedId == R.id.Q13_4){
                    Question q13 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey()[13]=q13;
                    hexFac3=hexFac3+4;
                }
            }
        });

        rg14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q14_1){
                    Question q14 = new Question("Q4", 1, true);
                    SurveyList.getInstance().getSurvey()[14]=q14;
                    hexFac3=hexFac3+1;
                }
                else if(checkedId == R.id.Q14_2){
                    Question q14 = new Question("Q4", 2, true);
                    SurveyList.getInstance().getSurvey()[14]=q14;
                    hexFac3=hexFac3+2;
                }
                else if(checkedId == R.id.Q14_3){
                    Question q14 = new Question("Q4", 3, true);
                    SurveyList.getInstance().getSurvey()[14]=q14;
                    hexFac3=hexFac3+3;
                }
                else if(checkedId == R.id.Q14_4){
                    Question q14 = new Question("Q4", 4, true);
                    SurveyList.getInstance().getSurvey()[14]=q14;
                    hexFac3=hexFac3+4;
                }
            }
        });

        rg15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q15_1){
                    Question q15 = new Question("Q5", 1, true);
                    SurveyList.getInstance().getSurvey()[15]=q15;
                    hexFac3=hexFac3+1;
                }
                else if(checkedId == R.id.Q15_2){
                    Question q15 = new Question("Q5", 2, true);
                    SurveyList.getInstance().getSurvey()[15]=q15;
                    hexFac3=hexFac3+2;
                }
                else if(checkedId == R.id.Q15_3){
                    Question q15 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey()[15]=q15;
                    hexFac3=hexFac3+3;
                }
                else if(checkedId == R.id.Q15_4){
                    Question q15 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey()[15]=q15;
                    hexFac3=hexFac3+4;

                }
            }
        });

        rg16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q16_1){
                    Question q16 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey()[16]=q16;
                    hexFac3=hexFac3+1;
                }
                else if(checkedId == R.id.Q16_2){
                    Question q16 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey()[16]=q16;
                    hexFac3=hexFac3+2;
                }
                else if(checkedId == R.id.Q16_3){
                    Question q16 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey()[16]=q16;
                    hexFac3=hexFac3+3;
                }
                else if(checkedId == R.id.Q16_4){
                    Question q16 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey()[16]=q16;
                    hexFac3=hexFac3+4;
                }
            }
        });

        rg17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q17_1){
                    Question q17 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey()[17]=q17;
                    hexFac3=hexFac3+1;
                }
                else if(checkedId == R.id.Q17_2){
                    Question q17 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey()[17]=q17;
                    hexFac3=hexFac3+2;
                }
                else if(checkedId == R.id.Q17_3){
                    Question q17 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey()[17]=q17;
                    hexFac3=hexFac3+3;
                }
                else if(checkedId == R.id.Q17_4){
                    Question q17 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey()[17]=q17;
                    hexFac3=hexFac3+4;
                }
            }
        });
        rg18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q18_1){
                    Question q18 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey()[18]=q18;
                    hexFac3=hexFac3+1;
                }
                else if(checkedId == R.id.Q18_2){
                    Question q18 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey()[18]=q18;
                    hexFac3=hexFac3+2;
                }
                else if(checkedId == R.id.Q18_3){
                    Question q18 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey()[18]=q18;
                    hexFac3=hexFac3+3;
                }
                else if(checkedId == R.id.Q18_4){
                    Question q18 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey()[18]=q18;
                    hexFac3=hexFac3+4;
                }
            }
        });
        rg19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q19_1){
                    Question q19 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey()[19]=q19;
                    hexFac2=hexFac2+4;
                }
                else if(checkedId == R.id.Q19_2){
                    Question q19 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey()[19]=q19;
                    hexFac2=hexFac2+3;
                }
                else if(checkedId == R.id.Q19_3){
                    Question q19 = new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey()[19]=q19;
                    hexFac2=hexFac2+2;
                }
                else if(checkedId == R.id.Q19_4){
                    Question q19 = new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey()[19]=q19;
                    hexFac2=hexFac2+1;
                }
            }
        });
        rg20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.Q20_1){
                    Question q20 = new Question("Q3", 1, true);
                    SurveyList.getInstance().getSurvey()[20]=q20;
                    hexFac2=hexFac2+4;
                }
                else if(checkedId == R.id.Q20_2){
                    Question q20 = new Question("Q3", 2, true);
                    SurveyList.getInstance().getSurvey()[20]=q20;
                    hexFac2=hexFac2+3;
                }
                else if(checkedId == R.id.Q20_3){
                    Question q20= new Question("Q3", 3, true);
                    SurveyList.getInstance().getSurvey()[20]=q20;
                    hexFac2=hexFac2+2;
                }
                else if(checkedId == R.id.Q20_4){
                    Question q20= new Question("Q3", 4, true);
                    SurveyList.getInstance().getSurvey()[20]=q20;
                    hexFac2=hexFac2+1;
                }
            }
        });


        next.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                for(int i=11; i<=20;i++){
                    if(SurveyList.getInstance().getSurvey()[i].isQuestionCheck()==false){
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
                    questioncheck=true;
                }
                else{
                    SurveyController1.nowStudent.getHistory().get(SurveyController1.nowStudent.getHistory().size()-1).setQT1(hexFac1);

                    SurveyController1.nowStudent.getHistory().get(SurveyController1.nowStudent.getHistory().size()-1).setQT2(hexFac2);
                    SurveyController1.nowStudent.getHistory().get(SurveyController1.nowStudent.getHistory().size()-1).setQT3(hexFac3);
                    SurveyController1.nowStudent.getHistory().get(SurveyController1.nowStudent.getHistory().size()-1).setQT4(hexFac4);

                    Log.d("gyurie", "sc2.3");
                    Intent intent1 = new Intent(getApplicationContext(), SurveyController3.class);

                    startActivity(intent1);
                }



            }
        });






    }
}
