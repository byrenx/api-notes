package com.byrenx.apinotes.service;

import java.util.Optional;

import com.byrenx.apinotes.entities.Note;

public interface INotesService {
    Note createNote(Note body);
    Optional<Note> getNote(Long id);
}
