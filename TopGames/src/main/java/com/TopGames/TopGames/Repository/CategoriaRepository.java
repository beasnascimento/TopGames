package com.TopGames.TopGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.http.ResponseEntity.HeadersBuilder;

import com.TopGames.TopGames.Model.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria, Long> {

	public List <Categoria> findAllByDescricaoContainingIgnoreCase (String descricao);


}
