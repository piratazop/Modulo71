package com.example.modulo5.Model.Local

import com.example.modulo5.Model.Remoto.Servicios.TransactionResponse

data class Usuario (
    val nombre: String,
    val apellido: String,
    val email: String,
    val imgPerfil: Int =0,
    val Saldo: Double =1000.0,
    val transacciones: MutableList<TransactionResponse> = mutableListOf()



)