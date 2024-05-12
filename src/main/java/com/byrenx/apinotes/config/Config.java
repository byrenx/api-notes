package com.byrenx.apinotes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.byrenx.apinotes.repositories.NotesArrayRepository;

@Configuration
public class Config {
    @Bean
    public NotesArrayRepository notesArrayRepository() {
        return new NotesArrayRepository();
    } 
}
