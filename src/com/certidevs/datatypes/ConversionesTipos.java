package com.certidevs.datatypes;

public class ConversionesTipos {
    public static void main(String[] args) {
        // de tipo más pequeño a tipo más grande (implícitas, automático)
        //conversion de int a long
        int countryArea = 200_000;
        long countryArea2 = countryArea;

        System.out.println(countryArea);
        System.out.println(countryArea2);

        // float a double
        float altura = 180.55F;
        double altura2 = altura; // será automática tb.
        System.out.println(altura);
        System.out.println(altura2);
        // de tipo mas grande a tipo más pequeño (explicita, no automática es casting)
        // cuidado, el long no cabe en el int y da problemas: da un error negativo INCONSISTENCIAS, si cupiera no da fallo
        long countryPopulation = 500045565594567876L;
        int countryPoputlation2 = (int) countryPopulation;
        System.out.println(countryPopulation);
        System.out.println(countryPoputlation2);

        // entre tipos de datos distintos, que pasa...hay que obligar al tipo de dato a convertir
        double precio = 45.59;
        int precio2 = (int) precio; // se queda con la parte entera y eso que no es redondeo
        int precio3 = (int) Math.round(precio); // redondea el decimal

        System.out.println(precio);
        System.out.println(precio2);
        System.out.println(precio3);

        // String a double...tampoco es explicito
        String salario1 = "3562.33";  //aquí es texto
        double salario2 = Double.parseDouble(salario1); //aqui ya se ha transformado a double

        System.out.println(salario1);
        System.out.println(salario2 + 1000);


        // Double a String..tampoco es explicito

        double precioLaptop = 899.25;
        String precioLaptop2 = precioLaptop + ""; // concatenando o con otro metodo:
        String precioLaptop3 = String.valueOf(precioLaptop); // transforma a texto

        System.out.println(precioLaptop);
        System.out.println(precioLaptop + 0.25); // Suma coherente
        System.out.println(precioLaptop2);
        System.out.println(precioLaptop3);
        System.out.println(precioLaptop3 + 5 ); // concatena al sumar texto



    }
}
