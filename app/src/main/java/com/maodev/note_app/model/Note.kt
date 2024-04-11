package com.maodev.note_app.model


import java.util.UUID

data class Note(
    val noteId:UUID = UUID.randomUUID(),
    val noteTitle : String,
    val noteDescription : String,
    val noteDateCreated: String
)
