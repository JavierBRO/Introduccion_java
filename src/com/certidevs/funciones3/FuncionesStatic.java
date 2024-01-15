package com.certidevs.funciones3;

import java.util.List;
import java.util.UUID;

public class FuncionesStatic {
    public static void main(String[] args) {
        //El modificador static permite invocar metodos sin crear objetos/variables de la clase.

        // << NombreClase.nombreMetodo();>>  SON METODOS ESTATICOS. Una sola línea o sentencia de codigo

        String numeroPrueba = String.valueOf(123);
        int valorMinimo = Math.min(5,10);
        UUID identificador = UUID.randomUUID();
        double valorMax = Double.max(30.23, 40.55);
        long tiempoActualMs = System.currentTimeMillis();
        boolean isDigit = Character.isDigit('5');
        boolean isDigit2 = Character.isDigit('A');
        boolean isLetter = Character.isLetter('a');
        boolean isLetter2 = Character.isLetter(4);
        List<String> personas = List.of("persona1", "persona2", "persona3");


    }
}
