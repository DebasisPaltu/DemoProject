package com.example.demoproject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
public interface jsonPlaceHolderApi {
    @GET("posts")
    Call<List<Post>> getPost();
}
