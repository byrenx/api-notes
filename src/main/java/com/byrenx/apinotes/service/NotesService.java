package com.byrenx.apinotes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.byrenx.apinotes.entities.Note;
import com.byrenx.apinotes.exception.NoteNotFoundException;
import com.byrenx.apinotes.repositories.NotesArrayRepository;

@Component
public class NotesService implements INotesService {

    private final NotesArrayRepository notesArrayRepository;
    
    @Autowired
    public NotesService(NotesArrayRepository notesArrayRepository) {
        this.notesArrayRepository = notesArrayRepository;
    }

    @Override
    public Note createNote(Note body) {
        return this.notesArrayRepository.save(body);
    }

    @Override
    public Note getNote(Long id) {
        Optional<Note> optionalNote = this.notesArrayRepository.findById(id);
        if (optionalNote.isPresent()) return optionalNote.get();
        throw new NoteNotFoundException();
    }

    @Override
    public List<Note> allNotes() {
        return this.notesArrayRepository.findAll();
    }

    @Override
    public Note updateNote(Long id, Note body) {
        Optional<Note> optionalNote = this.notesArrayRepository.findById(id);
        if (!optionalNote.isPresent()) {
            throw new NoteNotFoundException();
        }
        Note note = optionalNote.get(); 
        note.setBody(body.getBody());
        note.setTitle(body.getTitle());
        return note;
    }

    @Override
    public void deleteNote(Long id) {
        this.notesArrayRepository.delete(id);
    }
}
