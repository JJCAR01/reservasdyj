package com.reservasdyj.aplicacion.servicio.usuario;

import com.reservasdyj.dominio.dto.DtoResumenUsuario;
import com.reservasdyj.dominio.modelo.usuario.InformacionUsuario;
import com.reservasdyj.dominio.puerto.RepositorioUsuario;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioAplicacionListarUsuario {
    private final RepositorioUsuario repositorioUsuario;

    public ServicioAplicacionListarUsuario(RepositorioUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    public List<DtoResumenUsuario> ejecutar(){return this.repositorioUsuario.listar();}

    public InformacionUsuario consultarById(Long id){return this.repositorioUsuario.consultarPorId(id);}
}
