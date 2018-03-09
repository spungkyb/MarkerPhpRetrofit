package com.spungkyb.markerphpretrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by user on 03/03/2018.
 */

public class SpbuModel {
    @SerializedName("nama")
    private String nama;
    @SerializedName("alamat")
    private String alamat;
    @SerializedName("latitude")
    private String latutide;
    @SerializedName("longitude")
    private String longitude;

    public SpbuModel() {
    }

    public SpbuModel(String nama, String alamat, String latutide, String longitude) {
        this.nama = nama;
        this.alamat = alamat;
        this.latutide = latutide;
        this.longitude = longitude;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getLatutide() {
        return latutide;
    }

    public void setLatutide(String latutide) {
        this.latutide = latutide;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
