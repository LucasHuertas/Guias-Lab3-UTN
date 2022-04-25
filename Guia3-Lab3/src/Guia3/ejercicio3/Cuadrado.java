package Guia3.ejercicio3;

public class Cuadrado extends Rectangulo{

    public Cuadrado(){
    }

    public Cuadrado(double lado){
        super(lado,lado);
    }

    public Cuadrado(String color, double lado){
        super(color,lado,lado);
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "color='" + color + '\'' +
                ", lado=" + getAlto() +
                '}';
    }
}
