package com.certidevs.funciones;

import java.util.UUID;

/**
 /*
 las funciones deben estar siempre dentro de una clase/interfaz/enum/record
 Habitualmente se colocan al final final de la clase, antes del cierre de la clase

 main es una función especial que es el punto de entrada a los programas java, es la primera función
 en ejecutarse, y desde ella podemos llamar a otras funciones.

 No confundir la palabra main de java con la terminología de ramas de git

 Nomenclatura: camelCase

 El nombre de la función debe reflejar la acción que realiza, sugerencia:
 comenzar el nombre de la función con un verbo:

 * create...
 * save...
 * delete....
 * update....
 * find...
 * calculate....
 * send...
 * retrieve...
 * connect...

 Cumplir principio de una sola responsabilidad SRP (un principio SOLID)
 cuya idea sería que una función tenga una sola responsabilidad, desglosar responsabilidades
 en múltiples funciones.

 Desglosar problemas complejos en funciones pequeñas con una sola responsabilidad.

 A veces es habitual tener una función que llama a otras funciones más pequeñas

 static indica que se puede invocar sin crear objeto,
 ej: FuncionesSinParametrosConRetorno.generateRandomName()
 */
 
public class FuncionesSinParametrosConRetorno {

    public static void main(String[] args) {

            String randomFileName1 = generateRandomFileName();
            String randomFileName2 = generateRandomFileName();
            String randomFileName3 = generateRandomFileName();

            System.out.println(randomFileName1);
            System.out.println(randomFileName2);
            System.out.println(randomFileName3);

    }

    public static String generateRandomFileName() {
        //lo importante es que la sentencia tenga un return. (si no se cambiará a void
        return UUID.randomUUID().toString(); // genera un uuid en texto,  id unico universal aleatorio
    }

}
