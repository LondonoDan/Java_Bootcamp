package com.dani;

public class Arrays {
    public static void main(String[] args) {
        //Creacion de arrays
        //array sin llenar indicando que tiene 10 posiciones,
        int [] notas = new int[10];

        //para agregarle datos al array ejemplo
        notas[0]= 50;
        notas[4]= 9;
        System.out.println(notas[0]);

        //array lleno
        int[] Notas = {9,7,5,4};
        System.out.println(Notas[2]);

        //Recorrer un array, el length nos da la longitud total del array o de algo
        for (int i =0; i <Notas.length; i++){
            System.out.println("la nota es : "+Notas[i]);
        }
        // otra forma de recorrer un array y mostrar los valores que se encuentran dentro de el es de la siguiente manera
        for(int item:Notas){
            System.out.println(item);
        }

        //Metodos para arrays
        //devuelve la posición indicada


        //organiza el array en orden

    }
}
