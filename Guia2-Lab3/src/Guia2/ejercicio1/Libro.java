package Guia2.ejercicio1;

import java.util.Arrays;

public class Libro {

    private String titulo;
    private double precio;
    private int stock;
    private Autor[] autores;

    public Libro(){}
    public Libro(String titulo, double precio, int stock, Autor[] autores){
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public Autor getAutor(int posicion){
        return autores[posicion];
    }

    public String imprimirUnico(){
        return "El libro " + this.titulo + " de " + autores[0].getNombre() + " " + autores[0].getApellido() +
                " se vende a $" + this.precio;
    }

    public String imprimirArreglo(){
        StringBuilder autoresReales = new StringBuilder();
        for (Autor autor : autores){
            if (autor != null){
                autoresReales.append(autor.getNombre());
                autoresReales.append(" ");
                autoresReales.append(autor.getApellido());
                autoresReales.append(",");
            }
        }
        return "El libro " + this.titulo + " de los autores " + autoresReales + " se vende a $" + this.precio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autores=" +Arrays.toString(autores) +
                '}';
    }
}
