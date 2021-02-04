package com.example.homemellow_app.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StoreResponse {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("name")
    @Expose
    private CharSequence name = null;
    @SerializedName("cost")
    @Expose
    private CharSequence cost = null;

    public String getMessage() {
        return message;
    }

    public CharSequence getName() {
        return name;
    }

    public CharSequence getCost() {
        return cost;
    }

}