package com.listas;


import java.util.ArrayList;
import java.util.List;

public class listas {
    public static void main(String[] args) {
        //Creación de listas

        List<String> nomb = new ArrayList<>();
        nomb.add("Daniela");
        nomb.add("Flor");
        nomb.add("Marce");
        nomb.add("lili");
        nomb.add("Mariangel");
        nomb.add("Jorge");

        //formas de recorrer una lista, con foreach
        System.out.println(nomb);

        for (String nombre:nomb) {
            System.out.println(nombre);
        }


        //Lista de objetos creados a traves de la clase lista_coches
        List<String> coches = new ArrayList<>();
        coches.add(String.valueOf(new lista_coches("lambo")));
        coches.add(String.valueOf(new lista_coches("sh")));
        coches.add(String.valueOf(new lista_coches("eso")));

        System.out.println(coches);

        for (String c:coches) {
            System.out.println(c);
        }
    }

}
