package com.reservasdyj.infraestructura.escenario.entidad.servicio.usuario;

import com.reservasdyj.dominio.modelo.usuario.InformacionUsuario;
import com.reservasdyj.dominio.modelo.usuario.Usuario;
import com.reservasdyj.dominio.puerto.RepositorioUsuario;
import org.springframework.stereotype.Service;

@Service
public class ServicioActualizarUsuario {

    private static final String MENSAJE_NO_EXISTE = "No existe el Usuario con los datos ingresados";

    private final RepositorioUsuario repositorioUsuario;

    public ServicioActualizarUsuario(RepositorioUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    public Long ejecutarModificar(InformacionUsuario informacionUsuario, Long codigo){

        if(this.repositorioUsuario.consultarPorId(codigo)==null) throw new IllegalStateException(MENSAJE_NO_EXISTE);

        return this.repositorioUsuario.modificar(informacionUsuario,codigo);
    }
}
