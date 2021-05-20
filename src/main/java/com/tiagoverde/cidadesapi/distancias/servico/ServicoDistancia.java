package com.tiagoverde.cidadesapi.distancias.servico;

import java.util.Arrays;
import java.util.List;

import com.tiagoverde.cidadesapi.cidades.Cidade;
import com.tiagoverde.cidadesapi.cidades.repositorio.IRepositorioCidades;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;


@Service
public class ServicoDistancia {

    private final IRepositorioCidades repositorioCidades;
    Logger log = LoggerFactory.getLogger(ServicoDistancia.class);

    public ServicoDistancia(final IRepositorioCidades repositorioCidades) {
        this.repositorioCidades = repositorioCidades;
    }

    public Double distanceByPointsInMiles(final Long cidade1, final Long cidade2) {
        log.info("nativePostgresInMiles({}, {})", cidade1, cidade2);
        return repositorioCidades.distanceByPoints(cidade1, cidade2);
    }


    public Double distanceByCubeInMeters(Long cidade1, Long cidade2) {
        log.info("distanceByCubeInMeters({}, {})", cidade1, cidade2);
        final List<Cidade> cidades = repositorioCidades.findAllById((Arrays.asList(cidade1, cidade2)));

        Point p1 = cidades.get(0).getLocation();
        Point p2 = cidades.get(1).getLocation();

        return repositorioCidades.distanceByCube(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }


}

