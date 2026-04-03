package com.aryan.notes_rest_api.repository;

import com.aryan.notes_rest_api.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    // Standard CRUD methods are automatically included
}
