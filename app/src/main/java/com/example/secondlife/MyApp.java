package com.example.secondlife;

import android.app.Application;

import com.example.secondlife.model.Game;
import com.example.secondlife.network.HttpClient;

public class MyApp extends Application {

    HttpClient httpClient = new HttpClient();

    @Override
    public void onCreate(){
        super.onCreate();
    }

}
