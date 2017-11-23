package com.example.it2_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SurveyController2 extends AppCompatActivity {

    Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey2);

        finish =(Button)findViewById(R.id.FINISH);

        finish.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {



            }
        });



    }
}
