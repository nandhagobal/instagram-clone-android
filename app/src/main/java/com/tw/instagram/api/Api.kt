package com.tw.instagram.api

import com.tw.instagram.models.PostResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("/post")
    suspend fun getPosts(@Query("page") page:Int,@Query("size") size:Int): PostResponse
    companion object {
        fun create(): Api {
            val retrofit = Retrofit.Builder().baseUrl("http://10.0.2.2:8080")
                .addConverterFactory(GsonConverterFactory.create()).build()
            return retrofit.create(Api::class.java)
        }
    }
}