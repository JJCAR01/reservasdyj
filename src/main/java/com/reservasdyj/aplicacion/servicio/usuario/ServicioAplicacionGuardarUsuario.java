package com.reservasdyj.aplicacion.servicio.usuario;

import com.reservasdyj.aplicacion.dto.DtoUsuario;
import com.reservasdyj.aplicacion.dto.respuesta.DtoRespuesta;
import com.reservasdyj.dominio.modelo.Rol;
import com.reservasdyj.dominio.modelo.Usuario;
import com.reservasdyj.dominio.servicio.usuario.ServicioGuardarUsuario;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ServicioAplicacionGuardarUsuario {

    private final ServicioGuardarUsuario servicioGuardarUsuario;

    public ServicioAplicacionGuardarUsuario(ServicioGuardarUsuario servicioGuardarUsuario) {
        this.servicioGuardarUsuario = servicioGuardarUsuario;
    }

    public DtoRespuesta<Long> ejecutar(DtoUsuario dto){

        List<Rol> roles = Arrays.asList(Rol.of("ADMIN"),Rol.of("CLIENTE"));


        Usuario usuario = Usuario.of(dto.getNombre(), dto.getApellido(), dto.getTipoDocumento(), dto.getNumeroDocumento(),
                dto.getCelular(),  dto.getCorreo(), dto.getPassword(),roles);
        return new DtoRespuesta<>(this.servicioGuardarUsuario.ejecutarGuardar(usuario));
    }
}
