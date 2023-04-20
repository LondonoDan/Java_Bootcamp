package com.listas;

public class lista_coches {
    String nom = "Nombre de coche";


    public lista_coches(String Nombre) {
        this.nom = Nombre;
    }

    public lista_coches() {
    }

    @Override
    public String toString() {
        return "lista_coches{" +
                "nombre='" + nom + '\'' +
                '}';
    }
}
