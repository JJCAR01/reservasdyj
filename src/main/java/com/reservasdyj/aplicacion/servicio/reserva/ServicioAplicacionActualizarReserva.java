package com.reservasdyj.aplicacion.servicio.reserva;

import com.reservasdyj.aplicacion.dto.DtoReserva;
import com.reservasdyj.aplicacion.dto.respuesta.DtoRespuesta;
import com.reservasdyj.dominio.modelo.Reserva;
import com.reservasdyj.dominio.servicio.reserva.ServicioActualizarReserva;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionActualizarReserva {
    private final ServicioActualizarReserva servicioActualizarReserva;

    public ServicioAplicacionActualizarReserva(ServicioActualizarReserva servicioActualizarReserva) {
        this.servicioActualizarReserva = servicioActualizarReserva;
    }

    public DtoRespuesta<Long> ejecutarModificar(DtoReserva dto, Long codigo){
        var reserva = Reserva.of(dto.getIdReserva(), dto.getHoraInicio(), dto.getHoraFinal(),
                dto.getIdUsuario(),dto.getIdEscenario());

        return new DtoRespuesta<>(this.servicioActualizarReserva.ejecutarModificar(reserva,codigo));
    }
}
