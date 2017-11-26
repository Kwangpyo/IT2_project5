package com.example.it2_project;

/**
 * Created by 고광표 on 2017-11-26.
 */

public class UpdateLocationAPI {

    String id;
    double lon;
    double lat;

    public UpdateLocationAPI(String id,double lon, double lat)
    {
        this.id = id;
        this.lon = lon;
        this.lat = lat;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }







    final static String openURL = "http://192.168.0.6:3000//updateDECTaskDocumentURL";


}
