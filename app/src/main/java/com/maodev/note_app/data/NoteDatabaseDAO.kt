package com.maodev.note_app.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.maodev.note_app.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDatabaseDAO {

    @Query("SELECT * FROM notestable")
    fun getAllNotes(): Flow<List<Note>>

    @Query("SELECT * FROM notestable WHERE noteId=:id")
    suspend fun getNote(id: String): Note

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addNote(note: Note)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateNote(note: Note)

    @Query("DELETE FROM notestable")
    suspend fun deleteAllNotes()

    @Delete
    suspend fun deleteNote(note: Note)


}
