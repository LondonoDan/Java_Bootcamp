package com.dani;

public class HerenciaCocheElectrico extends creacionClase_coche {

    String motorElectrico;

    //constructor con parametros
    public HerenciaCocheElectrico (String motorElectrico){
        this.motorElectrico= motorElectrico;
    }
    //constructor vacio para crear objetos vacios
    public HerenciaCocheElectrico (){}


    public HerenciaCocheElectrico(String color, String fabricante, String modelo, double peso, double largo, int velocidad, String motorElectrico) {
    //metodo super nos permite invocar el constructor de la clase Madre
        super(color, fabricante, modelo, peso, largo, velocidad);
        this.motorElectrico = motorElectrico;
    }




    @Override
    public String toString() {
        return "HerenciaCocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
