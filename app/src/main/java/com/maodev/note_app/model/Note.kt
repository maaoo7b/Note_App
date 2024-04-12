package com.maodev.note_app.model


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Instant
import java.util.Date
import java.util.UUID

@Entity(tableName = "NotesTable")
data class Note(
    @PrimaryKey
    val noteId:UUID = UUID.randomUUID(),
    @ColumnInfo(name = "NoteTitle")
    val noteTitle : String,
    @ColumnInfo(name = "NoteDescription")
    val noteDescription : String,
    @ColumnInfo(name = "NoteDateCreated")
    val noteDateCreated: Date = Date.from(Instant.now())
)
