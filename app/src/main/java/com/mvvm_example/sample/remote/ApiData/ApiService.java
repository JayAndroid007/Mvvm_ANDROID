package com.mvvm_example.sample.remote.ApiData;

import com.mvvm_example.sample.model.Ticket;
import com.mvvm_example.sample.remote.ApiResponse.ObjectResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET(ApiConstants.GetSampleApi)
    Call<ObjectResponse<List<Ticket>>>getTicketJson();





}
