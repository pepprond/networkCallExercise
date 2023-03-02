package com.example.esercizio_chiamate_di_rete.network

import com.google.gson.Gson
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class DogProvider {
    private val URL = "https://dog.ceo"

    val retrofit = Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).build()

    fun providerDogService():DogService{
        return retrofit.create(DogService::class.java)
    }

}