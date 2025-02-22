package Calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class SumaTest {

    private Suma suma;

    /**
     * Almacenar los valores de la summa
     *
     * @param
     */

    @BeforeEach
    void setUp() {
        suma = new Suma();
    }


    @Test
    void sumarReales() {
        assertEquals(2.5, suma.sumarReales(1.2, 1.3), 0.0001);
    }


    @Test
    void sumarEnteros() {
        assertEquals(5, suma.sumarEnteros(2, 3));
    }

    @Test
    void sumarTres() {
        assertEquals(9, suma.sumarTres(2, 3, 4), 0.0001);
    }

    @Test
    void sumarAcumulado() {
        assertEquals(2.2, suma.sumarAcumulado(2.2), 0.0001);
        assertEquals(5.5, suma.sumarAcumulado(3.3), 0.0001);
    }

    @Test
    void sumarRealesConCero() {
        assertThrows(IllegalArgumentException.class, () -> {
            suma.sumar(0, 3.3);
        });
    }

    @Test
    void sumarEnterosNegativos() {
        assertThrows(IllegalArgumentException.class, () -> {
            suma.sumar(-2, 3);
        });
    }

}

