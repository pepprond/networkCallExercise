package com.example.esercizio_chiamate_di_rete.network
import com.google.gson.annotations.SerializedName


data class Dog(
    @SerializedName("message")
    val message: String,
    @SerializedName("status")
    val status: String
)