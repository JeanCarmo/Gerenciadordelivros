package edu.ifba.gerenlivros.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.ifba.gerenlivros.model.Livros;

@Service
public interface IlivroServices {
	
	void save(Livros p);
	
	void delete(Integer id);
	
	Livros find(Integer id);
	
	List<Livros> findall();

}
