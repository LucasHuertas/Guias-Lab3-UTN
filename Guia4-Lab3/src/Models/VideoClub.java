package Models;

import java.util.ArrayList;
import java.util.List;

public class VideoClub {

    private List<Pelicula> listaPeliculas;
    private List<Cliente> listaClientes;
    private List<Alquiler> listaAlquileres;

    public VideoClub(){}

    public VideoClub(List<Pelicula> peliculas, List<Cliente> clientes){
        this.listaPeliculas = peliculas;
        this.listaClientes = clientes;
        this.listaAlquileres = new ArrayList<>();
    }

    public List<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }
    public void setListaPeliculas(List<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }
    public List<Cliente> getListaClientes() {
        return listaClientes;
    }
    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    public List<Alquiler> getListaAlquileres() {
        return listaAlquileres;
    }
    public void setListaAlquileres(List<Alquiler> listaAlquileres) {
        this.listaAlquileres = listaAlquileres;
    }


    public void alquilarPelicula (Pelicula pelicula, Cliente cliente){
        if (existePelicula(pelicula)){
            if (pelicula.tieneStock()){
                pelicula.setStock(pelicula.getStock() - 1);
                Alquiler alquiler = new Alquiler(pelicula, cliente);
                this.listaAlquileres.add(alquiler);
            }
        }
    }

    public boolean existePelicula(Pelicula pelicula){
        boolean encontrada = false;
        if (listaPeliculas != null) {
            for (Pelicula peli : listaPeliculas) {
                if (peli.getTitulo() == pelicula.getTitulo())
                    encontrada = true;
            }
        }
        return encontrada;
    }

    public boolean tieneStock (String titulo){
        return true;
    }

    @Override
    public String toString() {
        return "VideoClub{" +
                "listaPeliculas=" + listaPeliculas +
                ", listaClientes=" + listaClientes +
                ", listaAlquileres=" + listaAlquileres +
                '}';
    }
}
