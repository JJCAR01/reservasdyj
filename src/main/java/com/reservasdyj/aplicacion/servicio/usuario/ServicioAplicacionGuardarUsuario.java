package com.reservasdyj.aplicacion.servicio.usuario;

import com.reservasdyj.aplicacion.dto.DtoUsuario;
import com.reservasdyj.aplicacion.dto.respuesta.DtoRespuesta;
import com.reservasdyj.dominio.modelo.usuario.InformacionUsuario;
import com.reservasdyj.dominio.modelo.usuario.Usuario;
import com.reservasdyj.dominio.servicio.usuario.ServicioGuardarUsuario;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionGuardarUsuario {

    private final ServicioGuardarUsuario servicioGuardarUsuario;

    public ServicioAplicacionGuardarUsuario(ServicioGuardarUsuario servicioGuardarUsuario) {
        this.servicioGuardarUsuario = servicioGuardarUsuario;
    }

    public DtoRespuesta<Long> ejecutar(DtoUsuario dto) {

        Usuario usuario = Usuario.of(dto.getIdUsuario(), dto.getCorreo(), dto.getCorreo(), dto.getRoles());
        InformacionUsuario informacionUsuario = InformacionUsuario.of(dto.getNombre(), dto.getApellido(), dto.getTipoDocumento(),
                dto.getNumeroDocumento(), dto.getCelular());
        return new DtoRespuesta<>(this.servicioGuardarUsuario.ejecutarGuardar(usuario,informacionUsuario));
    }
}
