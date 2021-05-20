package com.tiagoverde.cidadesapi.distancias;
import com.tiagoverde.cidadesapi.distancias.servico.ServicoDistancia;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distancias")



public class RecursosDistancia {

    private final ServicoDistancia service;
    Logger log = LoggerFactory.getLogger(RecursosDistancia.class);

    public RecursosDistancia(ServicoDistancia service) {
        this.service = service;
    }

    @GetMapping("/by-points")
    public Double byPoints(@RequestParam(name = "from") final Long cidade1,
                           @RequestParam(name = "to") final Long cidade2) {
        log.info("byPoints");
        return service.distanceByPointsInMiles(cidade1, cidade2);
    }

    @GetMapping("/by-cube")
    public Double byCube(@RequestParam(name = "from") final Long cidade1,
                         @RequestParam(name = "to") final Long cidade2) {
        log.info("byCube");
        return service.distanceByCubeInMeters(cidade1, cidade2);
    }


}



