package Guia3;

import Guia3.ejercicio1.Cilindro;
import Guia3.ejercicio2.Estudiante;
import Guia3.ejercicio2.Persona;
import Guia3.ejercicio2.Staff;
import Guia3.ejercicio3.Circulo;
import Guia3.ejercicio3.Cuadrado;
import Guia3.ejercicio3.Rectangulo;

public class Main {

    public static void main(String[] args) {

        //ejercicio1();
        //ejercicio2();
        ejercicio3();
    }

    public static void ejercicio1(){

        Cilindro cilindro1 = new Cilindro();
        System.out.println("Cilindro 1: ");
        System.out.println("Radio: " + cilindro1.getRadio());
        System.out.println("Altura: " + cilindro1.getAltura());
        System.out.println("Area de base: " + cilindro1.calcularArea());
        System.out.println("Volumen: " + cilindro1.calcularVolumen());
        System.out.println("\n");

        Cilindro cilindro2 = new Cilindro(4, 10);
        System.out.println("Cilindro 2:");
        System.out.println("Radio: " + cilindro2.getRadio());
        System.out.println("Altura: " + cilindro2.getAltura());
        System.out.println("Area de base: " + cilindro2.calcularArea());
        System.out.println("Volumen: " + cilindro2.calcularVolumen());
        System.out.println(cilindro2);
    }

    public static void ejercicio2(){

        Estudiante estudiante1 = new Estudiante("name", "surname", "estudiante1@email.com", "123", "12345678", "1993", 5000, "Programacion");
        Estudiante estudiante2 = new Estudiante("name", "surname", "estudiante2@email.com", "123", "12345678", "1994", 5000, "Programacion");
        Estudiante estudiante3 = new Estudiante("name", "surname", "estudiante3@email.com", "123", "12345678", "1995", 5000, "Programacion");
        Estudiante estudiante4 = new Estudiante("name", "surname", "estudiante4@email.com", "123", "12345678", "1996", 5000, "Programacion");

        Staff staff1 = new Staff("name", "surname", "staff1@email.com", "123", "12345678", 20000, "Mañana");
        Staff staff2 = new Staff("name", "surname", "staff2@email.com", "123", "12345678", 20000, "Mañana");
        Staff staff3 = new Staff("name", "surname", "staff3@email.com", "123", "12345678", 20000, "Mañana");
        Staff staff4 = new Staff("name", "surname", "staff4@email.com", "123", "12345678", 20000, "Mañana");

        Persona[] institucion = new Persona[] {estudiante1, estudiante2, estudiante3, estudiante4, staff1, staff2, staff3, staff4};

        int countEstudiante = 0;
        int countStaff = 0;
        double total = 0;

        for (Persona persona : institucion){
            if (persona != null){
                if (persona instanceof Estudiante){
                    countEstudiante++;
                    total += ((Estudiante) persona).getCuotaMensual();
                }
                if (persona instanceof Staff){
                    countStaff++;
                }
            }
        }

        System.out.println("La cantidad de Estudiantes es: " + countEstudiante);
        System.out.println("La cantidad de Miembros de Staff es: " + countStaff);
        System.out.println("El total de ingresos mensuales de los Estudiantes es de: " + total);
    }

    public static void ejercicio3(){

        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo(3);
        Circulo circulo3 = new Circulo("Azul", 5);
        System.out.println("Circulo 1: " + circulo1);
        System.out.println("Perimetro: " + circulo1.calcularPerimetro());
        System.out.println("Area: " + circulo1.calcularArea());
        System.out.println("\n");
        System.out.println("Circulo 2: " + circulo2);
        System.out.println("Perimetro: " + circulo2.calcularPerimetro());
        System.out.println("Area: " + circulo2.calcularArea());
        System.out.println("\n");
        System.out.println("Circulo 3: " + circulo3);
        System.out.println("Perimetro: " + circulo3.calcularPerimetro());
        System.out.println("Area: " + circulo3.calcularArea());
        System.out.println("\n");

        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo(3, 4);
        Rectangulo rectangulo3 = new Rectangulo("Verde", 2, 5);
        System.out.println("Rectangulo 1: " + rectangulo1);
        System.out.println("Perimetro: " + rectangulo1.calcularPerimetro());
        System.out.println("Area: " + rectangulo1.calcularArea());
        System.out.println("\n");
        System.out.println("Rectangulo 2: " + rectangulo2);
        System.out.println("Perimetro: " + rectangulo2.calcularPerimetro());
        System.out.println("Area: " + rectangulo2.calcularArea());
        System.out.println("\n");
        System.out.println("Rectangulo 3: " + rectangulo3);
        System.out.println("Perimetro: " + rectangulo3.calcularPerimetro());
        System.out.println("Area: " + rectangulo3.calcularArea());
        System.out.println("\n");

        Cuadrado cuadrado1 = new Cuadrado();
        Cuadrado cuadrado2 = new Cuadrado(5);
        Cuadrado cuadrado3 = new Cuadrado("Amarillo", 3);
        System.out.println("Cuadrado 1: " + cuadrado1);
        System.out.println("Perimetro: " + cuadrado1.calcularPerimetro());
        System.out.println("Area: " + cuadrado1.calcularArea());
        System.out.println("\n");
        System.out.println("Cuadrado 2: " + cuadrado2);
        System.out.println("Perimetro: " + cuadrado2.calcularPerimetro());
        System.out.println("Area: " + cuadrado2.calcularArea());
        System.out.println("\n");
        System.out.println("Cuadrado 3: " + cuadrado3);
        System.out.println("Perimetro: " + cuadrado3.calcularPerimetro());
        System.out.println("Area: " + cuadrado3.calcularArea());
        System.out.println("\n");

    }
}
