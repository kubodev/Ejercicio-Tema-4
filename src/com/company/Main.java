package com.company;

public class Main {

    public static void main(String[] args) {
        int numeroIf = -20;

        if (numeroIf == 0) {
            System.out.println("El número es 0");
        } else if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);



        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        String estacion = "verano";

        switch (estacion) {
            case "verano":
                System.out.println("es verano");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            case "invierno":
                System.out.println("es inverno");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            default:
                System.out.println(estacion);
        }

    }
}
