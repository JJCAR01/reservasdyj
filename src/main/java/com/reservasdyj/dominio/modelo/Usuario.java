package com.reservasdyj.dominio.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {

    private final String nombre;
    private final String apellido;
    private final String tipoDocumento;
    private final String numeroDocumento;
    private final String password;
    private final String correo;

    public Usuario of(String nombre, String apellido, String tipoDocumento,
                      String numeroDocumento, String password, String correo){

        return new Usuario(nombre, apellido, tipoDocumento, numeroDocumento, password, correo);
    }

    public Usuario(String nombre, String apellido, String tipoDocumento,
                   String numeroDocumento, String password, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.password = password;
        this.correo = correo;
    }
}
