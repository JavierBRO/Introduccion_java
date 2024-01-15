package com.certidevs.funciones2;

public class CalculadoraBasica {

    // Esto son funciones creadas desde main previa creación de la clase CalculadoraBasica.
    //pues han sido invocadas desde main al terminar de crearlas aqui.

    public static int sumar(int i, int i1) {
        return i + i1;
    }

    public static int restar(int num1, int num2) {
        return num1 - num2;

    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;

    }

    public static double Exponencial(double X, double Y) {
        return Math.pow(X, Y);
    }

    public static long factorial(long numFact) {
        if (numFact == 0) {
            return 1;
        } else {
            return (numFact * factorial(numFact - 1));

        }
    }
}
