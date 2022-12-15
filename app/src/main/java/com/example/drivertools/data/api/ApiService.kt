package com.example.drivertools.data.api

import com.example.drivertools.data.api.modelsDto.WeatherDto
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("v1/current.json?key=957da72d4ef54a00a17141442221412&q=Meleuz&aqi=no")
    suspend fun getWeather() : WeatherDto

}