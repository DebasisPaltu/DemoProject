package com.example.demoproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.demoproject.DataModelApi.Pojo;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class ThirdActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    private List<Pojo.AlternativeUnitType> fetchallData = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        recyclerView = findViewById(R.id.recycler_tv);
        fetchAllData();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
    }

    private void fetchAllData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://d2.storenxt.in/api/masters/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiInterface apiInterface = retrofit.create(ApiInterface.class);


        Call<Pojo.Root> call = apiInterface.getAllData();
        call.enqueue(new Callback<Pojo.Root>() {
            @Override
            public void onResponse(Call<Pojo.Root> call, Response<Pojo.Root> response) {
                List<Pojo.Root> data = (List<Pojo.Root>) response.body();
                ApiAdapter adapter = new ApiAdapter(data);
                recyclerView.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<Pojo.Root> call, Throwable t) {

            }
        });
    }
}
//https://d2.storenxt.in/api/masters/get-all-product