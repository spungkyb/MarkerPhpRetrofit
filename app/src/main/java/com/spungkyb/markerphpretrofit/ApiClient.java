package com.spungkyb.markerphpretrofit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by user on 03/03/2018.
 */

public class ApiClient {
    //public static final String URL      = "http://192.168.88.26/kp_integravity/restapi_php/pombensin_php/";
    //public static final String URL      = "http://192.168.88.26/kp_integravity/restapi_php/pombensinphp/";
    public static final String URL      = "http://sevianapungkyb.000webhostapp.com/";
    public static Retrofit RETROFIT     = null;

    public static Retrofit getClient(){
        if(RETROFIT==null){
            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(new LoggingInterceptor())
                    .build();
            RETROFIT = new Retrofit.Builder()
                    .baseUrl(URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return RETROFIT;
    }
}
