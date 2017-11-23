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
import android.widget.Toast;

public class Studentstart extends AppCompatActivity {

    Button logout;
    Button survey_start;
    Button SOS;
    Button singo;

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

        login_student = (Student)getIntent().getSerializableExtra("student_key");

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

                Intent intent2 = new Intent(getApplicationContext(),Survey1.class);
                startActivity(intent2);
            }
        });

        SOS.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {

                if(Build.VERSION.SDK_INT >=Build.VERSION_CODES.M)
                {
                    int permissionResult = checkSelfPermission(Manifest.permission.CALL_PHONE);

                    if(permissionResult == PackageManager.PERMISSION_DENIED)
                    {
                        if(shouldShowRequestPermissionRationale(Manifest.permission.CALL_PHONE))
                        {
                            AlertDialog.Builder dialog = new AlertDialog.Builder(Studentstart.this);
                            dialog.setTitle("권한이 필요합니다")
                                    .setMessage("이 기능을 사용하기 위해서느 단말기의 \"전화걸기\" 권한이 필요합니다. 계속 하시겠습니까?")
                                    .setPositiveButton("네", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {

                                            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                                            {
                                                requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 1000);
                                            }

                                        }
                                    })
                                    .setNegativeButton("아니요", new DialogInterface.OnClickListener()
                                    {

                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            Toast.makeText(Studentstart.this,"기능을 취소했습니다", Toast.LENGTH_SHORT).show();
                                        }
                                    })
                                    .create()
                                    .show();
                        }

                        else{
                            requestPermissions(new String[]{Manifest.permission.CALL_PHONE},1000);
                        }

                    }
                    else
                    {
                        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:010-4447-1663"));
                        startActivity(intent);
                    }
                }

                else
                {
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:010-4447-1663"));
                    startActivity(intent);
                }


            }
        });

        singo.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {

                

            }
        });


    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        if (requestCode == 1000) {

            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:010-1111-2222"));

                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    startActivity(intent);
                }
            } else {
                Toast.makeText(Studentstart.this, "권한요청을 거부했습니다.", Toast.LENGTH_SHORT).show();

            }
        }

    }


}
