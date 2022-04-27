package Models;

import java.time.LocalDate;
import java.util.UUID;

public class Alquiler {

    private UUID id;
    private Pelicula pelicula;
    private Cliente cliente;
    private LocalDate fechaRetiro;
    private LocalDate fechaDevolucion;

    public Alquiler(){}

    public Alquiler(Pelicula pelicula, Cliente cliente){
        this.id = UUID.randomUUID();
        this.pelicula = pelicula;
        this.cliente = cliente;
        this.fechaRetiro = LocalDate.now();
        this.fechaDevolucion = fechaRetiro.plusDays(3);
    }

    public UUID getId() {
        return id;
    }
    public Pelicula getPelicula() {
        return pelicula;
    }
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public LocalDate getFechaRetiro() {
        return fechaRetiro;
    }
    public void setFechaRetiro(LocalDate fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }
    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "id=" + id +
                ", pelicula=" + pelicula +
                ", cliente=" + cliente +
                ", fechaRetiro=" + fechaRetiro +
                ", fechaDevolucion=" + fechaDevolucion +
                '}';
    }
}
