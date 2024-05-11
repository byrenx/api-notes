package com.byrenx.apinotes.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.byrenx.apinotes.entities.Note;
import com.byrenx.apinotes.repositories.NotesJpaRepository;

@Component
public class NotesService implements INotesService {

    private final NotesJpaRepository notesJpaRepository;
    
    @Autowired
    public NotesService(NotesJpaRepository notesJpaRepository) {
        this.notesJpaRepository = notesJpaRepository;
    }

    @Override
    public Note createNote(Note body) {
        return this.notesJpaRepository.save(body);
    }

    @Override
    public Optional<Note> getNote(Long id) {
        return this.notesJpaRepository.findById(id);
    }
}
