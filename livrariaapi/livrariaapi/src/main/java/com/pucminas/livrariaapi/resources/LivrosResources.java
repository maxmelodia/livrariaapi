package com.pucminas.livrariaapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pucminas.livrariaapi.domain.Livro;
import com.pucminas.livrariaapi.repository.LivrosRepository;

@RestController
@RequestMapping("/livros")
public class LivrosResources {
	
	@Autowired 
	LivrosRepository livrosRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Livro> listar() {
		return livrosRepository.findAll(); 
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void salvar(@RequestBody Livro livro) {
		livrosRepository.save(livro);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void alterar(@RequestBody Livro livro) {
		livrosRepository.save(livro);
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity delete(@RequestBody Livro livro, @PathVariable long id){
		livro.setId(id);
		livrosRepository.delete(livro);
        return new ResponseEntity("Livro deletado com sucesso!", HttpStatus.OK);
    }	


}