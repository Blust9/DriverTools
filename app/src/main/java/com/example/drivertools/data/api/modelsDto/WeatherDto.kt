package com.example.drivertools.data.api.modelsDto

import com.google.gson.annotations.SerializedName

data class WeatherDto(
    val current: Current,
    val location: Location
)