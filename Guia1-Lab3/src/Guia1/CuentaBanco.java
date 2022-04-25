package Guia1;

import java.util.UUID;

public class CuentaBanco {

    private UUID id;
    private String nombre;
    private double balance;

    public CuentaBanco(){}
    public CuentaBanco(String nombre, double balance){
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.balance = balance;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double credito(double dinero){
        System.out.println("Usted ingreso " + dinero);
        balance += dinero;
        return balance;
    }

    public double debito(double dinero){
        if (dinero <= balance) {
            balance = balance - dinero;
            System.out.println("Usted retiro " + dinero);
        }
        else
            System.out.println("Saldo insuficiente. No se pudo retirar " + dinero);
        return balance;
    }

    @Override
    public String toString() {
        return "CuentaBanco{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", balance=" + balance +
                '}';
    }

}
