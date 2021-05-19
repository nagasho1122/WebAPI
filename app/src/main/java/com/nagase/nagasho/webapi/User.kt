package com.nagase.nagasho.webapi

import com.google.gson.annotations.SerializedName

data class User(val name: String,
                @SerializedName("login") val userId: String,  //GSONで用いる変数に対応するように名前を変更
                @SerializedName("avatar_url") val avatarUrl: String,
                val following: Int,
                val followers: Int)