package com.example.caiyun_jv.logic.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceCreator {
    private final String BASE_URL="https://api.caiyunapp.com/";
    private static ServiceCreator retrofitUtils;
    public Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private ServiceCreator() {
    }

    public static ServiceCreator getInstance() {
        if (retrofitUtils == null) {
            synchronized (ServiceCreator.class) {
                if (retrofitUtils == null) {
                    retrofitUtils = new ServiceCreator();
                }
            }
        }
        return retrofitUtils;
    }

    public <T> T create(Class<T> service) {
        //通过java动态代理模式获取代理对象
        T t = retrofit.create(service);
        return t;

    }
}
