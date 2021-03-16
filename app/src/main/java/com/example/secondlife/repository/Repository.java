package com.example.secondlife.repository;

import com.example.secondlife.database.Database;
import com.example.secondlife.model.Game;
import com.example.secondlife.network.HttpClient;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    private Database database = new Database();
    private HttpClient httpClient = new HttpClient();

    public List<Game> getLatestGames() {

        //return games from db cache
        //data.smth
        //return new games from rest api
        //httpClient.smth
        return new ArrayList<Game>();
    }
}
