package Guia1;

public class Rectangulo {

    private float ancho = 1.0F;
    private float alto = 1.0F;

    public Rectangulo(){}
    public Rectangulo(float ancho, float alto){
        this.ancho = ancho;
        this.alto = alto;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    public void setAlto(float alto) {
        this.alto = alto;
    }
    public float getAncho() {
        return ancho;
    }
    public float getAlto() {
        return alto;
    }

    public float calcularPerimetro(){
        return (ancho * 2) + (alto * 2);
    }

    public float calcularArea(){
        return ancho * alto;
    }
}
