package com.tiagoverde.cidadesapi.paises.repositorio;

import com.tiagoverde.cidadesapi.paises.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorioPaises extends JpaRepository<Pais, Long> {
}
