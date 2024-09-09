package Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    public void testSuma() {
        assertEquals(5.0f, calculadora.sumar(2.0f, 3.0f));
        assertEquals(-1.0f, calculadora.sumar(-2.0f, 1.0f));
    }
}