package com.examen;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {

    @Test
    public void testUnitariaSuma() {
        // Prueba unitaria que valida una lógica simple de forma aislada
        int resultado = 2 + 3;
        assertTrue("El resultado de la suma unitaria debe ser 5", resultado == 5);
    }
}