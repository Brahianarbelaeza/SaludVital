package org.uniquindio.cibrahian.services;

import org.springframework.stereotype.Service;
import org.uniquindio.cibrahian.dto.PacienteDTO;
import org.uniquindio.cibrahian.model.Paciente;

import java.util.ArrayList;

@Service
public class PacienteService {

    public final static ArrayList<Paciente> clientes = new ArrayList<>();

    public void crearPaciente(PacienteDTO paciente) {
        // Convertir el DTO a un modelo
        Paciente paciente1 = new Paciente();
        paciente1.setNombre(paciente.nombre());
        paciente1.setApellido(paciente.apellido());
        clientes.add(paciente1);
        System.out.println("Paciente = " + clientes);
    }
}
