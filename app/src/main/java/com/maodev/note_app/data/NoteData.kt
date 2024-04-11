package com.maodev.note_app.data

import com.maodev.note_app.model.Note


class NotesDataSource {

    //TODO Fix dates
    fun loadNotes(): List<Note> {
        return listOf(
            Note(
                noteTitle = "A good day",
                noteDescription = "We went on a vacation by the lake",
                noteDateCreated = "DATE"
            ),
            Note(
                noteTitle = "Android Compose",
                noteDescription = "Working on Android Compose course today",
                noteDateCreated = "DATE"
            ),
            Note(
                noteTitle = "Keep at it...",
                noteDescription = "Sometimes things just happen",
                noteDateCreated = "DATE"
            ),
            Note(
                noteTitle = "A movie day",
                noteDescription = "Watching a movie with family today",
                noteDateCreated = "DATE"
            ),
            Note(
                noteTitle = "A movie day",
                noteDescription = "Watching a movie with family today",
                noteDateCreated = "DATE"
            ),
            Note(
                noteTitle = "A movie day",
                noteDescription = "Watching a movie with family today",
                noteDateCreated = "DATE"
            ),
            Note(
                noteTitle = "A movie day",
                noteDescription = "Watching a movie with family today",
                noteDateCreated = "DATE"
            ),
            Note(
                noteTitle = "A movie day",
                noteDescription = "Watching a movie with family today",
                noteDateCreated = "DATE"
            ),
            Note(
                noteTitle = "A movie day",
                noteDescription = "Watching a movie with family today",
                noteDateCreated = "DATE"
            ),
            Note(
                noteTitle = "A movie day",
                noteDescription = "Watching a movie with family",
                noteDateCreated = "DATE"
            )
        )
    }
}