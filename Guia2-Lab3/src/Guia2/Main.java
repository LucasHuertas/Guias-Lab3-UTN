package Guia2;

import Guia2.ejercicio1.Autor;
import Guia2.ejercicio1.Libro;
import Guia2.ejercicio2.Cliente;
import Guia2.ejercicio2.Factura;
import Guia2.ejercicio2.ItemVenta;

public class Main {

    public static void main(String[] args) {

        //ejercicio1();
        //ejercicio2();
        ejercicio3();
    }

    public static void ejercicio1(){

        Autor autor1 = new Autor("Joshua", "Bloch", "joshua@email.com", 'm');
        Autor autor2 = new Autor("Lucas", "Huertas", "lucas@email.com", 'm');
        Autor autor3 = new Autor("Sharon", "Zevallos", "sharon@email.com", 'f');

        System.out.println(autor1);

        Autor[] autores = new Autor[10];
        autores[0] = autor1;
        autores[1] = autor2;
        autores[2] = autor3;

        Libro libro1 = new Libro("Effective Java", 450, 150, autores);
        System.out.println(libro1);

        libro1.setPrecio(500);
        libro1.setStock(libro1.getStock() + 50);
        System.out.println(libro1.getAutor(0));

        System.out.println(libro1.imprimirUnico());
        System.out.println(libro1.imprimirArreglo());
    }

    public static void ejercicio2(){

        Cliente cliente1 = new Cliente("Lucas", "lucas@email.com", 50);
        System.out.println(cliente1);

        ItemVenta item1 = new ItemVenta("Harina", "0000", 200);
        ItemVenta item2 = new ItemVenta("Pan Rallado", "Fino", 100);
        ItemVenta item3 = new ItemVenta("Chocolate", "Amargo", 300);
        ItemVenta[] itemVentas = new ItemVenta[10];
        itemVentas[0] = item1;
        itemVentas[1] = item2;
        itemVentas[2] = item3;

        Factura factura1 = new Factura(cliente1, itemVentas);
        System.out.println("Monto total sin descuento: " + factura1.getMontoTotal());
        System.out.println("Monto total con descuento: " + factura1.calcularMontoTotalConDescuento());
        System.out.println(factura1);
    }

    public static void ejercicio3(){


    }


}
