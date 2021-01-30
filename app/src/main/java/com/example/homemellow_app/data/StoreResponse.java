package com.example.homemellow_app.data;

import android.media.Image;

import com.google.gson.annotations.SerializedName;

public class StoreResponse {

    @SerializedName("key = name")
    public static String name;

    @SerializedName("key = cost")
    public static String cost;

    @SerializedName("img")
    public static Image img;

    @SerializedName("message")
    private String message;

    public static String getName()
    {
        return name;
    }

    public static String getCost()
    {
        return cost;
    }

    public static Image getImg()
    {
        return img;
    }

    public String getMessage() {
        return message;
    }
}
