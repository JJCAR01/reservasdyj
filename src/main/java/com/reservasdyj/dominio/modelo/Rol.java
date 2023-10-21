package com.reservasdyj.dominio.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rol {

    private final String nombre;

    public static Rol of(String nombre){
        return new Rol(nombre);
    }
    public Rol(String nombre) {
        this.nombre = nombre;
    }
}
