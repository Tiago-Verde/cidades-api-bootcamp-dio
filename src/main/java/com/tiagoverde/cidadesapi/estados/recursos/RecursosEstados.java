package com.tiagoverde.cidadesapi.estados.recursos;

import com.tiagoverde.cidadesapi.estados.Estado;
import com.tiagoverde.cidadesapi.estados.repositorio.IRepositorioEstados;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estados")
public class RecursosEstados {

    private final IRepositorioEstados repository;

    public RecursosEstados(final IRepositorioEstados repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Estado> estado(){
        return repository.findAll();
    }

}
