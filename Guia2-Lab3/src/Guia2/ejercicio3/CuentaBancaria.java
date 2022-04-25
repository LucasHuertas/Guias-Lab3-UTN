package Guia2.ejercicio3;

import java.util.UUID;

public class CuentaBancaria {

    private UUID id;
    private double balance;
    private Titular cliente;

    public CuentaBancaria(){}

    public CuentaBancaria(double balance, Titular cliente) {
        this.id = UUID.randomUUID();
        this.balance = balance;
        this.cliente = cliente;
    }

    public UUID getId() {
        return id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public Titular getCliente() {
        return cliente;
    }
    public void setCliente(Titular cliente) {
        this.cliente = cliente;
    }

    public double depositar(double monto){
        return this.balance += monto;
    }

    public double extraer(double monto){
        if (this.balance >= monto){
            this.balance -= monto;
        }
        else
            System.out.println("Saldo insuficiente.");
        return this.balance;

    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "id=" + id +
                ", balance=" + balance +
                ", cliente=" + cliente +
                '}';
    }
}
