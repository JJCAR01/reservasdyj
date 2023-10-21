package com.reservasdyj.aplicacion.servicio.usuario;

import com.reservasdyj.aplicacion.dto.DtoUsuario;
import com.reservasdyj.aplicacion.dto.respuesta.DtoRespuesta;
import com.reservasdyj.dominio.modelo.usuario.InformacionUsuario;
import com.reservasdyj.dominio.servicio.usuario.ServicioActualizarUsuario;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionActualizarUsuario {
    private final ServicioActualizarUsuario servicioActualizarUsuario;

    public ServicioAplicacionActualizarUsuario(ServicioActualizarUsuario servicioActualizarUsuario) {
        this.servicioActualizarUsuario = servicioActualizarUsuario;
    }

    public DtoRespuesta<Long> ejecutarModificar(DtoUsuario dto, Long codigo){
        var informacionUsuario = InformacionUsuario.of(dto.getNombre(), dto.getApellido(), dto.getTipoDocumento(),
                dto.getNumeroDocumento(), dto.getCelular());

        return new DtoRespuesta<>(this.servicioActualizarUsuario.ejecutarModificar(informacionUsuario,codigo));
    }
}
