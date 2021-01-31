package com.example.homemellow_app.data;

import com.google.gson.annotations.SerializedName;

public class StoreData {

    @SerializedName("name")
    String itemName;

    @SerializedName("cost")
    String itemCost;

    public void setItemCost(String itemCost) {
        this.itemCost = itemCost;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemCost() {
        return itemCost;
    }

    public String getItemName() {
        return itemName;
    }
}
