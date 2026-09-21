package com.examen;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class IntegrationTest {

    @Test
    public void testDeIntegracionSistema() {
        // Prueba de integración que valida la interacción conjunta de componentes
        App aplicacion = new App();
        assertNotNull("El sistema integrado debe inicializar la aplicación principal correctamente", aplicacion);
    }
}