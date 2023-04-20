package com.dani;

import java.util.Scanner;

public class introducir_datos_por_teclado {
    public static void main(String[] args) {
        //Introducir datos por teclado "Out" quieres decir salida "in " quiere decir entrada
        //Ejemplo

        //solicitando el dato
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = scanner.nextLine();
        //Mostrando el dato
        System.out.println("Hola "+nombre);




    }
}
