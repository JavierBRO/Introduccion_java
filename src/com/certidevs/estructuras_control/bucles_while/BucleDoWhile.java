package com.certidevs.estructuras_control.bucles_while;

import java.util.Scanner;

public class BucleDoWhile {
    public static void main(String[] args) {
        String password = "admin";

        Scanner scaner = new Scanner(System.in);

        String userPassword;

        do {
            System.out.println("Introduce el password: ");
            userPassword = scaner.nextLine();

        } while (mismatchPasswords(userPassword, password)); // equals mas recomendable que != compara contenido y tiene en cuenta si es null
        System.out.println("Password correcta");
    }

    private static boolean mismatchPasswords(String userPassword, String password) {
        return !userPassword.equals(password);
    }
}
