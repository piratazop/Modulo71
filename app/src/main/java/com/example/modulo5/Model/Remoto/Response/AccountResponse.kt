package com.example.modulo5.Model.Remoto.Response

data class AccountResponse (
    val id :Long,
    val creationDate: String,
    var money: String,
    val isBlocked: Boolean,
    val userId: Long,
    val updatedAt: String,
    val createdAt: String,



){
}