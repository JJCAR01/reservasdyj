package com.reservasdyj.infraestructura.usuario.repositorio;

import com.reservasdyj.dominio.dto.DtoResumenUsuario;
import com.reservasdyj.dominio.modelo.usuario.InformacionUsuario;
import com.reservasdyj.dominio.modelo.usuario.Usuario;
import com.reservasdyj.dominio.puerto.RepositorioUsuario;
import com.reservasdyj.infraestructura.usuario.entidad.EntidadUsuario;
import com.reservasdyj.infraestructura.usuario.repositorio.jpa.RepositorioUsuarioJpa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioUsuarioPostgreSQL implements RepositorioUsuario {

    private final RepositorioUsuarioJpa repositorioUsuarioJpa;

    public RepositorioUsuarioPostgreSQL(RepositorioUsuarioJpa repositorioUsuarioJpa) {
        this.repositorioUsuarioJpa = repositorioUsuarioJpa;
    }

    @Override
    public List<DtoResumenUsuario> listar() {
        List<EntidadUsuario> entidadUsuarios =this.repositorioUsuarioJpa.findAll();
        return entidadUsuarios.stream().map(entidad -> new DtoResumenUsuario(entidad.getNombre(), entidad.getApellido(),
                entidad.getNumeroIdentificacion(),entidad.getNumeroIdentificacion(), entidad.getCelular(),
                entidad.getCorreo(), entidad.getPassword())).toList();
    }

    @Override
    public InformacionUsuario consultarPorId(Long id) {
        return null;
    }

    @Override
    public Long guardar(Usuario usuario,InformacionUsuario informacionUsuario) {
        return null;
    }

    @Override
    public boolean existe(Usuario usuario) {
        return false;
    }

    @Override
    public Long eliminar(Long id) {
        return null;
    }

    @Override
    public Usuario consultar(String nombreUsuario, String password) {
        return null;
    }

    @Override
    public Long modificar(InformacionUsuario informacionUsuario, Long id) {
        return null;
    }
}
