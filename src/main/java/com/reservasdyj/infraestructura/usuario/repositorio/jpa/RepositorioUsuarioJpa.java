package com.reservasdyj.infraestructura.usuario.repositorio.jpa;

import com.reservasdyj.infraestructura.usuario.entidad.EntidadUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUsuarioJpa extends JpaRepository<EntidadUsuario,Long> {

    EntidadUsuario findByCorreo(String correo);
}
