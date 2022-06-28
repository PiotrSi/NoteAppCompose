package com.example.noteappcompose.note.domain.use_case

import com.example.noteappcompose.note.domain.model.Note
import com.example.noteappcompose.note.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}