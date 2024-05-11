package com.byrenx.apinotes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.byrenx.apinotes.dto.NoteDTO;
import com.byrenx.apinotes.repositories.NotesJpaRepository;

@Component
public class NotesService implements INotesService {

    private final NotesJpaRepository notesJpaRepository;
    
    @Autowired
    public NotesService(NotesJpaRepository notesJpaRepository) {
        this.notesJpaRepository = notesJpaRepository;
    }

    @Override
    public void createNote(NoteDTO body) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createNote'");
    }

    @Override
    public NoteDTO getNote(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNote'");
    }
}
