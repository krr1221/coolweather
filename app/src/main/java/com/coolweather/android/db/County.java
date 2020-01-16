package com.coolweather.android.db;

import org.litepal.LitePalApplication;

public class County extends LitePalApplication {
    private int id;
    private String countyName;
    private int CityId;
    private String weatherId;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getCountyName(){
        return countyName;
    }

    public void setCountyName(String name){
        this.countyName=name;
    }

    public String getWeatherId(){
        return weatherId;
    }

    public void setWeatherId(String id){
        this.weatherId=id;
    }

    public int getCityId(){
        return CityId;
    }

    public void setCityId(int id){
        this.CityId=id;
    }
}
