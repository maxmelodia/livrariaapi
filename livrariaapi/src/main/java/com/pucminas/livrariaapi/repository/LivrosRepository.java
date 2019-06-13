package com.pucminas.livrariaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pucminas.livrariaapi.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long>{
	
}
