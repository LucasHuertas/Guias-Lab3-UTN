package Guia3.ejercicio1;

public abstract class Circulo {

    protected double radio;
    protected String color;

    public Circulo(){
        this.radio = 1.0;
        this.color = "Rojo";
    }

    public Circulo(double radio){
        this.radio = radio;
    }

    public Circulo(double radio, String color){
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double calcularArea(){
        return Math.PI * (Math.pow(this.radio, 2));
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}
