package com.reservasdyj.dominio.modelo;

import com.reservasdyj.infraestructura.usuario.entidad.EntidadTipoIdentificacion;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Usuario {

    private final String nombre;
    private final String apellido;
    private final String tipoDocumento;
    private final String numeroDocumento;
    private final String celular;
    private final String password;
    private final String correo;
    private final List<Rol> roles;

    public static Usuario of(String nombre, String apellido, String tipoDocumento,
                             String numeroDocumento, String celular, String correo, String password,
                             List<Rol> roles){

        return new Usuario(nombre, apellido, tipoDocumento, numeroDocumento, celular, password, correo,roles);
    }

    public Usuario(String nombre, String apellido, String tipoDocumento,
                   String numeroDocumento, String celular, String password, String correo,List<Rol> roles) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.celular = celular;
        this.password = password;
        this.correo = correo;
        this.roles = roles;
    }
}
