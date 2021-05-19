package com.tiagoverde.cidadesapi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paises")
public class RecursosPaises {

    @GetMapping
    public List<Pais> paises(){

        return

    }
}
