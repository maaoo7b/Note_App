package com.maodev.note_app.repository

import com.maodev.note_app.data.NoteDatabaseDAO
import com.maodev.note_app.model.Note
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class NoteRepository @Inject constructor(private val noteDatabaDAO: NoteDatabaseDAO) {

    suspend fun addNote(note: Note) = noteDatabaDAO.addNote(note)

    suspend fun deleteNote(note: Note) = noteDatabaDAO.deleteNote(note)

    suspend fun updateNote(note: Note) = noteDatabaDAO.updateNote(note)

    fun getAllNotes(): Flow<List<Note>> =
        noteDatabaDAO.getAllNotes().flowOn(Dispatchers.IO).conflate()

}