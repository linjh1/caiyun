package com.example.caiyun_jv.logic.network;

import com.example.caiyun_jv.logic.model.PlaceResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PlaceService {
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    Call<PlaceResponse> searchPlaces(@Query("query")String query);
}
