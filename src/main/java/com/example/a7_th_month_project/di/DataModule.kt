package com.example.a7_th_month_project.di

import android.content.Context
import androidx.room.Room
import com.example.a7_th_month_project.data.local.AppDataBase
import com.example.a7_th_month_project.data.local.NoteDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun appDatabase(@ApplicationContext context: Context) = Room.databaseBuilder(
        context,
        AppDataBase::class.java,
        "Note-db"
    ).build()

    @Provides
    fun noteDao(appDatabase: AppDataBase) : NoteDao = appDatabase.noteDao()
}