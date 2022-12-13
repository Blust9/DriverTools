package com.example.drivertools.domain

interface ToolsRepository {

    fun getCarParamsUseCase(name : String) : CarEntity
    


}