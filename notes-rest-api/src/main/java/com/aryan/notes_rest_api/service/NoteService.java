package com.aryan.notes_rest_api.service;

import com.aryan.notes_rest_api.model.Note;
import com.aryan.notes_rest_api.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    @Autowired
    private NoteRepository repository;

    public List<Note> getAllNotes() { return repository.findAll(); }

    public Note createNote(Note note) { return repository.save(note); }

    public Note updateNote(Long id, Note details) {
        Note note = repository.findById(id).orElseThrow();
        note.setTitle(details.getTitle());
        note.setContent(details.getContent());
        return repository.save(note);
    }

    public void deleteNote(Long id) { repository.deleteById(id); }
}
