
public class Diario extends Ejemplar {

    private String titular;
    private boolean enUso;

    public Diario(){}

    public Diario(String titular, String anioPublicacion) {
        super(anioPublicacion);
        this.titular = titular;
        this.enUso = false;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void cambiarEstado(){
        this.enUso = true;
    }

    public boolean leerDiario(){
        if (!this.enUso ){
            cambiarEstado();
            return true;
        }
        return false;
    }



    @Override
    public String toString() {
        return super.toString() +
                "Diario{" +
                "titular='" + titular + '\'' +
                '}';
    }
}
