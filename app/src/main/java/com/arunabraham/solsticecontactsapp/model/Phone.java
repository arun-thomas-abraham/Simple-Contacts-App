package com.arunabraham.solsticecontactsapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Arun on 12/23/2017.
 */

public class Phone implements Serializable {

    @SerializedName("work")
    @Expose
    private String work;
    @SerializedName("home")
    @Expose
    private String home;
    @SerializedName("mobile")
    @Expose
    private String mobile;

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}
