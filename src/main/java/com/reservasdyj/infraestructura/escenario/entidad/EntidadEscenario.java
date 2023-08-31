package com.reservasdyj.infraestructura.escenario.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "escenario")
@Getter
@Setter
@NoArgsConstructor
public class EntidadEscenario {

    @Id
    @Column(name = "id_escenario",nullable = false, length = 20)
    private String idEscenario;

    @Column(nullable = false, length = 20)
    private String nombre;

    @Column(nullable = false, length = 20)
    private String direccion;

    @Column(nullable = false, length = 20)
    private String valorReserva;
}
