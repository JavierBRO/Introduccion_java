package com.certidevs.funciones6;

public class FuncionesVarArgs {
    public static void main(String[] args) {

        // VarArgs permite pasar varios argumentos a una función. de forma variable. Todos los que quieras

        System.out.println(sumatorio(10,20));
        System.out.println(sumatorio(10,20,30));
        System.out.println(sumatorio(10,20,30,40,50)); //aceptaría los parámetros que se quisieran. no habitual.
        System.out.println(sumatorio(10,20,30,40,50,60,70,80,90,100));

    }

    private static int sumatorio(int ... numeros) {  // los parámetros se juntan a una Array int[]
        int suma = 0;

        for (int numero : numeros) {  // Array int[] numeros

            suma += numero;
            
        }
        return suma;
    }

    // Python def sumatorio(*numeros):
}

