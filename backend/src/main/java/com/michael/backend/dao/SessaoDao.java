package com.michael.backend.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import com.michael.backend.domain.Cliente;
import com.michael.backend.domain.Sessao;
import com.michael.backend.domain.dto.ClienteDTO;
import com.michael.backend.domain.dto.SessaoDTO;

@Repository
public class SessaoDao {

    private static String CINEMA = "SELECT * FROM SESSAO ";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Sessao> findAllByCinema(Integer idCinema) {
        return jdbcTemplate.query(CINEMA.concat("WHERE CINEMA_ID = ?"), new Object[] { idCinema }, obterClienteMapping());
    }


    private RowMapper<Sessao> obterClienteMapping() {
        return new RowMapper<Sessao>() {
            @Override
            public Sessao mapRow(ResultSet resultSet, int i) throws SQLException {
                Integer idCinema = resultSet.getInt("cinema_id");
                Integer idSessao = resultSet.getInt("id_sessao");
                Date dDisponivel = resultSet.getDate("d_disponivel");
                Double preco = resultSet.getDouble("preco");
                Integer idFilme = resultSet.getInt("filme_id");
                return new Sessao(idCinema);
            }
        };
    }

    
}
