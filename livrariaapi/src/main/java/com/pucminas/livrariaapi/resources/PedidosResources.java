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

import com.pucminas.livrariaapi.domain.Pedido;
import com.pucminas.livrariaapi.repository.PedidosRepository;

@RestController
@RequestMapping("/pedidos")
public class PedidosResources {

	@Autowired 
	PedidosRepository pedidosRepository;

	
	@RequestMapping(method = RequestMethod.GET)
	public List<Pedido> listar() {
		return pedidosRepository.findAll(); 
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void salvar(@RequestBody Pedido pedido) {
		pedidosRepository.save(pedido);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void alterar(@RequestBody Pedido pedido) {
		pedidosRepository.save(pedido);
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity delete(@RequestBody Pedido pedido, @PathVariable long id){
		pedido.setId(id);
		pedidosRepository.delete(pedido);
        return new ResponseEntity("Pedido deletado com sucesso!", HttpStatus.OK);
    }	

	
	
}
