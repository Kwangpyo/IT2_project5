package com.example.it2_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.concurrent.ExecutionException;

public class signup extends AppCompatActivity {

    Button signupcomplete;
    EditText newid, newpwd, newpwdcheck, name_text;
    public static String new_id;
    public static String new_pwd1;
    String new_pwd2;
    String teacherorstudent;
    String name;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        signupcomplete = (Button)findViewById(R.id.signupcomplete);
        newid = (EditText)findViewById(R.id.newid);
        newpwd = (EditText)findViewById(R.id.newpassword1);
        newpwdcheck = (EditText)findViewById(R.id.newpassword2);
        name_text = (EditText)findViewById(R.id.name);

        signupcomplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new_id = newid.getText().toString();
                new_pwd1 = newpwd.getText().toString();
                new_pwd2 = newpwdcheck.getText().toString();
                name = name_text.getText().toString();



                if(new_pwd1.equals(new_pwd2)==true) {
                    int check = 0;

                    for (int i = 0; i < MainActivity.user.size(); i++) {
                        if (MainActivity.user.get(i).getId().equals(new_id)) {
                            check = 1;
                            Toast.makeText(getApplicationContext(), "이미 존재하는 ID입니다", Toast.LENGTH_SHORT).show();
                        }
                    }

                    if (check == 0) {
                            //Student newstudent = new Student(new_id, new_pwd1,name);
                            //MainActivity.user.add(newstudent);
                            //MainActivity.user.add(newstudent);
                            OpenAddAPITask t = new OpenAddAPITask();

                            try{

                                int i = t.execute(new_id,name,new_pwd1).get();

                            }
                            catch (InterruptedException e) {
                                Intent error1 = new Intent(getApplicationContext(), ErrorPage.class);
                                startActivity(error1);
                                e.printStackTrace();

                            }
                            catch (ExecutionException e) {
                                Intent error2 = new Intent(getApplicationContext(), ErrorPage.class);
                                startActivity(error2);
                                e.printStackTrace();
                            }

                            Toast.makeText(getApplicationContext(), "회원 가입 완료", Toast.LENGTH_SHORT).show();
                            Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent2);


                    }

                }
                else if (new_pwd1.equals(new_pwd2) == false) {
                    Toast.makeText(getApplicationContext(), "비밀번호를 다르게 입력했습니다", Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
}
