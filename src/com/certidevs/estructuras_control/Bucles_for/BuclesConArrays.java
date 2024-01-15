package com.certidevs.estructuras_control.Bucles_for;

/**
 * Javadoc
 *
 * Ejemplos de bucles for con Arrays
 */
public class BuclesConArrays {
    public static void main(String[] args) {

        // tipodato[] identificador = { valor1, valor2, valor3 }
        int[] calificaciones = {9, 8, 7, 6, 5}; // long 5
        String[] nombres = { "Juan", "Pedro", "Maria", "Jose", "Julian" };

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println(nombres[i] + " tiene una calificación de " + calificaciones[i]);
        }

        String[] phones = new String[3];
        phones[0] = "555-555-5555";
        phones[1] = "666-666-6666";
        phones[2] = "777-777-7777";
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        // da el fallo porque excede la longitud del array
        // phones[3] = "888-888-8888";
//        phones[3] = "888-888-8888";
//
        // mutable
        phones[2] = "999-999-9999";
        // System.out.println(phones[1]);

        for (int i = 0; i < phones.length; i++) {

            System.out.println(phones[i]);
        }

        // Bucle tradicional a la inversa
        for (int i = phones.length - 1; i >= 0; i--) {

            System.out.println(phones[i]);
        }

        // enhanced bucle for each
        // las recomendacione de intellij IDE escribir primero phones.for

        for (String phone : phones) {

            System.out.println(phone);
            System.out.println(phone.length());

            
        }



    }
}
