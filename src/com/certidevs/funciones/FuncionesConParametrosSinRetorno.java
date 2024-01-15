package com.certidevs.funciones;

/**
 * /*
 * Cuando se genera con el IDE la función aparece encerrada en unos cuadros para que el desarrollador
 * pueda escoger el tipo de dato o el nombre. Pulsar Enter.
 *  */


public class FuncionesConParametrosSinRetorno {

    public static void main(String[] args) {  // este es un ejemplo claro de que la funcion main de java no devuelve nada

        String nombre = "Javier";
        saludarPorNombre(nombre);

        String apellido = "Rodriguez";
        saludarPorApellido(apellido);

        saludarPorNombreApellido(nombre, apellido);
    }
    // Con dos parámetros
    private static void saludarPorNombreApellido(String nombre, String apellido) {
        System.out.println("Hola " + nombre + " " + apellido);

    }

    // Funcion con un parametro
    private static void saludarPorApellido(String apellido) {
        System.out.println("Hola Sr./Sra. " + apellido);
    }

    // Hay que especificar el tipo de dato al parámetro
    private static void saludarPorNombre(String nombre) {
        System.out.println("Hola " + nombre);
        System.out.println("Hola, " + nombre);
    }


}

