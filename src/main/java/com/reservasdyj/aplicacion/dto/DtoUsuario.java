package com.reservasdyj.aplicacion.dto;

import com.reservasdyj.dominio.modelo.Rol;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DtoUsuario {

    private Long idUsuario;
    private String nombre;
    private String apellido;
    private String tipoDocumento;
    private String numeroDocumento;
    private String celular;
    private String password;
    private String correo;
    private List<Rol> roles;

}
