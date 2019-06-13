package com.pucminas.livrariaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pucminas.livrariaapi.domain.CarrinhoCompra;

public interface CarroinhoComprasRepository extends JpaRepository<CarrinhoCompra, Long>{
	
}
