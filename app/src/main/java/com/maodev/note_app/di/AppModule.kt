package com.maodev.note_app.di

import android.content.Context
import androidx.room.Room
import com.maodev.note_app.data.NoteDatabase
import com.maodev.note_app.data.NoteDatabaseDAO
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providesNotesDAO(noteDatabase: NoteDatabase): NoteDatabaseDAO = noteDatabase.noteDAO()

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): NoteDatabase =
        Room.databaseBuilder(
            context,
            NoteDatabase::class.java,
            name = "NotesTable"
        ).fallbackToDestructiveMigration().build()
}