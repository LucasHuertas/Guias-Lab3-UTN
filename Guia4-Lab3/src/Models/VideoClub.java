package Models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
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
                if(listaClientes.contains(cliente)){
                    alquilerDePelicula(pelicula, cliente);
                }
                else{
                    this.listaClientes.add(cliente);
                    System.out.println("Cliente agregado con exito. Ahora se realizara el alquiler. ");
                    alquilerDePelicula(pelicula, cliente);
                }
            }
            else
                System.out.println("No hay stock disponible. ");
        }
        else
            System.out.println("La pelicula no existe. ");
    }

    public void alquilerDePelicula(Pelicula pelicula, Cliente cliente){
        pelicula.setStock(pelicula.getStock() - 1);
        Alquiler alquiler = new Alquiler(pelicula, cliente);
        this.listaAlquileres.add(alquiler);
        cliente.agregarAlquiler(alquiler);
        System.out.println("Pelicula alquilada con exito. ");

    }

    public void devolucionPelicula(Pelicula pelicula, Cliente cliente){
        Iterator<Alquiler> iterator = listaAlquileres.iterator();
        while (iterator.hasNext()) {
            Alquiler aux = iterator.next();
            System.out.println("Hola");
            if (aux.getPelicula() == pelicula && aux.getCliente() == cliente){
                iterator.remove();
                pelicula.setStock(pelicula.getStock() + 1);
            }
        }
    }

    public Pelicula buscarPelicula(String titulo){
        Pelicula pelicula = null;
        for (Pelicula peli : listaPeliculas) {
            if (peli != null && peli.getTitulo().equals(titulo)){
                pelicula = peli;
            }
        }
        return pelicula;
    }

    public Cliente buscarCliente(String nombre){
        Cliente cliente = null;
        for (Cliente client : listaClientes) {
            if (client != null && client.getNombre().equals(nombre)){
                cliente = client;
            }
        }
        return cliente;
    }

    public boolean existePelicula(Pelicula pelicula){
        boolean encontrada = false;
        if (listaPeliculas != null) {
            for (Pelicula peli : listaPeliculas) {
                if (peli.getTitulo().equals(pelicula.getTitulo()))
                    encontrada = true;
            }
        }
        return encontrada;
    }

    public void retornarAlquileresPorCliente(){
        for (Cliente cliente : listaClientes) {
            cliente.retornarUltimosAlquileres();
        }
    }

    public void consultarDevolucionesDelDia(){
        LocalDate hoy = LocalDate.now();
        boolean aux = false;
        for (Alquiler alquiler : listaAlquileres) {
            if (alquiler.getFechaDevolucion().equals(hoy)){
                System.out.println(alquiler);
                aux = true;
            }
        }
        if(!aux)
            System.out.println("No se encuentran devoluciones para el dia de la fecha. ");
    }

    public void consultarPeliculasPorGenero(String genero){
        for (Pelicula pelicula : listaPeliculas){
            if (pelicula.getGenero() == genero){
                System.out.println(pelicula);
            }
        }
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
