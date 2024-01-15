package com.certidevs.datatypes;

public class TiposDatos {
    public static void main(String[] args) {
        // numeros enteros
        byte num1 = 10;
        short num2 = 500;
        int num3 = 1000000;
        int edad = 40;
        long num4 = 1000000000000L; //la L indica que es un long
        long productId = 1;  // podría ser un Id enorme, de ahí declararlo long al cuando sea necesario
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(edad);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(productId);
        // numeros decimales float y double
        float numeroDecimal1 = 39.99F;  // la F indica que es un float
        float numeroDecimal2 = (float) 41.11F;
        double precio1 = 567985.45;
        double precio2 = 567_985.45; // es lo mismo
        double salary = 30000.45;
        // var fijfapij = 4665657.64643 // nueva funcionalidad ultima version que identifica tipo de dato pero mejor no
        System.out.println(numeroDecimal1);
        System.out.println(numeroDecimal2);
        System.out.println(precio1);
        System.out.println(precio2);
        System.out.println(salary);
        System.out.println(productId);
        //Boolean verdadero o falso
        boolean isActive = true;  // ojo empiezan por minúsculas, no como en Python
        boolean isEstudent = false;
        System.out.println(isActive);
        System.out.println(isEstudent);
        // Char Caracteres. Solo uno, no es común para el día a día...
        char letraA = 'A';
        char otroSimbolo = '$';
        // char otroChar = 'Alan'; // no lo acepta da fallo, solo admite un solo caracter. ocupa poco eso sí
        System.out.println(letraA);
        System.out.println(otroSimbolo);
        // Textos: String
        String firstName = "Alan";
        String eMail = "Alan@certidevs.com";
        boolean isEmpty = eMail.isEmpty();
        System.out.println(firstName);
        System.out.println(eMail);
        System.out.println(isEmpty);
        // Tipos primitivos (int, double, boolean.) vs Tipos de referencia String
        String lastName = null; // equivale a None de Python y es en minúscula el null, no Null
        // double salary = null;  no admite
        // double salary = 0;  es así como tendría que rellenarse,pero no admite null
        System.out.println(lastName);



        String textoLargo = """
                Descripción larga
                con escrito extenso en
                 varias líneas
                """;
        String textoLargo2="el amigo de mi tio"+
                " va caminando por la era" +
                "Y nadie se entera";

        System.out.println(textoLargo);
        System.out.println(textoLargo2);



    }
}
