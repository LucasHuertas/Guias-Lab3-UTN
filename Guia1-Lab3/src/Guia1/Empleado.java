package Guia1;

public class Empleado {

    private String dni;
    private String nombre;
    private String apellido;
    private float salario;

    public Empleado(){}
    public Empleado(String dni, String nombre, String apellido, float salario){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float calcularSalarioAnual(){
        return salario * 12;
    }

    public float aumentarSalario(float porcentaje){
        float nuevo;
        nuevo = salario * (porcentaje / 100);
        return nuevo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario +
                '}';
    }
}
