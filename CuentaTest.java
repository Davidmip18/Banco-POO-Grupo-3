import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;


public class CuentaTest{
    @Test

    public void testAgregar(){
        Cliente cliente = new Cliente("Emilio", "Zona 13", "123456");
        Cuenta cuenta = new Cuenta("1", 1000.0, cliente);

        cuenta.agregar(500.0);
        assertEquals(1500.0, cuenta.getSaldo(), 0.001); //el 3er parámetro es el delta para comparación de números flotantes
    }

    @Test
    public void testDisminuir(){
        Cliente cliente = new Cliente("Isabel", "Zona 2", "234567");
        Cuenta cuenta = new Cuenta("2", 1000.0, cliente);

        cuenta.disminuir(300.0);
        assertEquals(700.0, cuenta.getSaldo(), 0.001);
    }

    @Test
    public void testVerificarValido(){
        Cliente cliente = new Cliente("Carlos", "Zona 1", "456789");
        Cuenta cuenta = new Cuenta("3", 500.0, cliente);

        assertTrue(cuenta.verificar());
    }

    @Test
    public void testVerificarInvalido(){
        Cliente cliente = new Cliente("Ana", "zona 15", "258369");
        Cuenta cuenta = new Cuenta("4", -100.0, cliente);

        assertFalse(cuenta.verificar());
    }
}