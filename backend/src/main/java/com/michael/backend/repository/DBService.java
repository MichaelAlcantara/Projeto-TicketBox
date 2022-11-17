package com.michael.backend.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.michael.backend.domain.Assentos;
import com.michael.backend.domain.Cinema;
import com.michael.backend.domain.Cliente;
import com.michael.backend.domain.Compra;
import com.michael.backend.domain.Filme;
import com.michael.backend.domain.FormaPagamento;
import com.michael.backend.domain.Sessao;

@Service
public class DBService {

    @Autowired
    private CinemaRepository cinema;

    @Autowired
    private ClienteRepository cliente;

    @Autowired
    private CompraRepository compra;

    @Autowired
    private FilmesRepository filmes;

    @Autowired
    private FormaPagamentoRepository pagamento;

    @Autowired
    private SessaoRepository sessao;
    
    @Autowired
    private AssentoRepository repository;

    @Bean
    public void instanciaDB() {
        Filme fil1 = new Filme(null, "Vingadores", "Ação", 14, 240, "aaaaaaaa", 1);
        Filme fil2 = new Filme(null, "Batman", "Ação", 16, 120, "aaaaaaaa", 1);
        Filme fil3 = new Filme(null, "Bob esponja", "Desenho", 0, 245, "aaaaaaaa", 1);
        Filme fil4 = new Filme(null, "Avatar", "Aventura", 10, 160, "aaaaaaaa", 1);
        Filme fil5 = new Filme(null, "Barbie", "Desenho", 0, 90, "aaaaaaaa", 1);

        
        Cinema cine1 = new Cinema(null, "a", "a");
        Cinema cine2 = new Cinema(null, "b", "b");
        Cinema cine3 = new Cinema(null, "c", "c");
        Cinema cine4 = new Cinema(null, "d", "d");
        Cinema cine5 = new Cinema(null, "e", "e");
        
        ArrayList<Cinema> cinemas = new ArrayList<>();
        cinemas.add(cine1);
        cinemas.add(cine2);
        cinemas.add(cine3);
        cinemas.add(cine4);
        cinemas.add(cine5);
        
        ArrayList<Filme> filmess = new ArrayList<>();
        filmess.add(fil1);
        filmess.add(fil1);
        filmess.add(fil1);
        filmess.add(fil1);
        filmess.add(fil1);
        
        Sessao ses1 = null;
        for(Filme fil : filmess) {
            ses1 = new Sessao(null, 10.0, fil, cine5);
        }
        Sessao ses2 = new Sessao(null, 20.0, fil1, cine4);
        Sessao ses3 = new Sessao(null, 10.0, fil1, cine3);
        Sessao ses4 = new Sessao(null, 30.0, fil1, cine2);
        Sessao ses5 = new Sessao(null, 50.0, fil1, cine1);
        
        Cliente clie1 = new Cliente(null, "michael@email.com", "12345", LocalDate.of(2002, 8, 14));
        Cliente clie2 = new Cliente(null, "fraude@email.com", "123456", LocalDate.of(1990, 4, 20));

        
        FormaPagamento pag1 = new FormaPagamento(null, "Débito");
        FormaPagamento pag2 = new FormaPagamento(null, "Crédito");
        FormaPagamento pag3 = new FormaPagamento(null, "Dinheiro");
        
        Compra comp1 = new Compra(null, 40.0, 20.0, ses1, clie1, pag1);
        Compra comp2 = new Compra(null, 30.0, 15.0, ses2, clie2, pag2);
        Compra comp3 = new Compra(null, 50.0, 25.0, ses3, clie1, pag3);
        Compra comp4 = new Compra(null, 60.0, 30.0, ses4, clie2, pag1);
        Compra comp5 = new Compra(null, 20.0, 10.0, ses5, clie1, pag2);
        
        cinema.saveAll(Arrays.asList(cine1,cine2,cine3,cine4,cine5));
        filmes.saveAll(Arrays.asList(fil1,fil2,fil3,fil4,fil5));
        sessao.saveAll(Arrays.asList(ses1,ses2,ses3,ses4,ses5));
        cliente.saveAll(Arrays.asList(clie1,clie2));
        pagamento.saveAll(Arrays.asList(pag1,pag2,pag3));
        compra.saveAll(Arrays.asList(comp1,comp2,comp3,comp4,comp5));
        

       
        //Assentos E
        Assentos e1 = new Assentos(null,"E01", false);
        Assentos e2 = new Assentos(null,"E02", false);
        Assentos e3 = new Assentos(null,"E03", false);
        Assentos e4 = new Assentos(null,"E04", false);
        Assentos e5 = new Assentos(null,"E05", false);
        Assentos e6 = new Assentos(null,"E06", false);
        Assentos e7 = new Assentos(null,"E07", false);
        Assentos e8 = new Assentos(null,"E08", false);
        Assentos e9 = new Assentos(null,"E09", false);
        Assentos e10 = new Assentos(null,"E10", false);
        Assentos e11 = new Assentos(null,"E11", false);
        Assentos e12 = new Assentos(null,"E12", false);

        //Assentos D
        Assentos d1 = new Assentos(null,"D01", false);
        Assentos d2 = new Assentos(null,"D02", false);
        Assentos d3 = new Assentos(null,"D03", false);
        Assentos d4 = new Assentos(null,"D04", false);
        Assentos d5 = new Assentos(null,"D05", false);
        Assentos d6 = new Assentos(null,"D06", false);
        Assentos d7 = new Assentos(null,"D07", false);
        Assentos d8 = new Assentos(null,"D08", false);
        Assentos d9 = new Assentos(null,"D09", false);
        Assentos d10 = new Assentos(null,"D10", false);
        Assentos d11 = new Assentos(null,"D11", false);
        Assentos d12 = new Assentos(null,"D12", false);

        //Assentos C
        Assentos c1 = new Assentos(null,"C01", false);
        Assentos c2 = new Assentos(null,"C02", false);
        Assentos c3 = new Assentos(null,"C03", false);
        Assentos c4 = new Assentos(null,"C04", false);
        Assentos c5 = new Assentos(null,"C05", false);
        Assentos c6 = new Assentos(null,"C06", false);
        Assentos c7 = new Assentos(null,"C07", false);
        Assentos c8 = new Assentos(null,"C08", false);
        Assentos c9 = new Assentos(null,"C09", false);
        Assentos c10 = new Assentos(null,"C10", false);
        Assentos c11 = new Assentos(null,"C11", false);
        Assentos c12 = new Assentos(null,"C12", false);
        
        //Assentos B
        Assentos b1 = new Assentos(null,"B01", false);
        Assentos b2 = new Assentos(null,"B02", false);
        Assentos b3 = new Assentos(null,"B03", false);
        Assentos b4 = new Assentos(null,"B04", false);
        Assentos b5 = new Assentos(null,"B05", false);
        Assentos b6 = new Assentos(null,"B06", false);
        Assentos b7 = new Assentos(null,"B07", false);
        Assentos b8 = new Assentos(null,"B08", false);
        Assentos b9 = new Assentos(null,"B09", false);
        Assentos b10 = new Assentos(null,"B10", false);
        Assentos b11 = new Assentos(null,"B11", false);
        Assentos b12 = new Assentos(null,"B12", false);
        
        //Assentos A
        Assentos a1 = new Assentos(null,"A01", false);
        Assentos a2 = new Assentos(null,"A02", false);
        Assentos a3 = new Assentos(null,"A03", false);
        Assentos a4 = new Assentos(null,"A04", false);
        Assentos a5 = new Assentos(null,"A05", false);
        Assentos a6 = new Assentos(null,"A06", false);
        Assentos a7 = new Assentos(null,"A07", false);
        Assentos a8 = new Assentos(null,"A08", false);
        Assentos a9 = new Assentos(null,"A09", false);
        Assentos a10 = new Assentos(null,"A10", false);
        Assentos a11 = new Assentos(null,"A11", false);
        Assentos a12 = new Assentos(null,"A12", false);
        
        repository.saveAll(Arrays.asList(
                e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,
                d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,
                c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,
                b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,
                a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12
                ));
        
    }

}
