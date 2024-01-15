package com.certidevs.funciones;

public class FuncionesConParametrosConRetorno2 {

    public static void main(String[] args) {

        // Array de 5 calificaciones double

        double[] calificaciones = { 5.6, 7.5, 4.3, 8.5, 9.2 };

        // llamar a una funcion que calcule la nota media y la retorne

        double calificacionMedia = calcularCalificacionMedia(calificaciones);

        System.out.println(calificacionMedia);

     //   System.out.println(calcularCalificacionMedia(new double[]{3.3, 6.9, 7.9}));

        double calificacionMedia2 = calcularCalificacionMedia(new double[]{8.3, 6.9, 7.9, 6.9, 9.8});
        System.out.println(calificacionMedia2);

        //redondear la calificación media a 2 decimales

        long notaFinal = Math.round(calificacionMedia2); // invocar round() de una clase estatica Math predefinida en java.
        System.out.println(notaFinal);
        String notaFinalFormateada = String.format("%.2f", calificacionMedia);
        System.out.println("La nota final es: " + notaFinalFormateada);
        String notaFinalFormateada2 = String.format("%.2f", calificacionMedia2);
        System.out.println("La nota final es: " + notaFinalFormateada2);

        // o igual solo imprimir por consola sin guardar en una variable notaFinalFormateada2:
        System.out.println(String.format("La nota final es: %.2f ", calificacionMedia2));



    }

    private static double calcularCalificacionMedia(double[] calificaciones) {
        double sumatorio = 0;
        for (double calificacion : calificaciones) {
            sumatorio += calificacion;

        }
        return sumatorio / calificaciones.length;

    }


}
