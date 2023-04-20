package com.dani;

import static com.dani.Funciones.suma;

public class modificadoresAcceso {
    public static void main(String[] args) {
        /*
        * los modificadores de acceso son: public, private, protegido
        * los cuales indican que el public: se puede llamar desde cualquier otra clase que tengamos.
        * private: indica que solo la puedes llamar desde esa clase creada.
        * protected: indica que solo las clases hijas o las clases del mismo paquete (el paquete es com.dani) se puedan llamar.
        * */
        //ejemplo de funciones llamandolas desde la clase Funciones
        Funciones.holaTodos();
        //llamando una funcion retornando una suma de enteros.
        int resultadoSuma= suma(3,5);
        System.out.println(resultadoSuma);

    }
}
