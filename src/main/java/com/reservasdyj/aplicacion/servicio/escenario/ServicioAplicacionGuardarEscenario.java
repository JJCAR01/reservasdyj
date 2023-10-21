package com.reservasdyj.aplicacion.servicio.escenario;

import com.reservasdyj.dominio.modelo.Escenario;
import com.reservasdyj.dominio.puerto.RepositorioEscenario;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionGuardarEscenario {
    private static final String MENSAJE_YA_EXISTE = "Ya existe el escenario con los datos ingresados";
    private final RepositorioEscenario repositorioEscenario;

    public ServicioAplicacionGuardarEscenario(RepositorioEscenario repositorioEscenario) {
        this.repositorioEscenario = repositorioEscenario;
    }

    public Long ejecutar(Escenario escenario)
    {
        if(this.repositorioEscenario.existe(escenario)) {
            throw new IllegalStateException(MENSAJE_YA_EXISTE);
        }
        return this.repositorioEscenario.guardar(escenario);
    }
}
