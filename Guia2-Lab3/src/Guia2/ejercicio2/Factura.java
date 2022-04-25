package Guia2.ejercicio2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

public class Factura {

    private UUID id;
    private double montoTotal;
    private LocalDate fecha;
    private Cliente cliente;
    private ItemVenta[] items;

    public Factura(){}

    public Factura(Cliente cliente, ItemVenta[] items) {
        this.cliente = cliente;
        this.items = items;
        this.id = UUID.randomUUID();
        this.fecha = LocalDate.now();
        this.montoTotal = calcularMontoTotal();

    }

    public UUID getId() {
        return id;
    }

    public double getMontoTotal() {
        return montoTotal;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    private double calcularMontoTotal(){
        double totalSinDescuento = 0;
        for (ItemVenta item : items){
            if (item != null){
                totalSinDescuento += item.getPrecioUni();
            }
        }
        return totalSinDescuento;
    }

    public double calcularMontoTotalConDescuento(){
        double totalSinDescuento = calcularMontoTotal();
        double totalConDescuento = totalSinDescuento - (totalSinDescuento * cliente.getPorcentDesc()) / 100;
        return totalConDescuento;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", montoTotal=" + montoTotal +
                ", fecha=" + fecha +
                ", cliente=" + cliente +
                ", items=" + Arrays.toString(items) +
                '}';
    }
}
