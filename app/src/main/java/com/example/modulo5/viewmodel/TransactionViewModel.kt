package com.example.modulo5.viewmodel

import android.app.Application
import android.content.Context
import android.icu.text.SimpleDateFormat
import android.icu.util.Calendar
import androidx.compose.ui.window.application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.modulo5.Model.Remoto.Api.AuthManager
import com.example.modulo5.Model.Remoto.Servicios.TransactionResponse


import kotlinx.coroutines.launch



class TransactionViewModel (context: Context): AndroidViewModel(Application() )  {

    private val _transaction = MutableLiveData<TransactionResponse?>()
    val transaction: MutableLiveData<TransactionResponse?> get() = _transaction

    private val authManager = AuthManager(context)



    fun createTransaction (account: Long,concept: String, userId: Long, toAccountId: Long){
        viewModelScope.launch{

            //Obtener el token de autenticacion

            val token = authManager.getToken()
            if (token == null){

                //Construir el objeto de transaccion

                val currentDate = Calendar.getInstance().time
                val dateOfBirth = "23/06/2024"
                val sdf = SimpleDateFormat ("yyyy-MM-dd")
                val date = sdf.parse(dateOfBirth)
                /*val dateFormat = android.text.format.DateFormat.getDateFormat(context)*/
                /*val formattedDate = dateFormat.format(currentDate)*/


                val transaction = TransactionResponse()


            }




        }



    }
}