package com.mvvm_example.sample.remote;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import com.mvvm_example.sample.model.Ticket;
import com.mvvm_example.sample.remote.ApiData.ApiService;
import com.mvvm_example.sample.remote.ApiResponse.ObjectResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroClass {

    //BaseURL
    private static final String BaseUrl = "http://111.93.169.90/";


    private static Retrofit getRetroInstance() {


        return new Retrofit.Builder()
                .baseUrl(BaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


    }


    public static ApiService getApiService() {


        return getRetroInstance().create(ApiService.class);

    }


    public LiveData<Ticket> getLiveData()

    {

        final MutableLiveData<Ticket> mutableLiveData = new MutableLiveData<>();

        ApiService apiService = RetroClass.getApiService();
        apiService.getTicketJson().enqueue(new Callback<ObjectResponse<List<Ticket>>>() {
            @Override
            public void onResponse(Call<ObjectResponse<List<Ticket>>> call, Response<ObjectResponse<List<Ticket>>> response) {
                Ticket ticket = response.body().getResponse().get(0);
                mutableLiveData.setValue(ticket);
            }

            @Override
            public void onFailure(Call<ObjectResponse<List<Ticket>>> call, Throwable t) {
                Log.e("Error", t.getMessage());
            }

        });

        return mutableLiveData;
    }



}
