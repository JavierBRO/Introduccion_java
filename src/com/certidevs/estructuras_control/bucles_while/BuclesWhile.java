package com.certidevs.estructuras_control.bucles_while;


import java.util.Scanner;

public class BuclesWhile {
    public static void main(String[] args) {

        // EJEMPLO1 : Bucles con contador

        int contador = 0;
        while (contador < 10) {
            System.out.println("Contador: " + contador);
            contador++;

        }
        // EJEMPLO2 : do while itera al menos una vez, pedir la contraseña para que sea correcta

        String password = "admin";

        Scanner scaner = new Scanner(System.in);

        String userPassword;

        do {
            System.out.println("Introduce el password: ");
            userPassword = scaner.nextLine();

        } while (!userPassword.equals(password)); // equals mas recomendable que != compara contenido y tiene en cuenta si es null
        System.out.println("Password correcta");




    }
}
