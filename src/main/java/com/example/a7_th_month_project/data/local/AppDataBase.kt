package com.example.a7_th_month_project.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.a7_th_month_project.data.model.NoteEntity

@Database(entities = [NoteEntity::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun noteDao() : NoteDao
}