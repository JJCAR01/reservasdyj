package com.reservasdyj.aplicacion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DtoUsuario {

    private  String nombre;
    private  String apellido;
    private  String tipoDocumento;
    private  String numeroDocumento;
    private  String celular;
    private  String password;
    private  String correo;

}
