package com.test.assignment.teams.afghan

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.test.assignment.R
import com.test.assignment.iccModels.CricketMainModel
import com.test.assignment.networkCalls.ApiInterface
import kotlinx.android.synthetic.main.activity_afghanistan.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class AfghanistanActivity : AppCompatActivity() {
    val BASE_URL = "https://test.oye.direct/"
    var tv_user: TextView? = null
    var str:String = ""
    var str1:String = ""
    var captain=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_afghanistan)
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
                var user = usres!!.team1
                var length = user!!.size

                for (i in 0 until length) {
                    str = str + "\n" + user.get(i).name
                    if (user.get(i).captain) {
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
//  private  fun getCountry()
//    {
//        val api:ApiInterface
//        api=RetroClass.get()?.create(ApiInterface::class.java)!!
//        val call=api.getCountry()
//        call.enqueue(object : Callback<CountryModel> {
//            @SuppressLint("ResourceAsColor")
//            override fun onResponse(call: Call<CountryModel>?, response: Response<CountryModel>?) {
//                var list=response?.body()
//                var list1=list?.afghan
//                var length=list1!!.size
//                for (i in 0 until length)
//                {
//                   str=str+"\n" + list1.get(i).name
////                    if(list1.get(i).captain==true)
////                    {
////                        plyName.setTextColor(R.color.black)
////                    }
//
//                }
//                plyName!!.text=str
//
//            }
//
//            override fun onFailure(call: Call<CountryModel>?, t: Throwable) {
//
//            }
//        })
//    }
//
//
//}




