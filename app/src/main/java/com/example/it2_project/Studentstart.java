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
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;

import java.util.List;

public class Studentstart extends AppCompatActivity {

    LinearLayout survey_start;
    LinearLayout SOS;
    LinearLayout singo;
    LinearLayout consult;
    TextView text_id;
    TextView text_name;
    Student login_student;
    ImageButton menu;
    TextView logout;

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studentstart);

        survey_start = (LinearLayout)findViewById(R.id.studentstart_survey);
        SOS = (LinearLayout)findViewById(R.id.studentstart_sos);
        singo = (LinearLayout)findViewById(R.id.studentstart_declare);
        consult = (LinearLayout)findViewById(R.id.studentstart_consult);
        text_id = (TextView)findViewById(R.id.studentstart_user);
        text_name = (TextView)findViewById(R.id.studentstart_name);
        logout = (TextView)findViewById(R.id.studentstart_logout);
        login_student = (Student)getIntent().getSerializableExtra("student_key");
        menu = (ImageButton)findViewById(R.id.studentstart_menu);
        text_id.setText("ID : " + login_student.getId());
        text_name.setText("name : " + login_student.getName());


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
                dec.putExtra("student_key", login_student);
                startActivity(dec);
                finish();

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


        menu.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"아직 구현하지 않음", Toast.LENGTH_SHORT).show();

            }
        });



    }



}
