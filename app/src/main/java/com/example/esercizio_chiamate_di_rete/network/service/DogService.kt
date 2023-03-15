package com.example.esercizio_chiamate_di_rete.network.service

import com.example.esercizio_chiamate_di_rete.network.dto.Dog
import retrofit2.http.GET

interface DogService {
    @GET("/api/breeds/image/random")
    suspend fun getImageRandom(): Dog
}