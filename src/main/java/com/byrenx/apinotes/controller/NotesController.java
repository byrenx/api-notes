package com.byrenx.apinotes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.byrenx.apinotes.entities.Note;
import com.byrenx.apinotes.service.NotesService;

@RestController()
public class NotesController {
    private final NotesService notesService;

    @Autowired
    NotesController(NotesService notesService) {
        this.notesService = notesService;
    } 

    @PostMapping("/notes")
    public ResponseEntity<Note> createNewNote(@RequestBody Note body) {
        Note newNote = this.notesService.createNote(body);
        return new ResponseEntity<>(newNote, HttpStatus.CREATED);
    }

    @GetMapping("/notes/{id}")
    @ResponseBody
    public ResponseEntity<Note> getNote(@PathVariable Long id) throws Exception {
        Note note = this.notesService.getNote(id);
        return new ResponseEntity<>(note, HttpStatus.OK);
    }

    @GetMapping("/notes")
    public ResponseEntity<List<Note>> getAllNotes() {
        return new ResponseEntity<>(this.notesService.allNotes(), HttpStatus.OK);
    }

    @PutMapping("/notes/{id}")
    public ResponseEntity<Note> updateNote(@PathVariable Long id, @RequestBody Note body) throws Exception {
        return new ResponseEntity<>(this.notesService.updateNote(id, body), HttpStatus.OK);
    }

    @DeleteMapping("/notes/{id}")
    public ResponseEntity<String> deleteNote(@PathVariable Long id) {
        this.notesService.deleteNote(id);
        return new ResponseEntity<>("Note was successfully deleted", HttpStatus.OK);
    }
}
