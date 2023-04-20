package com.dani;

public class ObjetoCoche_main {
    public static void main(String[] args) {
        //Objeto
        creacionClase_coche coche = new creacionClase_coche("azul", "Mazda", "renault", 80.3, 80.5, 120);
        //se esta llamando el metodo acelerar
        coche.acelerar(50);
        // se estan imprimiendo todos los atributos del objeto creado
        System.out.println(coche);

        HerenciaCocheElectrico cocheElectric = new HerenciaCocheElectrico("morado", "lamborgini", "1980", 80.3, 80.5, 10,"jshdhd");
        cocheElectric.acelerar(20);
        System.out.println(cocheElectric);

        HerenciaCocheElectrico cochePrueba = new  HerenciaCocheElectrico("gonorrea!");
        cochePrueba.acelerar(29);
        System.out.println(cochePrueba);

    }
}
