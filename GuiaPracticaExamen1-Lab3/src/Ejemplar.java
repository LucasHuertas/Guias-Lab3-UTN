import java.util.UUID;

public abstract class Ejemplar {

    private UUID codigo;
    private String anioPublicacion;

    public Ejemplar(){}

    public Ejemplar(String anioPublicacion) {
        this.codigo = UUID.randomUUID();
        this.anioPublicacion = anioPublicacion;
    }

    public UUID getCodigo() {
        return codigo;
    }
    public String getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "Ejemplar{" +
                "codigo=" + codigo +
                ", anioPublicacion='" + anioPublicacion + '\'' +
                '}';
    }
}
