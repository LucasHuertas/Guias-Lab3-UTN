package Guia3.ejercicio3;

public class Rectangulo extends Figura{

    private double alto;
    private double ancho;

    public Rectangulo(){
        this.alto = 1.0;
        this.ancho = 1.0;
    }

    public Rectangulo(String color){
        this.color = color;
    }

    public Rectangulo(String color, double alto){
        super(color);
        this.alto = alto;
    }

    public Rectangulo(double alto, double ancho){
        this.alto = alto;
        this.ancho = ancho;
    }

    public Rectangulo(String color, double alto, double ancho){
        super(color);
        this.alto = alto;
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }
    public void setAlto(double alto) {
        this.alto = alto;
    }
    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public double calcularPerimetro() {
        return (this.alto * 2) + (this.ancho * 2);
    }

    @Override
    public double calcularArea() {
        return this.alto * this.ancho;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "color='" + color + '\'' +
                ", alto=" + alto +
                ", ancho=" + ancho +
                '}';
    }
}
