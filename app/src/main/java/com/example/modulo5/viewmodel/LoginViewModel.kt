package com.example.modulo5.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

   fun validarUsuario(correo: String, contrasena: String): String? {
        if (correo.isEmpty()) {

            return "Ingrese su correo"


        }
        if (contrasena.isEmpty()) {

            return "Ingrese su contraseña"
        }
        return null
    }

}