package com.example.modulo5.Model.Remoto.Api

import android.content.Context

 class AuthManager (private val context: Context) {

     private val preferences =
         context.getSharedPreferences("auth_preferences", Context.MODE_PRIVATE)

     fun saveToken(token: String) {
         preferences.edit().putString("auth_token", token).apply()


     }

     fun getToken(): String? {
         return preferences.getString("auth_token", null)
     }

     fun deleteToken() {
         preferences.edit().remove("auth_token").apply()
     }

     fun clearUserLogged() {
         preferences.edit().remove("user_logged").apply()
     }
 }