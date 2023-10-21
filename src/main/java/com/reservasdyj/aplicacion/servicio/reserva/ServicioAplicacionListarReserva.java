package com.reservasdyj.aplicacion.servicio.reserva;

import com.reservasdyj.dominio.modelo.Reserva;
import com.reservasdyj.dominio.puerto.RepositorioReserva;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioAplicacionListarReserva {
    private final RepositorioReserva repositorioReserva;

    public ServicioAplicacionListarReserva(RepositorioReserva repositorioReserva) {
        this.repositorioReserva = repositorioReserva;
    }

    public List<Reserva> ejecutar(){return this.repositorioReserva.listar();}

    public Reserva consultarById(Long id){return this.repositorioReserva.consultarPorId(id);}
}
