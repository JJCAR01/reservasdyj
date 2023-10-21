package com.reservasdyj.aplicacion.servicio.reserva;

import com.reservasdyj.aplicacion.dto.DtoReserva;
import com.reservasdyj.aplicacion.dto.respuesta.DtoRespuesta;
import com.reservasdyj.dominio.modelo.Reserva;
import com.reservasdyj.dominio.servicio.reserva.ServicioGuardarReserva;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionGuardarReserva {
    private final ServicioGuardarReserva servicioGuardarReserva;

    public ServicioAplicacionGuardarReserva(ServicioGuardarReserva servicioGuardarReserva) {
        this.servicioGuardarReserva = servicioGuardarReserva;
    }

    public DtoRespuesta<Long> ejecutar(DtoReserva dto) {

        Reserva reserva = Reserva.of(dto.getIdReserva(),dto.getHoraInicio(),dto.getHoraFinal(),
                dto.getIdUsuario(),dto.getIdEscenario());
        return new DtoRespuesta<>(this.servicioGuardarReserva.ejecutarGuardar(reserva));
    }
}
