package com.reservasdyj.dominio.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Escenario {

    private final String nombre;
    private final String ubicacion;
    private final String valor;
    private final String reserva;

    public Escenario(String nombre, String ubicacion, String valor, String reserva) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.valor = valor;
        this.reserva = reserva;
    }

    public Escenario of(String nombre, String ubicacion, String valor, String reserva) {
        return new Escenario (nombre,ubicacion,valor,reserva);
    }
}
