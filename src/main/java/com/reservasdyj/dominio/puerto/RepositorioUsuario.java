package com.reservasdyj.dominio.puerto;

import com.reservasdyj.dominio.dto.DtoResumenUsuario;
import com.reservasdyj.dominio.modelo.Usuario;

import java.util.List;

public interface RepositorioUsuario {

    List<DtoResumenUsuario> listar();
    Usuario consultarPorId(Long id);
    Long guardar(Usuario usuario);
    boolean existe(Usuario usuario);
    Long eliminar(Long id);
    Usuario consultar(String nombreUsuario, String password);
    Long modificar(Usuario usuario,Long id);
}
