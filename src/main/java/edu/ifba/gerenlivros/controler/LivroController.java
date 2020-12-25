package edu.ifba.gerenlivros.controler;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import edu.ifba.gerenlivros.model.Livros;
import edu.ifba.gerenlivros.services.impl.LivrosService;

@Controller
public class LivroController {

	@Autowired
	private LivrosService service;
	
	
	@GetMapping("/livro/list")
	public String findAll(Model model) {
		model.addAttribute("livro", service.findall());
		return "livro/list";
	}
	
	@GetMapping("/livro/delete/{id}") 
	public String delete(@PathVariable(name = "id" ) Integer id) {
		service.delete(id);
		return "redirect:/livro/list";
	}
	
	
	
	@GetMapping("/livro/details/{id}") 
	public String find(@PathVariable Integer id, Model model){
		
		model.addAttribute("livro", service.find(id));
		model.addAttribute("mode", "view");
		return "livro/registration-form";
	}
	
	
	@GetMapping ({"livro/save/{id}", "/livro/save"}) 
	public String LoadRegistrationform(@PathVariable(required = false) Integer id, Model model) {
		Livros p;
		String mode;
		if(id==null) {
			mode = "create";
			p = new Livros();
		} else {
			mode = "update";
			p = service.find(id);
		}
		
		model.addAttribute("livro",p);
		model.addAttribute("mode", mode);
		
		return "livro/registration-form";
			
	}
	
	
	@PostMapping("livro/save")
	public String save(@ModelAttribute Livros p) {
		p.setCadastro(new Date());
		service.save(p);
		return "redirect:/livro/list";
		
	}
	
	
	
}
