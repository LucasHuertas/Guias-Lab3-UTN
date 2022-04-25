package Guia3.ejercicio3;

public class Circulo extends Figura{

    protected double radio;

    public Circulo(){
        this.radio = 1.0;
    }

    public Circulo(double radio){
        this.radio = radio;
    }

    public Circulo(String color, double radio){
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        return (2 * Math.PI) * this.radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}
