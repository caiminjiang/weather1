package com.example.caiminjiang.weather1.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {

    private int id;
    private String cityName;
    private int cityCode;
    private int provinceID;

    public int getId(){
        return id;

    }

    public void setId(){
        this.id=id;
    }

    public String getCityName(){
        return cityName;
    }

    public void setCityName(){
        this.cityName=cityName;
    }

    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode=cityCode;
    }

    public int getProvinceID(){
        return provinceID;
    }

    public void setProvinceID(int provinceID){
        this.provinceID=provinceID;
    }
}

