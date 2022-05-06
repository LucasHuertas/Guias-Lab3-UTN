import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) {

        Libro l1 = new Libro("libro1", "2010");
        Libro l2 = new Libro("libro2", "2011");
        Libro l3 = new Libro("libro3", "2012");
        Diario d1 = new Diario("diario1", "2010");
        Diario d2 = new Diario("diario2", "2011");
        Diario d3 = new Diario("diario3", "2012");
        Revista r1 = new Revista("revista1", "2010");
        Revista r2 = new Revista("revista2", "2011");
        Revista r3 = new Revista("revista3", "2012");
        List<Ejemplar> listaEjemplares = new ArrayList<>();

        Biblioteca biblioteca = new Biblioteca(listaEjemplares);
        biblioteca.agregarEjemplar(l1);
        biblioteca.agregarEjemplar(l2);
        biblioteca.agregarEjemplar(l3);
        biblioteca.agregarEjemplar(d1);
        biblioteca.agregarEjemplar(d2);
        biblioteca.agregarEjemplar(d3);
        biblioteca.agregarEjemplar(r1);
        biblioteca.agregarEjemplar(r2);
        biblioteca.agregarEjemplar(r3);

        // Se muestra el listado de todos los ejemplares.
        biblioteca.consultarEjemplares();

        // Se lee un diario y se informa si se esta leyendo o no.
        String respuesta = biblioteca.leerDiario(d1.getTitular()) ? "El diario se esta leyendo " : "El diario ya esta en uso ";
        System.out.println(respuesta);
        String respuesta2 = biblioteca.leerDiario(d1.getTitular()) ? "El diario se esta leyendo " : "El diario ya esta en uso ";
        System.out.println(respuesta2);

        // Se alquilan ejemplares por codigo y si informa en caso de que ya este alquilado.
        Ejemplar ejemplarcito = biblioteca.alquilarEjemplar(l1.getCodigo());
        if (ejemplarcito != null) System.out.println(ejemplarcito);
        else System.out.println("El ejemplar se encuentra alquilado. ");

        Ejemplar ejemplar = biblioteca.alquilarEjemplar(r1.getCodigo());
        if (ejemplar != null) System.out.println(ejemplar);
        else System.out.println("El ejemplar se encuentra alquilado. ");

        Ejemplar ejemplar2 = biblioteca.alquilarEjemplar(l1.getCodigo());
        if (ejemplar2 != null) System.out.println(ejemplar2);
        else System.out.println("El ejemplar se encuentra alquilado. ");

        // Se consulta la disponibilidad de un ejemplar.
        String respuesta3 = biblioteca.consultarEstadoEjemplar(l1.getCodigo()) ? "El libro esta alquilado. " : "El libro esta disponible para alquilar.  ";
        System.out.println(respuesta3);

        // Se devuelve el ejemplar y se vuelve a consultar disponibilidad.
        biblioteca.devolverEjemplar(l1.getCodigo());
        String respuesta4 = biblioteca.consultarEstadoEjemplar(l1.getCodigo()) ? "El libro esta alquilado. " : "El libro esta disponible para alquilar.  ";
        System.out.println(respuesta4);
    }
}