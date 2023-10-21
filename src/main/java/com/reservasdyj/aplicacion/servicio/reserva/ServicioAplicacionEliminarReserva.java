package com.reservasdyj.aplicacion.servicio.reserva;

import com.reservasdyj.aplicacion.dto.respuesta.DtoRespuesta;
import com.reservasdyj.dominio.servicio.reserva.ServicioEliminarReserva;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionEliminarReserva {
    private final ServicioEliminarReserva servicioEliminarReserva;

    public ServicioAplicacionEliminarReserva(ServicioEliminarReserva servicioEliminarReserva) {
        this.servicioEliminarReserva = servicioEliminarReserva;
    }
    public DtoRespuesta<Long> ejecutarEliminar(Long codigo){
        return new DtoRespuesta<>(this.servicioEliminarReserva.ejecutarEliminar(codigo));
    }
}
