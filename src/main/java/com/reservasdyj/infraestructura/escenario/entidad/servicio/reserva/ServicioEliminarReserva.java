package com.reservasdyj.infraestructura.escenario.entidad.servicio.reserva;

import com.reservasdyj.dominio.puerto.RepositorioReserva;
import org.springframework.stereotype.Service;

@Service
public class ServicioEliminarReserva {
    private static final String MENSAJE_YA_EXISTE = "Ya existe la Reserva con los datos ingresados";
    private final RepositorioReserva repositorioReserva;

    public ServicioEliminarReserva(RepositorioReserva repositorioReserva) {
        this.repositorioReserva = repositorioReserva;
    }

    public Long ejecutarEliminar(Long id){

        if(this.repositorioReserva.consultarPorId(id)== null) throw new IllegalStateException(MENSAJE_YA_EXISTE);

        return this.repositorioReserva.eliminar(id);
    }
}
