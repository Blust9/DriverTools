package com.example.drivertools.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.drivertools.R
import com.example.drivertools.data.api.ApiFactory
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {


    val scope = CoroutineScope(Dispatchers.Main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        scope.launch {
            val retrofit = ApiFactory.apiService ?: throw Exception("retrofit is null")
            val text = findViewById<TextView>(R.id.weatherTest)
            text.text = retrofit.getWeather().current.cloud.toString()
        }
    }
}