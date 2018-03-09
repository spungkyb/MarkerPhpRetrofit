package com.spungkyb.markerphpretrofit;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by user on 03/03/2018.
 */

public interface ApiService {
    @GET("spbu")
    //@GET("JsonDisplayMarker.php")
    Call<ListSpbuModel> getAllLocation();
}
