package com.certidevs.estructuras_control.Switchs;

public class SwitchTradicional {
    public static void main(String[] args) {

        int weekDay = 2;  // imprimir el dia de la semana en texto según numero
        // el break es importante, sino continua ejecutando a partir del seleccionado

        switch (weekDay) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día de la semana incorrecto");
        }
    }
}
