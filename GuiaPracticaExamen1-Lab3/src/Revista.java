public class Revista extends Ejemplar implements IEstado {

    private String titular;
    private boolean alquilada;

    public Revista() {
    }

    public Revista(String titular, String anioPublicacion) {
        super(anioPublicacion);
        this.titular = titular;
        this.alquilada = false;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public Ejemplar alquilar() {
        this.alquilada = true;
        return this;
    }

    @Override
    public void devolver() {
        this.alquilada = false;
    }

    @Override
    public boolean alquilado() {
        return this.alquilada;
    }

    @Override
    public String toString() {
        return super.toString() + "Revista{" + "titular='" + titular + '\'' + '}';
    }
}
