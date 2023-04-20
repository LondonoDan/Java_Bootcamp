package com.capturaDe_errores;

public class CapturaErro_tryCatch {
    public static void main(String[] args) {
        //Este metodo nos sirve para omitir un error en especifico y que el codigo continue hacia adelante
        //ejemplo primero se debe detectar el error, copiarlo y hacer el try

        try {
            int result = 5/0;

        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("cierre de errores");
        }


        System.out.println("no se muestra el error continuamos");
    }
}
