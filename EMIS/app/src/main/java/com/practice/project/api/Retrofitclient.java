package com.practice.project.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//public class Retrofitclient {
//    private static Retrofitclient retrofitClient = null;
//    private API api;
//
//    private Retrofitclient() {
//        api = new Retrofit.Builder()
//                .baseUrl(API.BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build()
//                .create(API.class);
//    }
//
//    public static Retrofitclient getInstance() {
//        if (retrofitClient == null)
//            retrofitClient = new Retrofitclient();
//        return retrofitClient;
//    }
//
//    public API getApi() {
//        return api;
//    }
//}


public class Retrofitclient {
    public static final String BASE_URL = "https://192.168.1.44:8081";
    private static Retrofitclient mInstance;
    private Retrofit retrofit;

    private Retrofitclient() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // Initialize the API interface
        api = retrofit.create(API.class);
    }

    public static synchronized Retrofitclient getInstance() {
        if (mInstance == null) {
            mInstance = new Retrofitclient();
        }
        return mInstance;
    }

    // Define the API interface
    private API api;

    public API getApi() {
        return api;
    }
}


