package com.certidevs.funciones;

public class FuncionesConSobrecarga2 {
    public static void main(String[] args) {
        /**
         * más ejemplos de sobrecarga de funciones, ya exixtentes en java
         */

        String numero10 = String.valueOf(10);

        String isActive = String.valueOf(true);

        int maximo1 = Math.max(10, 20);
        double  maximo2 = Math.max(10.33, 30.20);
        float maximo3 = Math.max(10.11f, 30.20f);
        int max = Math.max((int) 50.44, 20);// con testing de cambio float a integer
    }
}
