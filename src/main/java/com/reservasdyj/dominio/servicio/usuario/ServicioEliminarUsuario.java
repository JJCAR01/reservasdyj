package com.reservasdyj.dominio.servicio.usuario;

import com.reservasdyj.dominio.puerto.RepositorioUsuario;
import org.springframework.stereotype.Service;

@Service
public class ServicioEliminarUsuario {
    private static final String MENSAJE_YA_EXISTE = "Ya existe el Usuario con los datos ingresados";
    private final RepositorioUsuario repositorioUsuario;

    public ServicioEliminarUsuario(RepositorioUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    public Long ejecutarEliminar(Long id){

        if(this.repositorioUsuario.consultarPorId(id)== null) throw new IllegalStateException(MENSAJE_YA_EXISTE);

        return this.repositorioUsuario.eliminar(id);
    }
}
