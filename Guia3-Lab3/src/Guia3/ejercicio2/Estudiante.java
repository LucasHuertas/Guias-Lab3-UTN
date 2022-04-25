package Guia3.ejercicio2;

public class Estudiante extends Persona{

    private String ingreso;
    private double cuotaMensual;
    private String carrera;

    public Estudiante(){}

    public Estudiante(String nombre, String apellido, String email, String direccion, String dni, String ingreso, double cuotaMensual, String carrera) {
        super(nombre, apellido, email, direccion, dni);
        this.ingreso = ingreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    public String getIngreso() {
        return ingreso;
    }
    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }
    public double getCuotaMensual() {
        return cuotaMensual;
    }
    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "ingreso='" + ingreso + '\'' +
                ", cuotaMensual=" + cuotaMensual +
                ", carrera='" + carrera + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
