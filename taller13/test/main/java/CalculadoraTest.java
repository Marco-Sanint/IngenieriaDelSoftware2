package main.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class CalculadoraTest {

    private static Calculadora calculadora;

    @BeforeAll
    public static void init() {
        calculadora = new Calculadora();
        System.out.println("Calcladora creada");
    }

    @BeforeEach
    public void inicioPrueba() {
        System.out.println("Inicio de prueba: ");
    }

    @Test
    public void testSumar() {
        System.out.println("_____Suma_____");
        int resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado);
        assertNotEquals(4, resultado);
        assertTrue(resultado > 0);
        assertFalse(resultado < 0);
        assertNotNull(calculadora);
    }

    @DisplayName("Resta")
    @Test
    public void testRestar() {
        System.out.println("_____Resta_____");
        int resultado = calculadora.restar(5, 3);
        assertEquals(2, resultado);
        assertNotEquals(0, resultado);
        assertTrue(resultado >= 0);
        assertFalse(resultado < -5);
    }

    @RepeatedTest(3)
    public void testMultiplicar() {
        System.out.println("_____Multiplicacion_____");
        int resultado = calculadora.multiplicar(4, 2);
        assertEquals(8, resultado);
        assertNotEquals(0, resultado);
        assertTrue(resultado > 0);
        assertFalse(resultado < 0);
    }

    @Tag("Division")
    @Test
    public void testDividir() {
        System.out.println("_____Division_____");
        double resultado = calculadora.dividir(10, 2);
        assertEquals(5.0, resultado);
        assertNotEquals(3.0, resultado);
        assertTrue(resultado > 0);
        assertFalse(resultado < 0);
    }

    @Tag("Division")
    @Test
    public void testDividirPorCero() {
        System.out.println("_____Division por 0_____");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.dividir(10, 0);
        });
        assertEquals("No se puede dividir por cero", exception.getMessage());
    }

    @AfterEach
    public void finPrueba() {
        System.out.println("Fin de prueba");
    }

    @AfterAll
    public static void fin() {
        System.out.println("Fin de prueba");
    }
}