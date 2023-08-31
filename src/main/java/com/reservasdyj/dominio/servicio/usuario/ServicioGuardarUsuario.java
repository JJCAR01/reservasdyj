package com.reservasdyj.dominio.servicio.usuario;

import com.reservasdyj.dominio.modelo.Usuario;
import com.reservasdyj.dominio.puerto.RepositorioUsuario;
import org.springframework.stereotype.Service;

@Service
public class ServicioGuardarUsuario {

    private static final String MENSAJE_YA_EXISTE = "Ya existe el Usuario con los datos ingresados";

    private final RepositorioUsuario repositorioUsuario;

    public ServicioGuardarUsuario(RepositorioUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    public Long ejecutarGuardar(Usuario usuario){

        if(this.repositorioUsuario.existe(usuario)) throw new IllegalStateException(MENSAJE_YA_EXISTE);

        return this.repositorioUsuario.guardar(usuario);
    }
}
