package Guia3.ejercicio2;

public class Staff extends Persona{

    private double salario;
    private String turno;

    public Staff(){}

    public Staff(String nombre, String apellido, String email, String direccion, String dni, double salario, String turno) {
        super(nombre, apellido, email, direccion, dni);
        this.salario = salario;
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dni='" + dni + '\'' +
                ", salario=" + salario +
                ", turno='" + turno + '\'' +
                '}';
    }
}
