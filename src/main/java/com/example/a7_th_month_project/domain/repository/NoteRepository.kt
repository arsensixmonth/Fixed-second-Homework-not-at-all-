package com.example.a7_th_month_project.domain.repository

import com.example.a7_th_month_project.domain.model.Note
import com.example.a7_th_month_project.domain.utils.ResultStatus
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun createNote(note : Note) : Flow<ResultStatus<Unit>>
    fun updateNote(note : Note) : Flow<ResultStatus<Unit>>
    fun deleteNote(note : Note) : Flow<ResultStatus<Unit>>
    fun getAllNotes() : Flow<ResultStatus<List<Note>>>
}