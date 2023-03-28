package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteBuilderTest {
    @Test
    void deveRetornarExcecaoParaClienteSemMatricula() {
        try {
            ClienteBuilder clienteBuilder = new ClienteBuilder();
            Cliente cliente = clienteBuilder
                    .setNome("Cliente 1")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("id inválida", e.getMessage());
        }
    }


    @Test
    void deveRetornarClienteValido() {
        ClienteBuilder clienteBuilder = new ClienteBuilder();
        Cliente cliente = clienteBuilder
                .setId(1)
                .setNome("Cliente 1")
                .build();

        assertNotNull(cliente);
    }
}
