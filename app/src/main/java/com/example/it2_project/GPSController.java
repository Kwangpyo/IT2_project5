package com.example.it2_project;

import android.Manifest;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class GPSController extends AppCompatActivity {

    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpscontroller);

        t1 = (TextView)findViewById(R.id.text11);
        getLocation();
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
                    Toast.makeText(GPSController.this,"Granted",Toast.LENGTH_SHORT).show();
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
        mLocationClient = LocationServices.getFusedLocationProviderClient(GPSController.this);
        mLocationClient.getLastLocation().addOnSuccessListener(GPSController.this, new OnSuccessListener<Location>() {
            @Override
            public void onSuccess(Location location) {
                if(location != null)
                {
                    t1.setText(""+ location.getLatitude() + "  " + location.getLongitude());

                }
            }
        });
    }





}
