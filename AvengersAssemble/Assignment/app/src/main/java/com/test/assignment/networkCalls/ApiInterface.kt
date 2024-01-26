package com.test.assignment.networkCalls

import com.test.assignment.iccModels.Afghanistan
import com.test.assignment.iccModels.CricketMainModel
import com.test.assignment.iccModels.JSONResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

@GET("players.json")
fun getCountry():Call<CricketMainModel>
}