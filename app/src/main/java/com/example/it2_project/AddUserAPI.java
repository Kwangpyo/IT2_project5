package com.example.it2_project;

import android.util.Log;
import android.widget.Toast;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by 고광표 on 2017-11-26.
 */

public class AddUserAPI {

    public void add(String id, String name, String password) {

        String url1 = "http://172.30.1.26:3000/addTaskDocumentURL/";
        final String openURL = url1 + id + "?n=" + name + "&s=student" + "&p=" + password;
        Log.d("siba",openURL);

        try {
            URL url = new URL(openURL);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.getInputStream();
        } catch (MalformedURLException e) {
            System.err.println("Malformed URL");
            e.printStackTrace();

        } catch (IOException e) {
            System.err.println("URL Connection failed");
            e.printStackTrace();
        }

    }


}
