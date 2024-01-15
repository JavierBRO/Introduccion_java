package com.certidevs.estructuras_control.bucles_while;

public class BucleWhileBreak {
    public static void main(String[] args) {


        // Array de nombres. Comprobamos si existe Wally, si es así se rompe el buble

        String[] nombres = {"Ramón", "Juan", "Wally","Jose", "John"};

        boolean existeWally = false; // checkeos de true y false es típico
        int i = 0;
        while (i < nombres.length) {
            if (nombres[i].equals("Wally")) {
                existeWally = true;
                break;
            }
            System.out.println(nombres[i]);
            i++;
        }
        if (existeWally) {
            System.out.println("Wally ha sido encontrado");
        } else {
            System.out.println("No se ha encontrado a Wally");
        }
    }
}
