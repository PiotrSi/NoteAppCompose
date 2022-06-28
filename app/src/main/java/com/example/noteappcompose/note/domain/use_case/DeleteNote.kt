package com.example.noteappcompose.note.domain.use_case

import com.example.noteappcompose.note.domain.model.Note
import com.example.noteappcompose.note.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}