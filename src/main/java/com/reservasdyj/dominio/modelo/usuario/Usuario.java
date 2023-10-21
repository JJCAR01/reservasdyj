package com.reservasdyj.dominio.modelo.usuario;

import com.reservasdyj.dominio.modelo.Rol;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Usuario {
    private final Long idUsuario;
    private final String password;
    private final String correo;
    private final List<Rol> roles;

    public Usuario(Long idUsuario, String password, String correo, List<Rol> roles) {
        this.idUsuario = idUsuario;
        this.password = password;
        this.correo = correo;
        this.roles = roles;
    }

    public static Usuario of(Long idUsuario, String password, String correo, List<Rol> roles){

        return new Usuario(idUsuario, password, correo,roles);
    }

}
