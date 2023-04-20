package com.dani;

public class bucleFor_While {
    public static void main(String[] args) {
        //                                  CICLOS
        //Bucle for

        for (int i =0; i <=5; i++){
            System.out.println("Este mensaje se imprime: "+i);
        }

        //Bucle While
        int contador=0;

        while(contador <= 5){
            System.out.println(contador+ ": Me imprimo");
            contador++;
        }

        // palabras de contro break y continue

        int contar=0;

        while (contar<=5){
            contar++;
            if (contar == 3)
                break;
                System.out.println( "digo hola "+contar);

        }
        System.out.println("fin");


        int count=0;

        while (count<=5){
            count++;
            if (count == 3)
                continue;
            System.out.println( "digo hola "+count);

        }
        System.out.println("Hasta aca llegue: " +count);


    //continue y break en ciclo for
        for (int i =0; i <=5; i++){
            if (i==4)
                continue;
            System.out.println("Este mensaje se imprime: "+i);
        }

    }
}
