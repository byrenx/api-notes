package com.byrenx.apinotes.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.byrenx.apinotes.entities.Note;
import com.byrenx.apinotes.exception.NoteNotFoundException;

public class NotesArrayRepository {
    private List<Note> notes = new ArrayList<Note>();
    private int index = 0;

    public NotesArrayRepository() {}

    public Note save(Note note) {
        Long newID = (long) (index + 1);
        index++;

        note.setId(newID);
        notes.add(note);
        return note;
    }

    public Optional<Note> findById(Long id) {
        for (int i = 0; i < notes.size(); i++) {
            Note note = notes.get(i);
            if (note.getId() == id) {
                return Optional.of(note);
            }
        }
        return Optional.empty();
    }

    public List<Note> findAll() {
        return notes;
    }

    public void delete(Long id) {
        for (int i = 0; i < notes.size(); i++) {
            Note note = notes.get(i);
            if (note.getId() == id) {
                notes.remove(i);
                return;
            }
        } 
        throw new NoteNotFoundException();
    }
}
