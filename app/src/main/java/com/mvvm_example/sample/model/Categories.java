package com.mvvm_example.sample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Categories {

    /*@SerializedName("id")
    @Expose
    public String id;*/
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("desc")
    @Expose
    public String desc;
    @SerializedName("imagepath")
    @Expose
    public String imagepath;

    //Constructor
    public Categories( String title, String desc, String imagepath) {

        this.title = title;
        this.desc = desc;
        this.imagepath = imagepath;
    }

    //Deafult Constructor
    public Categories() {

    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }
}
