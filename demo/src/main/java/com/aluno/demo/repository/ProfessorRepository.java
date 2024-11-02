package com.aluno.demo.repository;

import com.aluno.demo.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProfessorRepository extends JpaRepository<Professor, Integer>{


}
