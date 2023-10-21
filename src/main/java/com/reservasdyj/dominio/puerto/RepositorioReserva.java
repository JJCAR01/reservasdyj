package com.reservasdyj.dominio.puerto;

import com.reservasdyj.dominio.modelo.Reserva;

import java.util.List;

public interface RepositorioReserva {
    List<Reserva> listar();
    Reserva consultarPorId(Long id);
    Long guardar(Reserva reserva);
    boolean existe(Reserva reserva);
    Long eliminar(Long id);
    Long modificar(Reserva reserva,Long id);
}
