package com.certidevs.funciones3;

public class FuncionesNoStatic {

    public static void main(String[] args) {
        /**
         * Las funciones que no son Static necesitan crear variable/objeto y ejecutar la funcion
         * sobre ese objeto/variable
         *
         * NombreClase identificador = new NombreClase();
         */
        // ojo IMPORTANTE: no se pueden invocar directamente con el nombre de la clase.
        // NO STATIC, 2 sentencias: <<NombreClase identificador = new NombreClase();>>
        //                          <<identificador.nombreMetodo();>>

        String prueba = new String();
        String prueba2 = new String("Ejemplo prueba");
        String prueba3 = "Otro texto";

        int longitudTexto = prueba.length();  // es public ojo..como no llevan la palabra Static.
        boolean isVacio = prueba3.isEmpty();  // se accede a traves de la variable.
        String textoMinusculas = prueba3.toLowerCase();  // se accede a traves de la variable.
        String resultadoReemplazado = prueba3.replace("texto", "contenido");

        /*
        Ejemplo con clase propia (no la String):
         */


    }


}
