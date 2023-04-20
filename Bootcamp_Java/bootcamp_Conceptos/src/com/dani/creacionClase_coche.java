package com.dani;

public class creacionClase_coche {
    //Atributos

    String color;
    String fabricante;
    String modelo;
    double peso;
    double largo;
    int velocidad=0;



    //Costructores : Permiten crear objetos de la clase creada
    public creacionClase_coche(String color, String fabricante, String modelo, double peso,double largo, int velocidad) {
        this.color = color;
        this.fabricante= fabricante;
        this.modelo= modelo;
        this.peso= peso;
        this.largo= largo;
        this.velocidad= velocidad;
        this.velocidad= velocidad;

    }
    //Constructor vacio permite crear objetos vacios, sin parametros
    public creacionClase_coche() {
    }

    // Metodos

    public void acelerar(int cantidad){
        this.velocidad+= cantidad;
        System.out.println("el coche "+this.fabricante+  " tiene una velocidad de: "+velocidad);
    }
    //Metodo tostring
    @Override
    public String toString() {
        return "creacionClase_coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
