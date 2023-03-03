package com.example.a7_th_month_project.data.local

import androidx.room.*
import com.example.a7_th_month_project.data.model.NoteEntity
import com.example.a7_th_month_project.domain.model.Note

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(noteEntity : NoteEntity)

    @Update
    suspend fun update(noteEntity : NoteEntity)

    @Delete
    suspend fun delete(noteEntity : NoteEntity)

    @Query("SELECT * FROM notes")
    suspend fun getAllNotes() : List<NoteEntity>
}