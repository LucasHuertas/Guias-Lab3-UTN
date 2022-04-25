package Models;

import java.time.LocalDate;
import java.util.UUID;

public class Alquiler {
    private UUID id;
    private Pelicula pelicula;
    private Cliente cliente;
    private LocalDate fechaRetiro;
    private LocalDate fechaDevolucion;
}
