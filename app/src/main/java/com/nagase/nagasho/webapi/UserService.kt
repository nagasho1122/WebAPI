package com.nagase.nagasho.webapi

import retrofit2.http.GET
import retrofit2.http.Path

interface UserService {

    @GET("users/{userId}")
    suspend fun getUser(@Path("userId") userId: String): User //"userId"を引数にとってユーザー情報であるクラスUserを返す
}