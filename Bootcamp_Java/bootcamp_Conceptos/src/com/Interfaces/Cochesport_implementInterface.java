package com.Interfaces;

import com.dani.HerenciaCocheElectrico;
import com.dani.creacionClase_coche;

public class Cochesport_implementInterface implements CocheService{

    @Override
    public creacionClase_coche crearcochedemo() {
        System.out.println("Estamos creando el coche sport, esperamos te guste!");
        return new HerenciaCocheElectrico();
    }

    @Override
    public creacionClase_coche destruitCoche() {
        System.out.println("Estamos destuyendo el coche :(");
        return null;
    }


}
