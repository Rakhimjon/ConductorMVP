package com.jshvarts.notedata

import com.jshvarts.notedomain.model.Note
import com.jshvarts.notedomain.repository.NoteModelMapper

/**
 * Maps between Room database entity and model.
 */
class NoteModelMapperImpl : NoteModelMapper<NoteEntity, Note> {
    override fun fromEntity(from: NoteEntity) = Note(from.id, from.noteText)
    override fun toEntity(from: Note) = NoteEntity(from.id, from.noteText, System.currentTimeMillis())
}