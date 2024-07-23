package Banco;

import java.util.ArrayList;

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
public class Banco {
    
    private ArrayList<Cliente> clientes;

    public Banco() {
        clientes = new ArrayList<>();
    }

    public void crearCliente(String nombre, double saldoInicial) {
        Cliente nuevoCliente = new Cliente(nombre, saldoInicial);
        clientes.add(nuevoCliente);
        System.out.println("Se ha creado el cliente " + nombre + " con un saldo inicial de $" + saldoInicial);
    }

    public double cajaTotal() {
        double cajaTotal = 0;
        for (Cliente cliente : clientes) {
            cajaTotal += cliente.getSaldo();
        }
        return cajaTotal;
    }

    public void consultarOperaciones() {
        for (Cliente cliente : clientes) {
            System.out.println("Cliente: " + cliente.getNombre());
        }
    }
}
