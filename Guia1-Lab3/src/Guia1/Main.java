package Guia1;

public class Main {

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
    }

    public static void ejercicio1(){

        Rectangulo rectangulo1 = new Rectangulo(5, 2);
        System.out.println("Rectangulo 1");
        System.out.println("Ancho: " + rectangulo1.getAncho());
        System.out.println("Alto: " + rectangulo1.getAlto());
        System.out.println("Perimetro: " + rectangulo1.calcularPerimetro());
        System.out.println("Area: " + rectangulo1.calcularArea());
        System.out.println();

        rectangulo1.setAncho(8);
        rectangulo1.setAlto(4);
        System.out.println("Modificado Rectangulo 1");
        System.out.println("Perimetro: " + rectangulo1.calcularPerimetro());
        System.out.println("Area: " + rectangulo1.calcularArea());
        System.out.println();

        Rectangulo rectangulo2 = new Rectangulo();
        System.out.println("Rectangulo 2");
        System.out.println("Ancho: " + rectangulo2.getAncho());
        System.out.println("Alto: " + rectangulo2.getAlto());
        System.out.println("Perimetro: " + rectangulo2.calcularPerimetro());
        System.out.println("Area: " + rectangulo2.calcularArea());
        System.out.println();
    }

    public static void ejercicio2(){

        Empleado emple1 = new Empleado("23456345", "Carlos", "Gutierrez", 25000F);
        Empleado emple2 = new Empleado("34234123", "Ana", "Sanchez", 27500F);

        System.out.println(emple1);
        System.out.println(emple2);

        emple1.aumentarSalario(20);
        System.out.println("Salario anual de empleado 1: " + emple1.calcularSalarioAnual());
    }

    public static void ejercicio3(){

        ItemVenta item1 = new ItemVenta("Cuaderno", 3, 200);
        ItemVenta item2 = new ItemVenta("Carpeta", 2, 350);

        System.out.println("Info de los items 1 y 2: ");
        System.out.println(item1);
        System.out.println(item2);
    }

    public static void ejercicio4(){

        CuentaBanco cuenta1 = new CuentaBanco("Lucas", 15000);
        cuenta1.credito(2500);
        cuenta1.debito(1500);
        cuenta1.debito(30000);
        System.out.println(cuenta1);
    }

    public static void ejercicio5(){

        Horario horario = new Horario(18, 30, 59);
        System.out.println(horario);
        horario.sumarSegundo();
        System.out.println(horario);
        horario.restarSegundo();
        System.out.println(horario);
    }
}
