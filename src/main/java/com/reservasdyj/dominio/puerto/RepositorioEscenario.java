package com.reservasdyj.dominio.puerto;

import com.reservasdyj.dominio.modelo.Escenario;

import java.util.List;

public interface RepositorioEscenario {
    List<Escenario> listar();
    Escenario consultarPorId(Long id);
    Long guardar(Escenario escenario);
    boolean existe(Escenario escenario);
}
