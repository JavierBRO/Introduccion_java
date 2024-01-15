package com.certidevs.funciones6;

import java.util.Arrays;
import java.util.List;
// Ver ejemplos de uso de sintaxis de Var Args en metodos ya existentes en Java
public class FuncionesVarArgs2 {
    public static void main(String[] args) {

        // Creación de listas
        // Esta lista tiene tamaño fijo como una Array normal
        // Los elementos de la lista si son mutables

        List<String> personas = Arrays.asList("Persona1", "Persona2", "Persona3", "Persona4");

        // lista inmutable, que no se puede agregar ni borrar

        List<String> nombres = List.of("Carlos", "Ramon","Pedro"); // se pueden pasar todos los que quieras

        // imprimir textos String.format(texto, parameto1, parametro2......);

        String frase = String.format("Firstname: %s, lastname: %s, age: %d, Registrado: %b, Salario: %.2f \nHola%nAdios",

                "Ambrosio","Developer",20,true,1000000.00);
        System.out.println(frase); // He incluido ":" y "," para separacion visual
        // El format String interpreta %s para String, %d para dígitos, %b para booleanos y %.2f para 2 decimales
        //  \n Salta de línea Hola y %n lo mismo pero con Adios.

    }
}
