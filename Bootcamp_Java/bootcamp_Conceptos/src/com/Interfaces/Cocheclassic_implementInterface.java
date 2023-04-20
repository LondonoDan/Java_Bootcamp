package com.Interfaces;

import com.dani.HerenciaCocheElectrico;
import com.dani.creacionClase_coche;

public class Cocheclassic_implementInterface implements CocheService{

    @Override
    public creacionClase_coche crearcochedemo() {
        System.out.println("Estamos creando el coche clasico, esperamos te guste!");
        return null;
    }

    @Override
    public creacionClase_coche destruitCoche() {
        System.out.println("estamos destruyendo el coche :( ");
        return null;
    }

}
