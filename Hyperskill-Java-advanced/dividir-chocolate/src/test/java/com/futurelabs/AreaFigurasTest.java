package com.futurelabs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaFigurasTest {

    @Test
    @DisplayName("Area de un cuadrado de 2 x 2 es 4")
    void test_area_cuadrado_2x2() {
        Double area = AreaShapes.calculateAreaSquare(2.0, 2.0);
        Double expected = 4.0;
        assertEquals(expected, area);
    }

    @Test
    @DisplayName("Area de un triangulo de 3 x 3 x 3 es 3.897114317029974")
    void test_area_triangulo_3x3x3() {
        Double area = AreaShapes.calculateAreaTriangle(3.0, 3.0, 3.0);
        Double expected = 3.897114317029974;
        assertEquals(expected, area);
    }

    @Test
    @DisplayName("Area de un circulo de radio 5 es 78.5")
    void test_area_circulo_r5() {
        Double area = AreaShapes.calculateAreaCircle(5.0);
        Double expected = 78.5;
        assertEquals(expected, area);
    }
}