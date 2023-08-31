package com.reservasdyj.infraestructura.reserva.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "reserva")
@Getter
@Setter
@NoArgsConstructor
public class EntidadReserva {

    @Id
    @Column(name = "id_reserva",nullable = false, length = 20)
    private String idReserva;

    @Column(name = "hora_inicio",nullable = false, length = 20)
    private String horaInicio;

    @Column(name = "hora_final",nullable = false, length = 20)
    private String horaFinal;

    @Column(nullable = false, length = 20)
    private Long idEscenario;

    @Column(nullable = false, length = 20)
    private Long idUsuario;
}