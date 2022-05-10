package com.TopGames.TopGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TopGames.TopGames.Model.Produto;

public interface ProdutoRepository extends JpaRepository< Produto, Long> {

	public List <Produto> findAllByNomeContainingIgnoreCase (String nome);
}
