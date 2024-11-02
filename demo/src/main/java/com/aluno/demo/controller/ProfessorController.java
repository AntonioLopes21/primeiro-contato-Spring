package com.aluno.demo.controller;

import com.aluno.demo.model.Professor;
import com.aluno.demo.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professores")

public class ProfessorController {
    @Autowired
    private ProfessorRepository professorRepository;

    @PostMapping("/add")
    public ResponseEntity<String> AddProfessor(@RequestBody Professor professor) {
        professorRepository.save(professor);

        return ResponseEntity.ok("Professor adicionado com sucesso!");
    }

    @GetMapping("/listTeacher")
    public ResponseEntity<List<Professor>>  listProfessor(){
        List<Professor> professores = professorRepository.findAll();

        return ResponseEntity.ok(professores);
    }


}
