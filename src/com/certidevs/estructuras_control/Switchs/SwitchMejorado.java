package com.certidevs.estructuras_control.Switchs;

import java.util.Scanner;

public class SwitchMejorado {
    public static void main(String[] args) {
//        int weekDay = 2;  // el break ya está por defecto y no hace falta ponerlo (Enhanced Switch)
//      Es  lo mismo pero pidiendo el número de la semana por consola.
        // ojo al introducir una letra salta una excepcion de error en el codigo.
        int weekDay;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Introduce el día de la semana: ");
        weekDay = scaner.nextInt();

        switch (weekDay){

            case 1 -> System.out.println("Lunes");
            case 2 -> {   // mas de una sentencia necesita llaves
                System.out.println("Martes");
                System.out.println("Martes");
            }
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Valor incorrecto");

        }
    }
}
