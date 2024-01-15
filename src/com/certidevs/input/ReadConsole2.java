package com.certidevs.input;

import java.util.Scanner;

public class ReadConsole2 {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int edad = readInt("Introduce tu edad");
        int numHijos = readInt("Introduce el número de descendientes");

        System.out.println("La edad seleccionada es: " + edad );
        System.out.println("El número de descendientes es: " + numHijos);
    }

    // EQUIVALENTE al método read_int de input_utils que hicimos en PYTHON
    private static int readInt(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt(); // Leer un número int
    }
}