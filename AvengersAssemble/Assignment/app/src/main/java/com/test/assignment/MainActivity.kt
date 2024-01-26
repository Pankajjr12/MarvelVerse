package com.test.assignment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.test.assignment.adapter.AdapterCountry
import com.test.assignment.networkCalls.ApiInterface

import java.util.*



class MainActivity : AppCompatActivity() {
    lateinit var api: ApiInterface
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.recCountry)
        val adapter = AdapterCountry(this@MainActivity)
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this@MainActivity)
    }
}