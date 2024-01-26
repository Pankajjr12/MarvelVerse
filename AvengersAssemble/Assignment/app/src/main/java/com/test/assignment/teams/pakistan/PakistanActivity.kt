package com.test.assignment.teams.pakistan

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.TextView
import com.test.assignment.R
import com.test.assignment.iccModels.CricketMainModel
import com.test.assignment.networkCalls.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PakistanActivity : AppCompatActivity() {
    val BASE_URL = "https://test.oye.direct/"
    var tv_user: TextView? = null
    var str: String = ""
    var captain = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pakistan)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        tv_user = findViewById(R.id.tv_user)
        getUsers()
    }

    // function to call server and update ui
    fun getUsers() {
        val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        var api = retrofit.create(ApiInterface::class.java)
        var call = api.getCountry()
        call.enqueue(object : Callback<CricketMainModel> {

            @SuppressLint("ResourceAsColor")
            override fun onResponse(call: Call<CricketMainModel>, response: Response<CricketMainModel>) {
                var usres = response.body()
                var user = usres!!.team7
                var length = user!!.size

                for (i in 0 until length) {
                    str = str + "\n" + user.get(i).name
                    if (user.get(0).captain) {
                        tv_user!!.setTextColor(Color.GRAY)
                        tv_user!!.text = str
                    }
                }
                tv_user!!.text = str
            }

            override fun onFailure(call: Call<CricketMainModel>, t: Throwable?) {
                Log.v("Error", t.toString())
            }
        })
    }
}