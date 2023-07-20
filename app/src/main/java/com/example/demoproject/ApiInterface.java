package com.example.demoproject;

import com.example.demoproject.DataModelApi.Pojo;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("get-all-product")
    Call<Pojo.Root> getAllData();
}