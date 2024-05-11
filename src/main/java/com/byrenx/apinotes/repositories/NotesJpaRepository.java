package com.byrenx.apinotes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.byrenx.apinotes.entities.Notes;

public interface NotesJpaRepository extends JpaRepository<Notes, Long>{
    
}
