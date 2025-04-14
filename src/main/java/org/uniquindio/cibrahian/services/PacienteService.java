package org.uniquindio.cibrahian.services;

import org.springframework.stereotype.Service;
import org.uniquindio.cibrahian.dto.PacienteDTO;
import org.uniquindio.cibrahian.model.Paciente;

import java.util.ArrayList;

@Service
public class PacienteService {

    public final static ArrayList<Paciente> clientes = new ArrayList<>();

    public void crearCliente(PacienteDTO cliente) {
        // Convertir el DTO a un modelo
        Paciente clienteModel = new Paciente();
        clienteModel.setNombre(cliente.nombre());
        clienteModel.setApellido(cliente.apellido());
        clientes.add(clienteModel);
        System.out.println("clientes = " + clientes);
    }
}
