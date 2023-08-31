package com.reservasdyj.infraestructura.usuario.entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "rol")
@Getter
@Setter
@NoArgsConstructor
public class EntidadRol {

    @Id
    @Column(name = "id_rol",nullable = false, length = 20)
    private String idRol;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private String nombre;
}
