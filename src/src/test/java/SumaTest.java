import Calculadora.Suma;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase {@link Calculadora.Suma}.
 * @github Jorgekoke21
 * @author Jorge Pacheco Pavon
 */
class SumaTest {

    private Suma suma;

    /**
     * @Description @BeforeAll metodo para ejecutar antes de todas las pruebas
     */
    @BeforeAll
    static void beforeAll() {
        System.out.println("Iniciando pruebas ...");
    }

    /**
     * @Description @AfterAll metodo para ejecutar despues de todas las pruebas
     */
    @AfterAll
    static void afterAll() {
        System.out.println("Finalizadas las pruebas.");
    }

    /**
     * @Description @BeforeEach metodo que se ejecuta antes de cada prueba
     */
    @BeforeEach
    void setUp() {
        suma = new Suma();
        System.out.println("Configurando ...");
    }

    /**
     * @Description @BeforeEach metodo que se ejecuta despues de la prueba
     */
    @AfterEach
    void tearDown() {
        System.out.println("Limpiando la prueba...");
    }

    @Test
    @DisplayName("Prueba sumar dos números reales")
    void sumarReales() {
        double resultado = Suma.sumarReales(1.2, 1.3);
        assertEquals(2.5, resultado, 0.0001);
    }

    @Test
    @DisplayName("Prueba sumar dos números enteros")
    void sumarEnteros() {
        int resultado = Suma.sumarEnteros(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    @DisplayName("Prueba sumar tres números reales")
    void sumarTres() {
        double resultado = Suma.sumarTres(2.0, 3.0, 4.0);
        assertEquals(9.0, resultado, 0.0001);
    }

    @Test
    @DisplayName("Prueba de sumar valor acumulado")
    void sumarAcumulado() {
        double resultado1 = suma.sumarAcumulado(2.2);
        assertEquals(2.2, resultado1, 0.0001);

        double resultado2 = suma.sumarAcumulado(3.3);
        assertEquals(5.5, resultado2, 0.0001);
    }

    @Test
    @DisplayName("Prueba de sumar números reales con cero")
    void sumarRealesConCero() {
        assertThrows(IllegalArgumentException.class, () -> {
            suma.sumar(0, 3.3);
        });
    }

    @Test
    @DisplayName("Prueba de sumar números enteros negativos")
    void sumarEnterosNegativos() {
        assertThrows(IllegalArgumentException.class, () -> {
            suma.sumar(-2, 3);
        });
    }
}