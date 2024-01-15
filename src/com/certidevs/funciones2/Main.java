package com.certidevs.funciones2;

public class Main {
    public static void main(String[] args) {

        // importante nombrar en PascalCase la clase que se invoque o genere. sino no da opción.
        //a generar la clase desde el metodo main.

        int resultado1 = CalculadoraBasica.sumar(10, 20);

        int resultado2 = CalculadoraBasica.restar(20,10 );

        double resultado3 = CalculadoraBasica.multiplicar(12.25,3);


        double resultado4 = CalculadoraBasica.Exponencial(2, 3);


        double media = CalculadoraAvanzada.calcularMedia(new double[]{10.40,20.99,32.11});
        System.out.println(media);

        long resultado5 = CalculadoraBasica.factorial(3);


    }
}
