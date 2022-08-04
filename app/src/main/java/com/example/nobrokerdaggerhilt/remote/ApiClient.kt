package com.example.nobrokerdaggerhilt.remote

import com.example.nobrokerdaggerhilt.modelClass.ResponseClass
import retrofit2.http.GET

interface ApiClient {

    @GET("357d2598408a8fd58941aec65578266d/raw/5acf1f859190de47e15dfb6c68796c7492e8a9ce/nobroker.json")
    suspend fun getResponse(): List<ResponseClass>
}