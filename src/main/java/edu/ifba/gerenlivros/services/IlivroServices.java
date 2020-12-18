package edu.ifba.gerenlivros.services;

import java.util.List;

import edu.ifba.gerenlivros.model.Livros;

public interface IlivroServices {
	
	void save(Livros p);
	
	void delete(Integer id);
	
	Livros find(Integer id);
	
	List<Livros> findall();

}
