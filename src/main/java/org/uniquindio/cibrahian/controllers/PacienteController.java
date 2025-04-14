package org.uniquindio.cibrahian.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.uniquindio.cibrahian.dto.PacienteDTO;
import org.uniquindio.cibrahian.services.PacienteService;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class PacienteController {

    // Inyectar el servicio de cliente
    private final PacienteService clienteService;


    @PostMapping("/pacientes")
    public String crearCliente(@RequestBody PacienteDTO clienteDTO) {
        System.out.println("pacienteDTO = " + clienteDTO.nombre());
        clienteService.crearCliente(clienteDTO);
        return "Paciente creado con éxito";
    }
}
