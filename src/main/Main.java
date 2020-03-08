package main;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Hola mundo!");
        System.out.println("Ingresa tu nombre");
        String nombre = teclado.next();
        System.out.println("El nombre ingresado fue " + nombre);

        float largo;
        float ancho;
        float alto;
        float volumen;
        System.out.println("Ingresa el largo de la caja");
        largo = teclado.nextFloat();
        System.out.println("Ingresa el ancho de la caja");
        ancho = teclado.nextFloat();
        System.out.println("Ingresa el alto de la caja");
        alto = teclado.nextFloat();
        volumen = largo * ancho * alto;
        System.out.println("El volumen de la caja es " + volumen);

    }

}
