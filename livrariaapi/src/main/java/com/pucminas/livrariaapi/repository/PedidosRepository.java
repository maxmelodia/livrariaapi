package com.pucminas.livrariaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pucminas.livrariaapi.domain.Pedido;

public interface PedidosRepository extends JpaRepository<Pedido, Long>{

}
