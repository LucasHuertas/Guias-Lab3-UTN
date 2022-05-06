import java.util.List;
import java.util.UUID;

public class Biblioteca {

    private List<Ejemplar> ejemplares;

    public Biblioteca(){}

    public Biblioteca(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }
    public void setEjemplares(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void agregarEjemplar(Ejemplar ejemplar){
        this.ejemplares.add(ejemplar);
    }

    public void consultarEjemplares(){
        for (Ejemplar ejemplar : ejemplares) {
            System.out.println(ejemplar);
        }
    }

    public boolean leerDiario(String nombre){
        boolean respuesta = false;
            for (Ejemplar ejemplar : ejemplares) {
                if (ejemplar instanceof Diario) {
                    if (((Diario) ejemplar).getTitular().equals(nombre))
                        respuesta = ((Diario) ejemplar).leerDiario();
                }
            }
        return respuesta;
    }



    public Ejemplar alquilarEjemplar(UUID id){
        Ejemplar ejem = null;
        for (Ejemplar ejemplar : ejemplares) {
            if (ejemplar instanceof Libro){
                Libro aux = (Libro) ejemplar;
                if (aux.getCodigo() == id && !aux.alquilado())
                    ejem = aux.alquilar();
            }
            if (ejemplar instanceof Revista){
                Revista aux = (Revista) ejemplar;
                if (aux.getCodigo() == id && !aux.alquilado())
                    ejem = aux.alquilar();
            }
        }
        return ejem;
    }

    public void devolverEjemplar(UUID id){
        for (Ejemplar ejemplar : ejemplares) {
            if (ejemplar instanceof Libro){
                Libro aux = (Libro) ejemplar;
                if (aux.getCodigo() == id)
                    aux.devolver();
            }
            if (ejemplar instanceof Revista){
                Revista aux = (Revista) ejemplar;
                if (aux.getCodigo() == id)
                    aux.devolver();
            }
        }
    }

    public boolean consultarEstadoEjemplar(UUID id){
        boolean respuesta = false;
        for (Ejemplar ejemplar : ejemplares) {
            if (ejemplar instanceof Libro){
                Libro aux = (Libro) ejemplar;
                if (aux.getCodigo() == id)
                    respuesta = aux.alquilado();
            }
            if (ejemplar instanceof Revista){
                Revista aux = (Revista) ejemplar;
                if (aux.getCodigo() == id)
                    respuesta = aux.alquilado();
            }
        }
        return respuesta;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "ejemplares=" + ejemplares +
                '}';
    }
}
