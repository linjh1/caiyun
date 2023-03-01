package com.example.caiyun_jv.logic.network;

import com.example.caiyun_jv.logic.model.PlaceResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SunnyWeatherNetwork {
    private static SunnyWeatherNetwork sunnyWeatherNetwork;
    PlaceService placeService=ServiceCreator.getInstance().create(PlaceService.class);


    public SunnyWeatherNetwork() {
    }

    public static  SunnyWeatherNetwork getInstance(){
        if (sunnyWeatherNetwork==null){
            synchronized (SunnyWeatherNetwork.class){
              if (sunnyWeatherNetwork==null){
                  sunnyWeatherNetwork=new SunnyWeatherNetwork();
              }
                }
        }
        return sunnyWeatherNetwork;
    }
 private void get(String query){
     Call<PlaceResponse> responseCall =placeService.searchPlaces(query);
     responseCall.enqueue(new Callback<PlaceResponse>() {
         @Override
         public void onResponse(Call<PlaceResponse> call, Response<PlaceResponse> response) {
             PlaceResponse body=response.body();
         }

         @Override
         public void onFailure(Call<PlaceResponse> call, Throwable t) {

         }
     });

 }
}
