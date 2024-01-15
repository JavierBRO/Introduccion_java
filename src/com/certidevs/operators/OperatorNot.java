package com.certidevs.operators;

public class OperatorNot {
    public static void main(String[] args) {

        // ! not, invierte el valor de un boolean
        // si tienes verdadero lo cambia a falso y viceversa

        boolean isAdult = true;
        System.out.println(isAdult);
        System.out.println(!isAdult);  // se utiliza directamente el resultado en una operación
        boolean isNotAdult = !isAdult; // Se guarda el resultado de la negación en una variable
        System.out.println(isNotAdult);

    }
}
