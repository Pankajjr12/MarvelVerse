package com.test.assignment.networkCalls

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroClass{
    var BASE_URL = "http://test.oye.direct/"
    private var retrofit: Retrofit? = null

    fun get(): Retrofit? {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit
    }
}