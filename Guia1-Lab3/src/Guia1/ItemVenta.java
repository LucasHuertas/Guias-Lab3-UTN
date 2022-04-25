package Guia1;

import java.util.UUID;

public class ItemVenta {

    private UUID id;
    private String descripcion;
    private int cantidad;
    private float precioUnitario;
    private float precioTotal;

    public ItemVenta(){}
    public ItemVenta(String descripcion, int cantidad, float precioUnitario){
        this.id = UUID.randomUUID();
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.precioTotal = calcularPrecioTotal();
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public float getPrecioUnitario() {
        return precioUnitario;
    }
    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public float calcularPrecioTotal(){
        return precioUnitario * cantidad;
    }

    @Override
    public String toString() {
        return "ItemVenta{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                ", precioTotal=" + precioTotal +
                '}';
    }
}
