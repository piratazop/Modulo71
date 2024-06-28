package com.example.modulo5.Model.Remoto.Api

import android.util.Log
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface AlkeWalletApi {

   companion object{


       private const val BASE_URL = "http://wallet-main.eba-ccwdurgr.us-east-1.elasticbeanstalk.com/"

       private var retrofitInstance: Retrofit? = null

       fun getRetrofit(token: String? = null): Retrofit {
           val clientBuilder = OkHttpClient.Builder()

           if(token != null){
               clientBuilder.addInterceptor(AuthInterceptor(token))
               Log.i("USUARIO","Interceptor con token añadido: $token")
           }

           val client= clientBuilder.build()
           return Retrofit.Builder()
               .baseUrl(BASE_URL)
               .client(client)
           .addConverterFactory(GsonConverterFactory.create())
               .build()
       }

       fun retrofitInstance(token: String?= null): AlkeWalletApi {
           if(retrofitInstance == null){
               retrofitInstance = getRetrofit(token)
           }
           return retrofitInstance!!.create(AlkeWalletApi::class.java)
       }


   }


}