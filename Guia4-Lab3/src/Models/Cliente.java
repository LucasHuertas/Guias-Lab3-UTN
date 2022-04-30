package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cliente {

    private static int countId = 1;
    private int id;
    private String nombre;
    private String telefono;
    private String direccion;
    private List<Alquiler> alquileres;

    public Cliente(String nombre, String telefono, String direccion) {
        setId();
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.alquileres = new ArrayList<>();
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
    public List<Alquiler> getAlquileres() {
        return alquileres;
    }
    public void setAlquileres(List<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }

    public void agregarAlquiler(Alquiler alquiler){
        if (this.alquileres.size() == 10){
            this.alquileres.remove(0);
            this.alquileres.add(alquiler);
        }else
            this.alquileres.add(alquiler);
    }

    public void retornarUltimosAlquileres(){
        for (Alquiler alquiler : alquileres) {
            System.out.println(alquiler);
        }
        System.out.println("\n");
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
