package com.example.secondlife.network;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AnnoncesService {

    @GET("api/annonces/{id}")
    Call<ResponseBody> getAnnonces(@Path("id") String id);
}
