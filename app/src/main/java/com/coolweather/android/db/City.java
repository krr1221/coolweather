package com.coolweather.android.db;

import org.litepal.LitePalApplication;

public class City extends LitePalApplication {
    private int id;
    private String cityName;
    private int CityCode;
    private int provinceId;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getCityName(){
        return cityName;
    }

    public void setCityName(String cityname){
        this.cityName=cityname;
    }

    public int getCityCode(){
        return CityCode;
    }

    public void setCityCode(int code){
        this.CityCode=code;
    }

    public int getProvinceId(){
        return provinceId;
    }

    public void setProvinceId(int code){
        this.provinceId=code;
    }
}
