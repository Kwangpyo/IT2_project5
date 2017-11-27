package com.example.it2_project;

import android.Manifest;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Studentstart extends AppCompatActivity {

    Button logout;
    Button survey_start;
    Button SOS;
    Button singo;
    Button consult;
    TextView text;
    Student login_student;

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentstart);

        logout = (Button)findViewById(R.id.logout_s);
        survey_start = (Button)findViewById(R.id.survey);
        SOS = (Button)findViewById(R.id.SOS);
        singo = (Button)findViewById(R.id.singo);
        consult = (Button)findViewById(R.id.consult);
        text = (TextView)findViewById(R.id.textview_s);
        login_student = (Student)getIntent().getSerializableExtra("student_key");

        text.setText(login_student.getId());

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent1);
                SharedPreferences auto = getSharedPreferences("auto", Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor  = auto.edit();
                editor.clear();
                editor.commit();
                Toast.makeText(Studentstart.this, "로그아웃", Toast.LENGTH_SHORT).show();
                finish();

            }
        });

        survey_start.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(getApplicationContext(),SurveyController1.class);
                startActivity(intent2);
            }
        });

        SOS.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {

               Intent call = new Intent(getApplicationContext(), CallController.class);
                startActivity(call);

            }
        });

        singo.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {

                Intent dec = new Intent(getApplicationContext(),GPSController.class);
                startActivity(dec);
                

            }
        });

        consult.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), ConsultController.class);
                startActivity(intent);

            }
        });




    }

}
