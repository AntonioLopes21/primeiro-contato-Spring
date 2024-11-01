package com.aluno.demo.repository;

import com.aluno.demo.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;



public interface AlunoRepository  extends JpaRepository<Aluno, Integer>{


}
