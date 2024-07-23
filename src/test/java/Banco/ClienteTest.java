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
public class ClienteTest {
    
    public ClienteTest() {
    }

    /**
     * Test of getSaldo method, of class Cliente.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        Cliente instance = new Cliente("Juan", 150.30);
        double expResult = 150.30;
        double result = instance.getSaldo();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of consignar method, of class Cliente.
     */
    @Test
    public void testConsignar() {
        System.out.println("consignar");
        double contidad = 0.0;
        Cliente instance = new Cliente("Juan", 150.30);
        instance.consignar(contidad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of retirar method, of class Cliente.
     */
    @Test
    public void testRetirar() {
        System.out.println("retirar");
        double cantidad = 0.0;
        Cliente instance = new Cliente("Juan", 150.30);
        instance.retirar(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Cliente.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Cliente instance = new Cliente("Juan", 150.30);
        String expResult = "Juan";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Cliente.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Cliente instance = new Cliente("Juan", 150.30);
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSaldo method, of class Cliente.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        double saldo = 0.0;
        Cliente instance = new Cliente("Juan", 150.30);
        instance.setSaldo(saldo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
