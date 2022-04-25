package Guia2.ejercicio2;

import java.util.UUID;

public class ItemVenta {

    private UUID id;
    private String nombre;
    private String descripcion;
    private double precioUni;

    public ItemVenta(){}

    public ItemVenta(String nombre, String descripcion, double precioUni) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUni = precioUni;
    }

    public UUID getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getPrecioUni() {
        return precioUni;
    }
    public void setPrecioUni(double precioUni) {
        this.precioUni = precioUni;
    }

    @Override
    public String toString() {
        return "ItemVenta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precioUni=" + precioUni +
                '}';
    }
}
