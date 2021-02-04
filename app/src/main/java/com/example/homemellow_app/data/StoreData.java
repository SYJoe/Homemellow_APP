package com.example.homemellow_app.data;

import com.google.gson.annotations.SerializedName;

public class StoreData {
    @SerializedName("name")
    CharSequence itemName;

    @SerializedName("cost")
    CharSequence itemCost;

    public StoreData(String itemName, String itemCost) {
        this.itemName = itemName;
        this.itemCost = itemCost;
    }
}
