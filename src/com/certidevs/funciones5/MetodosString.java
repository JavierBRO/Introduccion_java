package com.certidevs.funciones5;

public class MetodosString {
    public static void main(String[] args) {

        String fullName = "Ambrosio Developer";
        // Obtener la primera palabra de la frase
    /*
    Usamos split()

     */
      String[] palabras = fullName.split(" ");
      String firstName = palabras[0];
      System.out.println(firstName);


    /*
    Usando indexOf y substring()
     */
        int beginIndex = 0;
       // int endIndex =  8; a ojo!!
        int endIndex = fullName.indexOf(" "); // devuelve la posicion del espacio en el String "8"

        firstName = fullName.substring(beginIndex, endIndex);  // si pongo String firstName es error 2 variables iguales
        System.out.println(firstName);  // por eso se ha sobreescrito la variable,sin el String antes...se puede poner String firstName2
    /*
    Extraer el surName o lastName de fullName...apellido
     */
       // USANDO SPLIT

        String lastName = palabras[1];
        System.out.println(lastName);


        // SIN SPLIT
        int beginIndex2 = fullName.indexOf(" ") + 1; // posición de "D"substring en su metodo

        String lastName2 = fullName.substring(beginIndex2); // va hasta el final del String al devolverlo

        int endIndex2 = fullName.length();
        String lastName3 = fullName.substring(beginIndex2, endIndex2); // va tambien sin restar 1 en la posicion porque substring es excluyente el final

        System.out.println(lastName2);
        System.out.println(lastName3);


    }




}
