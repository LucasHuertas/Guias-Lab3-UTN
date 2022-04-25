package Guia3.ejercicio1;

public class Cilindro extends Circulo{

    private double altura;

    public Cilindro(){
        this.altura = 1.0;
    }

    public Cilindro(double radio, double altura){
        this.radio = radio;
        this.altura = altura;
    }

    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularVolumen(){
        return super.calcularArea() * this.altura;
    }

    @Override
    public double calcularArea() {
        return (2 * Math.PI) * this.radio * this.altura + (2 * super.calcularArea());
    }

    @Override
    public String toString() {
        return "Cilindro : subclase de " + super.toString() + ", altura : " + this.altura;
    }
}
