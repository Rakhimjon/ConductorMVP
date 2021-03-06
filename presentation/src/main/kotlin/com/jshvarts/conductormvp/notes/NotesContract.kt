package com.jshvarts.conductormvp.notes

import com.jshvarts.notedomain.model.Note

/**
 * MVP Contract for displaying list of notes.
 */
interface NotesContract {

    interface View {
        fun onLoadNotesSuccess(notes: List<Note>)
        fun onLoadNotesError(throwable: Throwable)
        fun onFabClicked()
    }

    interface Presenter {
        fun loadNotes()
    }
}