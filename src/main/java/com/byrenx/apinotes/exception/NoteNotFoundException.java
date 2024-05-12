package com.byrenx.apinotes.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Note not found")
public class NoteNotFoundException extends RuntimeException{

}
