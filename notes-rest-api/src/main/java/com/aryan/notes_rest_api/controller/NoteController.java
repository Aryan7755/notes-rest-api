package com.aryan.notes_rest_api.controller;

import com.aryan.notes_rest_api.model.Note;
import com.aryan.notes_rest_api.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {
    @Autowired
    private NoteService service;

    @GetMapping
    public List<Note> getAll() { return service.getAllNotes(); }

    @PostMapping
    public Note create(@RequestBody Note note) { return service.createNote(note); }

    @PutMapping("/{id}")
    public Note update(@PathVariable Long id, @RequestBody Note note) {
        return service.updateNote(id, note);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteNote(id); }
}
