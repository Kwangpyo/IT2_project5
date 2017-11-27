package com.example.it2_project;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ConsultController extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consult_controller);

        chattingcontroller();

    }


    public void chattingcontroller()
    {
        Uri.Builder uri = new Uri.Builder()
                .scheme("http")
                .authority("google.com");

        Uri url = uri.build();

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(url);
        intent.setPackage("com.android.chrome");
        startActivity(intent);
    }



}
