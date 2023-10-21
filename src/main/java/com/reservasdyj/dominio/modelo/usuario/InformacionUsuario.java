package com.reservasdyj.dominio.modelo.usuario;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InformacionUsuario {
    private final String nombre;
    private final String apellido;
    private final String tipoDocumento;
    private final String numeroDocumento;
    private final String celular;

    public InformacionUsuario(String nombre, String apellido, String tipoDocumento, String numeroDocumento, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.celular = celular;
    }
    public static InformacionUsuario of(String nombre, String apellido, String tipoDocumento, String numeroDocumento, String celular){

        return new InformacionUsuario(nombre, apellido, tipoDocumento, numeroDocumento, celular);
    }

}
