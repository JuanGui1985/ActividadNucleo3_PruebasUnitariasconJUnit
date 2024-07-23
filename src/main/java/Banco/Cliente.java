 package Banco;

/**
 *
 * @author user
 */
public class Cliente {
    
    private String nombre;
    private double saldo;

    public Cliente(String nombre, double saldoInicial) {
        this.nombre = nombre;
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void consignar(double contidad) {
        saldo += contidad;
        System.out.println("Se ha consignado $" + contidad + " a la cuenta de " + nombre);
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se ha retirado $" + cantidad + "de la cuenta de " + nombre);
        }else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
