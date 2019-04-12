package com.pucminas.livrariaapi.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
public class Pedido {

	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private Date data;
	@Transient
	private CarrinhoCompra carrinhoCompra;
	
	private Double total;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public CarrinhoCompra getCarrinhoCompra() {
		return carrinhoCompra;
	}

	public void setCarrinhoCompra(CarrinhoCompra carrinhoCompra) {
		this.carrinhoCompra = carrinhoCompra;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

}
