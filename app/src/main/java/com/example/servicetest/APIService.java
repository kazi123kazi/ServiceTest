package com.example.servicetest;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {


    @GET("random")
    Call<Jokes>  getJokes();

}