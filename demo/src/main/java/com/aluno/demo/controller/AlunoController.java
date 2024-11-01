package com.aluno.demo.controller;

import com.aluno.demo.model.Aluno;
import com.aluno.demo.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/alunos") //endpoint


public class AlunoController {
    @Autowired
    private AlunoRepository alunoRepository;

    @PostMapping("/add")
    public ResponseEntity<String> addAluno(@RequestBody Aluno aluno) {
        alunoRepository.save(aluno);

        return ResponseEntity.ok("Aluno adicionado com sucesso!");
    }

    @GetMapping("/list")
    public ResponseEntity<List<Aluno>> listAluno() {
        List<Aluno> alunos = alunoRepository.findAll();
        return ResponseEntity.ok(alunos);
    }


}
