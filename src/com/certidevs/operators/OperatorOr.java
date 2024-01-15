package com.certidevs.operators;

public class OperatorOr {
    public static void main(String[] args) {
        // Disyunción, or, ||

        boolean isStudent = false;      // crea una variable nueva, por eso se le asigna tipo
        int age = 60;

        boolean isEligible = isStudent || age < 65;
        System.out.println(isEligible);

        // Combinacion de ambas and con or, && con ||

        isEligible = age > 20 && age < 65 || isStudent;     // sobreescribe una variable exitente ya tipada
        System.out.println(isEligible);

    }
}
