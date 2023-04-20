package com.dani;

public class Funciones {
    public static void main(String[] args) {
        //Funcion sin parametros
        holaTodos();

        //Funcion con parametros SOBRECARGA DE FUNCIONES: quiere decir que podemos crear
        //varias funciones con el mismo nombre y enviarle diferentes parametros para que no genere error ejemplo:
        holaNombre("Dani");
        holaNombre(50);

        //Funcion retornando algo (siempre que se retorne algo va la palabra return, que indica que nos esta devoviendo ese dato
        String apellido = holaApellido();
        System.out.println(apellido);

        int resultadoSuma= suma(3,5);
        System.out.println(resultadoSuma);
    }
    protected static void holaTodos(){
        System.out.println("Hola a todos!");
    }

    public static void holaNombre(String nombre){
        System.out.println("Hola "+nombre);
    }

    public static void holaNombre(int numero){
        System.out.println("el número: "+numero );
    }

    private static String holaApellido(){
        return "Londoño";
    }

    public static int suma(int numero1, int numero2){
        return numero1+numero2;
    }



}
