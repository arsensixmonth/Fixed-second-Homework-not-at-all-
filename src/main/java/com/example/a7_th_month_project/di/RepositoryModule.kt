package com.example.a7_th_month_project.di

import com.example.a7_th_month_project.data.repository.NoteRepositoryImpl
import com.example.a7_th_month_project.domain.repository.NoteRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent :: class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun noteRepository(noteRepositoryImpl : NoteRepositoryImpl) : NoteRepository
}