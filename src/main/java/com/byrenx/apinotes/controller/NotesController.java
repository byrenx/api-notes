package com.byrenx.apinotes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.byrenx.apinotes.entities.Note;
import com.byrenx.apinotes.service.NotesService;

/**
 * TODO:
 *  - use controller advice to handle specific exceptions, and response code
 *  - use Response entity
 */

@RestController()
public class NotesController {
    private final NotesService notesService;

    @Autowired
    NotesController(NotesService notesService) {
        this.notesService = notesService;
    } 

    @PostMapping("/notes")
    public Note createNewNote(@RequestBody Note body) {
        return this.notesService.createNote(body);
    }

    @GetMapping("/notes/{id}")
    public Note getNote(@PathVariable Long id) throws Exception {
        return this.notesService.getNote(id).orElseThrow(() -> new Exception());
    }
}
