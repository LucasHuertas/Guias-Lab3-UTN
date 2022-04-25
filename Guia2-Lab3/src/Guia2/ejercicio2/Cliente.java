package Guia2.ejercicio2;

import java.util.UUID;

public class Cliente {

    private UUID id;
    private String nombre;
    private String email;
    private int porcentDesc;

    public Cliente(){}

    public Cliente(String nombre, String email, int porcentDesc) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.email = email;
        this.porcentDesc = porcentDesc;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getPorcentDesc() {
        return porcentDesc;
    }
    public void setPorcentDesc(int porcentDesc) {
        this.porcentDesc = porcentDesc;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", porcentDesc=" + porcentDesc +
                '}';
    }
}
