package com.tiagoverde.cidadesapi.cidades.recursos;


import com.tiagoverde.cidadesapi.cidades.Cidade;
import com.tiagoverde.cidadesapi.cidades.repositorio.IRepositorioCidades;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.PagesPerMinute;

@RestController
@RequestMapping("cidades")

public class RecursosCidade {

    private final IRepositorioCidades repository;

    public RecursosCidade(final IRepositorioCidades repository){
        this.repository = repository;
    }

    @GetMapping
    public Page<Cidade> cidades(final Pageable page){
        return repository.findAll(page);
    }
}
