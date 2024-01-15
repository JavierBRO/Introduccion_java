package com.certidevs.estructuras_control.Bucles_for;

public class BuclesFor {

    public static void main(String[] args) {

        // Bucle for tradicional con paso 1
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteración número " + i);
        }
        // la variable i no existe fuera del bucle for. Si se usa sale en rojo
        // Bucle for sin llaves por tener solo una sentencia


        for (int i = 0; i < 10; i++)
            System.out.println("Número de iteración " + i);

        // Bucle for tradicional con paso 2
        for (int i = 0; i < 15; i += 2) {
            System.out.println("Iteración número " + i);
        }
    }
}
