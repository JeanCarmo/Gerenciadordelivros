package edu.ifba.gerenlivros.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import edu.ifba.gerenlivros.model.Livros;
import edu.ifba.gerenlivros.repository.IlivrosRepository;
import edu.ifba.gerenlivros.services.IlivroServices;

@Service
public class LivrosService implements IlivroServices{

	@Autowired
	private IlivrosRepository repository; 
	
	
	@Override
	public void save(Livros p) {
		
		repository.save(p);
		
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public Livros find(Integer id) {
	Optional<Livros> p = repository.findById(id);
	return p.isPresent() ? p.get() : null;
		

	}

	@Override
	public List<Livros> findall() {
		return repository.findAll(Sort.by("cadastro").descending());
	}

}
