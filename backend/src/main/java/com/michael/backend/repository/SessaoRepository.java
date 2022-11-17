package com.michael.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.michael.backend.domain.Sessao;

public interface SessaoRepository extends JpaRepository<Sessao, Integer>{

    List<Sessao> findAllByCinema(@Param(value = "cinema_id") Integer idCinema);
    
    @Query("SELECT obj FROM Sessao obj WHERE obj.filme.id = filme_id")
    List<Sessao> findAllByFilme(@Param(value = "filme_id") Integer idFilme);
	
}
