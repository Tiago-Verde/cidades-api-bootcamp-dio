package com.tiagoverde.cidadesapi.estados.repositorio;

import com.tiagoverde.cidadesapi.estados.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorioEstados extends JpaRepository<Estado, Long> {
}
