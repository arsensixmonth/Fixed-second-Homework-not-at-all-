package com.example.a7_th_month_project.domain.model

data class Note(
    val id : Int = DEFAULT_ID,
    val title : String,
    val description : String,
    val createdAt : Long
){
    companion object{
        const val DEFAULT_ID = 0
    }
}
