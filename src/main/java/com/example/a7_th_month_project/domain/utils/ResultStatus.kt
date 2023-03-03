package com.example.a7_th_month_project.domain.utils

sealed class ResultStatus<T>(
    val data : T? = null,
    val error : String? = null
){
    class Loading<T>() : ResultStatus<T>()
    class Success<T>(data : T?) : ResultStatus<T>(data=data,null)
    class Error<T>(message : String?) : ResultStatus<T>(error = message)
}
