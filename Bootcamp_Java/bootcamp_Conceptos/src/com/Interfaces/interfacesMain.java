package com.Interfaces;

public class interfacesMain {
    public static void main(String[] args) {

        //creacion de objetos usando polimorfismo y interfaz
        CocheService coche4 = new Cocheclassic_implementInterface();
        coche4.destruitCoche();


        CocheService coche5 = new Cochesport_implementInterface();
        coche5.crearcochedemo();


    }
}
