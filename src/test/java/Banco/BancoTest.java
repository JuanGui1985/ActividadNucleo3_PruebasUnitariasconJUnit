package Banco;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Juan Guillermo Muñoz Jaramillo
 * Materia: Pruebas y Mantenimiento de Software
 * Profesor: David Bohorquez Caro
 * 
 * IDE Version: Apache NetBeans IDE 22
 * Java: 22.0.2; Java HotSpot(TM) 64-Bit Server VM 22.0.2+9-70
 * Runtime: Java(TM) SE Runtime Environment 22.0.2+9-70
 * 
 */
public class BancoTest {
    
    public BancoTest() {
    }

    /**
     * Test of crearCliente method, of class Banco.
     */
    @Test
    public void testCrearCliente() {
        System.out.println("crearCliente");
        String nombre = "";
        double saldoInicial = 0.0;
        Banco instance = new Banco();
        instance.crearCliente(nombre, saldoInicial);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cajaTotal method, of class Banco.
     */
    @Test
    public void testCajaTotal() {
        System.out.println("cajaTotal");
        Banco instance = new Banco();
        double expResult = 0.0;
        double result = instance.cajaTotal();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of consultarOperaciones method, of class Banco.
     */
    @Test
    public void testConsultarOperaciones() {
        System.out.println("consultarOperaciones");
        Banco instance = new Banco();
        instance.consultarOperaciones();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
