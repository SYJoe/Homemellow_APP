package com.example.homemellow_app.data;

import com.google.gson.annotations.SerializedName;

public class JoinData {
    @SerializedName("name")
    private String userName;

    @SerializedName("email")
    private String userEmail;

    @SerializedName("passwd")
    private String userPwd;

    @SerializedName("hp_num")
    private String userHPNum;

    @SerializedName("id")
    private String userId;

    public JoinData(String userName, String userEmail, String userPwd, String userHPNum, String userId) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPwd = userPwd;
        this.userHPNum = userHPNum;
        this.userId = userId;
    }
}
