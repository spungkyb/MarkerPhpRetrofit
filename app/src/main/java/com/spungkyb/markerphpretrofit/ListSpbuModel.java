package com.spungkyb.markerphpretrofit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by user on 03/03/2018.
 */

public class ListSpbuModel {
    @SerializedName("data")
    private List<SpbuModel> mData;

    public ListSpbuModel(List<SpbuModel> mData) {
        this.mData = mData;
    }

    public ListSpbuModel() {
    }

    public List<SpbuModel> getmData() {
        return mData;
    }

    public void setmData(List<SpbuModel> mData) {
        this.mData = mData;
    }
}
