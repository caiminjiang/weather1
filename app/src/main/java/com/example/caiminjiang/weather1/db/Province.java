package com.example.caiminjiang.weather1.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;
    private int provinceCode;
    private String provinceName;

    public int getId(){
        return  id;
    }

    public void setId(){
        this.id=id;
    }

    public String getProvinceName(){
        return  provinceName;
    }

    public void setProvinceName(String provinceName){
        this.provinceName=provinceName;
    }

    public int getProvinceCode(){
         return provinceCode;
    }

    public void setProvinceCode(int provinceCode){
        this.provinceCode=provinceCode;
    }

}
