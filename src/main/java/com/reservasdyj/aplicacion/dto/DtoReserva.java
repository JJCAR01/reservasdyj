package com.reservasdyj.aplicacion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DtoReserva {
    private Long idReserva;
    private LocalDate horaInicio;
    private LocalDate horaFinal;
    private Long idUsuario;
    private Long idEscenario;
}
