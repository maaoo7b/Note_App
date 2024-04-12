package com.maodev.note_app.data

import com.maodev.note_app.model.Note


class NotesDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(
                noteTitle = "A good day",
                noteDescription = "We went on a vacation by the lake",
                noteDateCreated = null
            ),
            Note(
                noteTitle = "Android Compose",
                noteDescription = "Working on Android Compose course today",
                noteDateCreated = null
            ),
            Note(
                noteTitle = "Keep at it...",
                noteDescription = "Sometimes things just happen",
                noteDateCreated = null
            ),
            Note(
                noteTitle = "A movie day",
                noteDescription = "Watching a movie with family today",
                noteDateCreated = null
            ),
            Note(
                noteTitle = "A movie day",
                noteDescription = "Watching a movie with family today",
                noteDateCreated = null
            ),
            Note(
                noteTitle = "A movie day",
                noteDescription = "Watching a movie with family today",
                noteDateCreated = null
            ),
            Note(
                noteTitle = "A movie day",
                noteDescription = "Watching a movie with family today",
                noteDateCreated = null
            ),
            Note(
                noteTitle = "A movie day",
                noteDescription = "Watching a movie with family today",
                noteDateCreated = null
            ),
            Note(
                noteTitle = "A movie day",
                noteDescription = "Watching a movie with family today",
                noteDateCreated = null
            ),
            Note(
                noteTitle = "A movie day",
                noteDescription = "Watching a movie with family",
                noteDateCreated = null
            )
        )
    }
    //TODO Fix dates

}