package com.example.it2_project;

import java.util.ArrayList;

/**
 * Created by GyuRie on 2017-11-23.
 */

class SurveyList {
    private static final SurveyList ourInstance = new SurveyList();

    private ArrayList<Question> survey;


    private SurveyList(){
        survey = new ArrayList<Question>();
    }
    private static SurveyList instance;

    public static SurveyList getInstance(){
        if(instance==null) instance=new SurveyList();
        return instance;
    }
    public ArrayList<Question> getSurvey(){
        return survey;
    }

}
