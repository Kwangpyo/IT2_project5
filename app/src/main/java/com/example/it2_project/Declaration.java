package com.example.it2_project;

/**
 * Created by 고광표 on 2017-11-27.
 */

public class Declaration {

    String id;
    double lon;
    double lat;

    public Declaration(String id, double lon, double lat)
    {
        this.id=id;
        this.lon=lon;
        this.lat=lat;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }
}
