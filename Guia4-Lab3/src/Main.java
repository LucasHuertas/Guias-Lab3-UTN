
import Models.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Pelicula peli1 = new Pelicula("Contracara", LocalDate.of(1992,02,24), 130, "EEUU", "Buenisima", Audiencia.R, Genero.ACCION);
        Pelicula peli2 = new Pelicula("Rocky I", LocalDate.of(1990,11,14), 120, "EEUU", "Tremenda", Audiencia.NC_17, Genero.ACCION);
        Pelicula peli3 = new Pelicula("El Rey Leon", LocalDate.of(1980,07,02), 110, "EEUU", "Bella", Audiencia.G, Genero.AVENTURA);
        Pelicula peli4 = new Pelicula("911", LocalDate.of(2010,05,22), 110, "EEUU", "Buena", Audiencia.PG_13, Genero.ACCION);
        Pelicula peli5 = new Pelicula("La Monja", LocalDate.of(1993,01,30), 100, "EEUU", "Mala", Audiencia.NC_17, Genero.HORROR);

        Cliente clien1 = new Cliente("Lucas", "12345", "Bermejo 718");
        Cliente clien2 = new Cliente("Sharon", "12345", "Edison 1419");
        Cliente clien3 = new Cliente("Flor", "12345", "Ayolas 3368");
        Cliente clien4 = new Cliente("Javi", "12345", "Falucho 1678");

        List<Pelicula> listPeliculas = new ArrayList<>();
        List<Cliente> listClientes = new ArrayList<>();
        listPeliculas.add(peli1);
        listPeliculas.add(peli2);
        listPeliculas.add(peli3);
        listPeliculas.add(peli4);
        listClientes.add(clien1);
        listClientes.add(clien2);;

        VideoClub videoClub = new VideoClub(listPeliculas, listClientes);

        videoClub.alquilarPelicula(peli1, clien1);
        videoClub.alquilarPelicula(peli2, clien1);
        videoClub.alquilarPelicula(peli3, clien1);
        videoClub.alquilarPelicula(peli1, clien2);
        videoClub.alquilarPelicula(peli2, clien2);
        videoClub.alquilarPelicula(peli1, clien3);
        videoClub.alquilarPelicula(peli1, clien4);



        // Consultar Alquileres Vigentes
        //System.out.println(videoClub.getListaAlquileres());

        // Consultar devoluciones del dia de la fecha
        //videoClub.consultarDevolucionesDelDia();

        // Consultar ultimos 5 alquileres de cada cliente
        //videoClub.retornarAlquileresPorCliente();

        //Consultar peliculas por Genero
        videoClub.consultarPeliculasPorGenero("Accion");
    }
}






































