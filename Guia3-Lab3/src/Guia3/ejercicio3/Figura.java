package Guia3.ejercicio3;

public abstract class Figura {

    protected String color;

    public Figura(){
        this.color = "Ninguno";
    }

    public Figura(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calcularPerimetro();
    public abstract double calcularArea();

    @Override
    public String toString() {
        return "Figura{" +
                "color='" + color + '\'' +
                '}';
    }
}
