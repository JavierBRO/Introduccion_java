package com.certidevs.operators;

public class OperatorAnd {
    public static void main(String[] args) {
        double price = 556.44;


        boolean isFreeShipping = price > 50;
        boolean isFreeShipping2 = price > 50 && price < 100;

        System.out.println(isFreeShipping);
        System.out.println(isFreeShipping2);

        double weight = 20;
        // 1.- condiciones en una sola sentencia
        boolean isFreeShipping3 = price > 50 && price < 100 && weight > 0 && weight < 30;
        System.out.println(isFreeShipping3);


        // desglosando condiciones
        boolean isCorrectPrice = price > 50 && price < 100;
        boolean isCorrectWeight = weight > 0 && weight < 30;
        boolean result = isCorrectPrice && isCorrectWeight;

        System.out.println(isCorrectPrice);
        System.out.println(isCorrectWeight);
        System.out.println(result);


    }
}
