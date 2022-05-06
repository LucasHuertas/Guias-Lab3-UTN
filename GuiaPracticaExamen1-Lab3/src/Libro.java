import java.util.Timer;

public class Libro extends Ejemplar implements IEstado{

    private String titulo;
    private boolean alquilado;

    public Libro(){}

    public Libro(String titulo, String anioPublicacion) {
        super(anioPublicacion);
        this.titulo = titulo;
        this.alquilado = false;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public Ejemplar alquilar() {
        this.alquilado = true;
        return this;
    }

    @Override
    public void devolver() {
        this.alquilado = false;
    }

    @Override
    public boolean alquilado() {
        return this.alquilado;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Libro{" +
                "titulo='" + titulo + '\'' +
                '}';
    }
}
