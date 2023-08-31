package com.reservasdyj.dominio.servicio.usuario;

import com.reservasdyj.dominio.modelo.Usuario;
import com.reservasdyj.dominio.puerto.RepositorioUsuario;
import org.springframework.stereotype.Service;

@Service
public class ServicioActualizarUsuario {

    private static final String MENSAJE_NO_EXISTE = "No existe el Usuario con los datos ingresados";

    private final RepositorioUsuario repositorioUsuario;

    public ServicioActualizarUsuario(RepositorioUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    public Long ejecutarModificar(Usuario usuario, Long codigo){

        if(this.repositorioUsuario.consultarPorId(codigo)==null) throw new IllegalStateException(MENSAJE_NO_EXISTE);

        return this.repositorioUsuario.modificar(usuario,codigo);
    }
}
