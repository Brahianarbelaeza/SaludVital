package org.uniquindio.cibrahian;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.uniquindio.cibrahian.controllers.PacienteController;
import org.uniquindio.cibrahian.dto.PacienteDTO;
import org.uniquindio.cibrahian.services.PacienteService;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class VitalAppTest {

    @Test
    public void testCrearCliente() {
        // Arrange: crear mocks
        PacienteService clienteServiceMock = Mockito.mock(PacienteService.class);
        PacienteController clienteController = new PacienteController(clienteServiceMock);

        // Crear DTO de prueba
        PacienteDTO clienteDTO = new PacienteDTO("Juan", "Pérez");

        // Act: llamar al método directamente
        String respuesta = clienteController.crearCliente(clienteDTO);

        // Assert: verificar respuesta
        assertEquals("Paciente creado con éxito", respuesta);

        // Verificar que el servicio fue llamado correctamente
        Mockito.verify(clienteServiceMock).crearPaciente(clienteDTO);
    }
}
