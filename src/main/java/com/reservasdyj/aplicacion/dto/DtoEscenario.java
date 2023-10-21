package com.reservasdyj.aplicacion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DtoEscenario {
    private String nombre;
    private String ubicacion;
    private String valor;
    private String reserva;
}
