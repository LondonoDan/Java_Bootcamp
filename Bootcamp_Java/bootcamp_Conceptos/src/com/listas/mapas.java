package com.listas;

import java.util.HashMap;
import java.util.Map;

public class mapas {
    public static void main(String[] args) {
        Map<String,String> personas = new HashMap<>();
        personas.put("445"," jojo");
        personas.put("444"," Hola");
        personas.put("447"," hlo");
        personas.put("442"," df");
        System.out.println(personas);


        //solo brinda el primer valor del string que es "445"
        for (String key:personas.keySet()) {
            System.out.println(key);
        }

        //Muestra el segundo valor del string que es "jojo"

        for (String values:personas.values()) {
            System.out.println(values);
        }

        //nos muestra ambos valores
        for (Map.Entry<String,String> dato: personas.entrySet()){
            System.out.println(dato.getKey()+ "" + dato.getValue());
        }

    }
}
