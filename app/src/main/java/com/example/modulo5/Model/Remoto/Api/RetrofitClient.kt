package com.example.modulo5.Model.Remoto.Api

import com.example.Modulo5.Model.Remoto.Response.LoginResponse
import com.example.Modulo5.Model.Remoto.Response.UserResponse
import com.example.modulo5.Model.Remoto.Response.AccountResponse
import com.example.modulo5.Model.Remoto.Response.LoginRequest
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

abstract class RetrofitClient {

    @Headers("Content-type: application/json")
    @POST("auth/Login")
    abstract suspend fun login (@Body loginRequest: LoginRequest): LoginResponse

    @GET("auth/me")

    abstract suspend fun getUserByToken (@Header("Authorization") token: String): UserResponse


    @GET("accounts/me")
    abstract suspend fun myAccount(@Header("Authorization") token: String): MutableList<AccountResponse>







}