package com.byrenx.apinotes.service;

import java.util.List;

import com.byrenx.apinotes.entities.Note;

public interface INotesService {
    Note createNote(Note body);
    Note getNote(Long id);
    List<Note> allNotes();
    Note updateNote(Long id, Note body);
    void deleteNote(Long id);
}
