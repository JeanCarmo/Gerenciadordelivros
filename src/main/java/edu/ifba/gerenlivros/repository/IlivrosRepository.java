package edu.ifba.gerenlivros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ifba.gerenlivros.model.Livros;

public interface IlivrosRepository 
extends JpaRepository<Livros, Integer>{

}
