
import Models.Cliente;
import Models.Pelicula;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static Models.Audiencia.*;
import static Models.Genero.*;

public class Main {

    public static void main(String[] args) {

        Pelicula peli1 = new Pelicula("Contracara", LocalDate.of(1992,02,24), 130, "EEUU", "Buenisima", R, ACCION);
        Pelicula peli2 = new Pelicula("Rocky I", LocalDate.of(1990,11,14), 120, "EEUU", "Tremenda", NC_17, ACCION);
        Pelicula peli3 = new Pelicula("El Rey Leon", LocalDate.of(1980,07,02), 110, "EEUU", "Bella", G, AVENTURA);
        Pelicula peli4 = new Pelicula("911", LocalDate.of(2010,05,22), 110, "EEUU", "Buena", PG_13, ACCION);
        Pelicula peli5 = new Pelicula("La Monja", LocalDate.of(1993,01,30), 100, "EEUU", "Mala", NC_17, HORROR);

        Cliente clien1 = new Cliente("Lucas", "12345", "Bermejo 718");
        Cliente clien2 = new Cliente("Sharon", "12345", "Edison 1419");
        Cliente clien3 = new Cliente("Flor", "12345", "Ayolas 3368");

        List<Pelicula> listPeliculas = new ArrayList<>();
        List<Cliente> listClientes = new ArrayList<>();
        listPeliculas.add(peli1);
        listPeliculas.add(peli2);
        listPeliculas.add(peli3);
        listPeliculas.add(peli4);
        listPeliculas.add(peli5);
        listClientes.add(clien1);
        listClientes.add(clien2);
        listClientes.add(clien3);


    }
}