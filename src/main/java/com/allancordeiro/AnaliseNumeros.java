package com.allancordeiro;

import java.io.IOException;
import java.util.Scanner;

public class AnaliseNumeros {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int numerosPares = 0;
        int numerosImpares = 0;
        int numerosPositivos = 0;
        int numerosNegativos = 0;

        for(int i = 0; i < 5; i++) {
            int numero = leitor.nextInt();
            // numeros pares
            if(numero % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }

            if(numero > 0) {
                numerosPositivos++;
            }
            else if (numero < 0) {
                numerosNegativos++;
            }
        }
        System.out.println(numerosPares + " valor(es) par(es)");
        System.out.println(numerosImpares + " valor(es) impar(es)");
        System.out.println(numerosPositivos + " valor(es) positivo(s)");
        System.out.println(numerosNegativos + " valor(es) negativo(s)");
    }
}
