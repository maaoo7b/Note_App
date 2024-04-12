package com.maodev.note_app.model


import java.time.Instant
import java.util.Date
import java.util.UUID

data class Note(
    val noteId:UUID = UUID.randomUUID(),
    val noteTitle : String,
    val noteDescription : String,
    val noteDateCreated: Date? = Date.from(Instant.now())
)
