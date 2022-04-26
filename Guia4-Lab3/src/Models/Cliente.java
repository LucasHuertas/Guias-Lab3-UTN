package Models;

import java.util.UUID;

public class Cliente {

    private static int countId = 1;
    private int id;
    private String nombre;
    private String telefono;
    private String direccion;

    public Cliente(String nombre, String telefono, String direccion) {
        setId();
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }
    public void setId() {
        this.id = countId;
        countId++;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
