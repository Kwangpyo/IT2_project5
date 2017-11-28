package com.example.it2_project;

import android.Manifest;
import android.content.Intent;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class GPSController extends AppCompatActivity {

    TextView text;
    Button dec;
    public Student login_student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpscontroller);
        login_student = (Student)getIntent().getSerializableExtra("student_key");
        text = (TextView)findViewById(R.id.gpstext);
        dec = (Button)findViewById(R.id.gpscontroller_Dec);

        dec.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {

                getLocation();

            }
        });

    }

    public void getLocation(){

        Dexter.withActivity(GPSController.this)
                .withPermissions(
                        Manifest.permission.ACCESS_COARSE_LOCATION,
                        Manifest.permission.ACCESS_FINE_LOCATION
                ).withListener(new MultiplePermissionsListener() {
            @Override public void onPermissionsChecked(MultiplePermissionsReport report) {

                if(report.areAllPermissionsGranted())
                {
                    //Toast.makeText(GPSController.this,"Granted",Toast.LENGTH_SHORT).show();
                    Log.d("qwe1","asd1");
                    requestLocation();
                }

                    /* ... */}

            @Override public void onPermissionRationaleShouldBeShown(List<PermissionRequest> permissions, PermissionToken token) {
                    /* ... */}

        }).check();

    }


    private FusedLocationProviderClient mLocationClient;

    private void requestLocation()
    {
        Log.d("qwe2","asd2");
        mLocationClient = LocationServices.getFusedLocationProviderClient(GPSController.this);
        mLocationClient.getLastLocation().addOnSuccessListener(GPSController.this, new OnSuccessListener<Location>() {
            @Override
            public void onSuccess(Location location) {
                Log.d("qwe3","asd3");
                if(location != null)
                {
                    Log.d("qwe","asd");

                    OpenLocationAPI getLoc = new OpenLocationAPI();

                    try{

                        Declaration dec = new Declaration(login_student.getId(),location.getLongitude(),location.getLatitude());
                        int i = getLoc.execute(dec).get();

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

                    text.setText(location.getLatitude() + "  " + location.getLongitude());
                    Toast.makeText(getApplicationContext(),"신고가 접수되었습니다 "+location.getLatitude()+" "+location.getLongitude(),Toast.LENGTH_SHORT).show();

                }


                }

        });
    }





}
