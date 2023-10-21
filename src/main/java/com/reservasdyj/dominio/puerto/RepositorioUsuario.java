package com.reservasdyj.dominio.puerto;

import com.reservasdyj.dominio.dto.DtoResumenUsuario;
import com.reservasdyj.dominio.modelo.usuario.InformacionUsuario;
import com.reservasdyj.dominio.modelo.usuario.Usuario;

import java.util.List;

public interface RepositorioUsuario {

    List<DtoResumenUsuario> listar();
    InformacionUsuario consultarPorId(Long id);
    Long guardar(Usuario usuario, InformacionUsuario informacionUsuario);
    boolean existe(Usuario usuario);
    Long eliminar(Long id);
    Usuario consultar(String nombreUsuario, String password);
    Long modificar(InformacionUsuario informacionUsuario,Long id);
}
