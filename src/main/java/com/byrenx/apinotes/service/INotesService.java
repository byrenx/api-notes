package com.byrenx.apinotes.service;

import com.byrenx.apinotes.dto.NoteDTO;

public interface INotesService {
    void createNote(NoteDTO body);
    NoteDTO getNote(Long id);
}
