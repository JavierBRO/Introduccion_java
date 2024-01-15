package com.certidevs.estructuras_control.if_else;

public class IfElse {
    public static void main(String[] args) {
        // Estructura de control condicional: if, else if, else

        double precio = 66.55;
        if (precio > 50) {      // hay que poner parentesis y no se ponen dos puntos como en python, se ponen llaves
            System.out.println("Gastos de envío gratis.");
        }
        if (precio >100) System.out.println("Gastos de envío gratis."); // una sola sentencia no necesario LLaves

        //no necesario llaves ni en este caso: a haber una sola sentencia por if e else
        if (precio <30)
            System.out.println("Envío gratis.");
        else
            System.out.println("Envío de pago.");


    }
}
