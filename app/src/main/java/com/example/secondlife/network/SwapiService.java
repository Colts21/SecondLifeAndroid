package com.example.secondlife.network;

import com.example.secondlife.model.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface SwapiService {

    @GET("people/{id}")
    static Call<User> getPeople(@Path("id") String id) {
        return null;
    }
}
