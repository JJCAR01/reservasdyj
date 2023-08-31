package com.reservasdyj.dominio.dto;

import com.reservasdyj.dominio.modelo.Rol;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DtoResumenUsuario {

    private  String nombre;
    private  String apellido;
    private  String tipoDocumento;
    private  String numeroDocumento;
    private  String celular;
    private  String password;
    private  String correo;

}
