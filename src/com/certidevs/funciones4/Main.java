package com.certidevs.funciones4;

public class Main {
    public static void main(String[] args) {

        //Ejemplos 1 y 2: distincion entre Static y no Static

        //STATIC: NombreClase.nombreMetodo();

        int resultado1 = Calculadora.sumar(10, 20);
        System.out.println(resultado1);


        // NO STATIC:

        // NombreClase identificador = new NombreClase();
        // identificador.nombreMetodo();

        Calculadora calculadoraCasio = new Calculadora();
        int resultado2 = calculadoraCasio.multiplicar(10, 20);
        System.out.println(resultado2);





    }


}
