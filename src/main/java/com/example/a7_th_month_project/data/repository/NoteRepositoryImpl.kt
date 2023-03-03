package com.example.a7_th_month_project.data.repository

import com.example.a7_th_month_project.data.local.NoteDao
import com.example.a7_th_month_project.data.mapper.toNote
import com.example.a7_th_month_project.data.mapper.toNoteEntity
import com.example.a7_th_month_project.domain.model.Note
import com.example.a7_th_month_project.domain.repository.NoteRepository
import com.example.a7_th_month_project.domain.utils.ResultStatus
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.io.IOException
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val dao : NoteDao
) : NoteRepository{

    override fun createNote(note: Note) = flow {
        emit(ResultStatus.Loading())
        try {
            val data = dao.insert(note.toNoteEntity())
            emit(ResultStatus.Success(data))
        }catch (e: IOException){
            emit(ResultStatus.Error(e.message))
        }
    }.flowOn(Dispatchers.IO)


    override fun updateNote(note: Note) = flow {
        emit(ResultStatus.Loading())
        try {
            val data = dao.update(note.toNoteEntity())
            emit(ResultStatus.Success(data))
        }catch (e: IOException){
            emit(ResultStatus.Error(e.message))
        }
    }.flowOn(Dispatchers.IO)


    override fun deleteNote(note: Note) = flow {
        emit(ResultStatus.Loading())
        try {
            val data = dao.delete(note.toNoteEntity())
            emit(ResultStatus.Success(data))
        }catch (e: IOException){
            emit(ResultStatus.Error(e.message))
        }
    }.flowOn(Dispatchers.IO)


    override fun getAllNotes(): List<Note> = flow {
        emit(ResultStatus.Loading())
        try {
            val data = dao.getAllNotes(note.toNoteEntity())
            emit(ResultStatus.Success(data))
        }catch (e: IOException){
            emit(ResultStatus.Error(e.message))
        }
    }.flowOn(Dispatchers.IO)
}