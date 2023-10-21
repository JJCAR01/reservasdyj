package com.reservasdyj.infraestructura.usuario.entidad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuario")
public class EntidadUsuario {


    //nombre, apellidos, tipo id, identificación, celular, correo y contraseña

    @Id
    @Column(unique = true, length = 50)
    private String correo;

    @Column(unique = true, length = 50)
    private String nombre;

    @Column(unique = true, length = 50)
    private String apellido;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_identificacion")
    private EntidadTipoIdentificacion tipoIdentificacion;

    @Column(name = "numero_identificacion")
    private String numeroIdentificacion;

    @Column(unique = true, length = 50)
    private String celular;

    @Column(length = 100)
    private String password;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario")
    private List<EntidadRol> roles;

}

