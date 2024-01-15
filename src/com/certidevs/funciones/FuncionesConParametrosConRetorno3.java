package com.certidevs.funciones;

public class FuncionesConParametrosConRetorno3 {

    public static void main(String[] args) {

    // Crear un Array de precios sin IVA double
        double[] preciosSinIVA = { 10, 20, 30, 40, 50, 60 };

        preciosSinIVA[1] = 200;


    // invocar una funcion que reciba los precios sin IVA pero que devuelva tambien un Array de precios con IVA double.
        double[] preciosConIVA = calcularIVAs(preciosSinIVA);


        double[] preciosConIVA2 = calcularIVAs(new double[] {100, 200, 300, 400});




    }

    private static double[] calcularIVAs(double[] preciosSinIVA) {
        // Sin crear nuevo Array. Pero modifica el Array existente y se pierden los datos originales
       /**
        for (int i = 0; i < preciosSinIVA.length; i++) {
            preciosSinIVA[i] = preciosSinIVA[i] * 1.21;
        }
        return preciosSinIVA;  //No recomendable porque la original es  modificada ojo. Se han perdido los sin IVA.
        */

       // Creando nuevo Array. Pero NO modifica el Array existente y NO se pierden los datos originales. Quedan Guardados
       double[] preciosConIVA = new double[preciosSinIVA.length];
       for (int i = 0; i < preciosSinIVA.length; i++) {
           preciosConIVA[i] = preciosSinIVA[i] * 1.21;

       }
       return preciosConIVA;
    }


}
