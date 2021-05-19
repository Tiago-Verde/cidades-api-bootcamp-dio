package com.tiagoverde.cidadesapi;
import com.tiagoverde.cidadesapi.paises.Pais;
import com.tiagoverde.cidadesapi.repositorio.IRepositorioPaises;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/paises")
public class RecursosPaises {

    @Autowired
    public IRepositorioPaises repository;

    @GetMapping
    public List<Pais> paises(){
        return repository.findAll();

    }
}
