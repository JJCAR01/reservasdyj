package com.reservasdyj.aplicacion.servicio.usuario;

import com.reservasdyj.aplicacion.dto.respuesta.DtoRespuesta;
import com.reservasdyj.dominio.servicio.reserva.ServicioEliminarReserva;
import com.reservasdyj.dominio.servicio.usuario.ServicioEliminarUsuario;
import jakarta.persistence.Column;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionEliminarUsuario {
    private final ServicioEliminarUsuario servicioEliminarUsuario;

    public ServicioAplicacionEliminarUsuario(ServicioEliminarUsuario servicioEliminarUsuario) {
        this.servicioEliminarUsuario = servicioEliminarUsuario;
    }

    public DtoRespuesta<Long> ejecutarEliminar(Long codigo){
        return new DtoRespuesta<>(this.servicioEliminarUsuario.ejecutarEliminar(codigo));
    }
}
