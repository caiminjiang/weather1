package com.example.caiminjiang.weather1.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public  String weatherId;

    public  Update update;
    public class  Update{
         @SerializedName("loc")
        public String updateTime;
    }
}
