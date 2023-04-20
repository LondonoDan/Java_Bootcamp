package com.dani;

public class Switch {
    public static void main(String[] args) {
        //validar días de la semana con switch
        String diaSemana= "Lunes";

        switch (diaSemana){
            case "Lunes":
                System.out.println("Es lunes!");
                break;
            case "Martes":
                System.out.println("Es martes!");
                break;
            case "Miercoles":
                System.out.println("Es miercoles");
                break;
            default:
                System.out.println("No hay ningun día");
                break;
        }

    }
}
