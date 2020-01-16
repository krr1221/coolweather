package com.coolweather.android.db;

import org.litepal.LitePalApplication;

public class Province extends LitePalApplication {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getProvinceName(){
        return provinceName;
    }

    public void setProvinceName(String provincename){
        this.provinceName=provincename;
    }

    public int getProvinceCode(){
        return provinceCode;
    }

    public void setProvinceCode(int code){
        this.provinceCode=code;
    }
}
