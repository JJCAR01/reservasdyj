package com.reservasdyj.dominio.servicio.reserva;

import com.reservasdyj.dominio.modelo.Reserva;
import com.reservasdyj.dominio.modelo.usuario.Usuario;
import com.reservasdyj.dominio.puerto.RepositorioReserva;
import com.reservasdyj.dominio.puerto.RepositorioUsuario;
import org.springframework.stereotype.Service;

@Service
public class ServicioActualizarReserva {
    private static final String MENSAJE_NO_EXISTE = "No existe la Reserva con los datos ingresados";

    private final RepositorioReserva repositorioReserva;

    public ServicioActualizarReserva(RepositorioReserva repositorioReserva) {
        this.repositorioReserva = repositorioReserva;
    }

    public Long ejecutarModificar(Reserva reserva, Long codigo){

        if(this.repositorioReserva.consultarPorId(codigo)==null) throw new IllegalStateException(MENSAJE_NO_EXISTE);

        return this.repositorioReserva.modificar(reserva,codigo);
    }
}
