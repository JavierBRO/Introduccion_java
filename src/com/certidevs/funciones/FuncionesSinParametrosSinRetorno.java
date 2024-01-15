package com.certidevs.funciones;

/**
 * En Python se definian con def
 *
 * En Java la sintaxis es la siguiente: (modificadores)
 *
 * visibilidad: public,private, protected.
 * static: no se pueden modificar la clase. pertenece a una clase, y no es necesario crear  objetos.
 *
 * Tipo Retorno:
 *          void: No devuelve nada, no hace falta poner return.
 *          int: Devuelve un valor entero.
 *          String: Devuelve una cadena de caracteres.
 *          String[]: Devuelve una lista de cadenas de caracteres........
 *          Object: Devuelve un objeto. etc..
 * Identificador
 * (
 * parametro1,
 * parametro2,..
 * )
 *{ }
 *
 * */
public class FuncionesSinParametrosSinRetorno {

    public static void holaMundo() {
        System.out.println("Hola mundo 1");  // creación de la funcion más simple, sin parametros, sin return...

    }

        public static void main(String[] args) {
        holaMundo();
        holaMundo();
        holaMundo2();


    }
    public static void holaMundo2() {
        System.out.println("Hola mundo 2");  // creación de otra funcion más simple, sin parametros, sin return...
    }   // la ejecución siempre dentro de una clase main de ejecución. Y definir las funciones se podrían poner todas abajo.

}


