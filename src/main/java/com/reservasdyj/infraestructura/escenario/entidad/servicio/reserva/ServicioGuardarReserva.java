package com.reservasdyj.infraestructura.escenario.entidad.servicio.reserva;

import com.reservasdyj.dominio.modelo.Reserva;
import com.reservasdyj.dominio.modelo.usuario.InformacionUsuario;
import com.reservasdyj.dominio.modelo.usuario.Usuario;
import com.reservasdyj.dominio.puerto.RepositorioReserva;
import org.springframework.stereotype.Service;

@Service
public class ServicioGuardarReserva {
    private static final String MENSAJE_YA_EXISTE = "Ya existe la Reserva con los datos ingresados";

    private final RepositorioReserva repositorioReserva;

    public ServicioGuardarReserva(RepositorioReserva repositorioReserva) {
        this.repositorioReserva = repositorioReserva;
    }


    public Long ejecutarGuardar(Reserva reserva){

        if(this.repositorioReserva.existe(reserva)) throw new IllegalStateException(MENSAJE_YA_EXISTE);

        return this.repositorioReserva.guardar(reserva);
    }
}
