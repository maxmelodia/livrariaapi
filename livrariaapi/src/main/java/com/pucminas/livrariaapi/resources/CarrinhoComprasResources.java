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

import com.pucminas.livrariaapi.domain.CarrinhoCompra;
import com.pucminas.livrariaapi.repository.CarroinhoComprasRepository;

@RestController
@RequestMapping("/carrinhocompras")
public class CarrinhoComprasResources {

	@Autowired
	CarroinhoComprasRepository carroinhoComprasRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<CarrinhoCompra> listar() {
		return carroinhoComprasRepository.findAll(); 
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void salvar(@RequestBody CarrinhoCompra carrinhoCompra) {
		carroinhoComprasRepository.save(carrinhoCompra);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void alterar(@RequestBody CarrinhoCompra carrinhoCompra) {
		carroinhoComprasRepository.save(carrinhoCompra);
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity delete(@RequestBody CarrinhoCompra carrinhoCompra, @PathVariable long id){
		carrinhoCompra.setId(id);
		carroinhoComprasRepository.delete(carrinhoCompra);
        return new ResponseEntity("Carrinho deletado com sucesso!", HttpStatus.OK);
    }		
	
}
