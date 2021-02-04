package com.example.homemellow_app.data;

import com.google.gson.annotations.SerializedName;

public class LoginData {
    @SerializedName("email")
    String userEmail;

    @SerializedName("passwd")
    String userPwd;

    public LoginData(String userEmail, String userPwd) {
        this.userEmail = userEmail;
        this.userPwd = userPwd;
    }
}


