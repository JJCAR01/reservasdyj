package com.reservasdyj.dominio.modelo;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Reserva {
//Hola
    private final Long idReserva;
    private final LocalDate horaInicio;
    private final LocalDate horaFinal;
    private final Long idUsuario;
    private final Long idEscenario;
    public Reserva(Long idReserva, LocalDate horaInicio, LocalDate horaFinal, Long idUsuario, Long idEscenario) {
        this.idReserva = idReserva;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.idUsuario = idUsuario;
        this.idEscenario = idEscenario;
    }

    public static Reserva of(Long idReserva, LocalDate horaInicio, LocalDate horaFinal, Long idUsuario, Long idEscenario){
        return new Reserva(idReserva,horaInicio,horaFinal,idUsuario,idEscenario);
    }
}
