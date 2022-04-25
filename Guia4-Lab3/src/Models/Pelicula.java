package Models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Pelicula {

    private static int countId = 1;
    private int id;
    private String titulo;
    private LocalDate fechaLanzamiento;
    private int duracion;
    private String pais;
    private String descripcion;
    private Audiencia clasAudiencia;
    private Genero genero;
    private int stock;
    private Boolean alquilada;

    public Pelicula(){}

    public Pelicula(String titulo, LocalDate fechaLanzamiento, int duracion, String pais,
                    String descripcion, Audiencia clasAudiencia, Genero genero) {
        setId();
        this.titulo = titulo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.duracion = duracion;
        this.pais = pais;
        this.descripcion = descripcion;
        this.clasAudiencia = clasAudiencia;
        this.genero = genero;
        this.stock = 3;
        this.alquilada = false;
    }

    public int getId() {
        return id;
    }
    public void setId() {
        this.id = countId;
        countId++;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }
    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Audiencia getClasAudiencia() {
        return clasAudiencia;
    }
    public void setClasAudiencia(Audiencia clasAudiencia) {
        this.clasAudiencia = clasAudiencia;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public Boolean getAlquilada() {
        return alquilada;
    }
    public void setAlquilada(Boolean alquilada) {
        this.alquilada = alquilada;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", duracion=" + duracion +
                ", pais='" + pais + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", clasAudiencia=" + clasAudiencia +
                ", genero=" + genero +
                '}';
    }
}
