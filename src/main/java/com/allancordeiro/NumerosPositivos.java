package com.allancordeiro;

import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contadorPositivos = 0;
        for(int i = 0; i < 6; i++) {
            double numero = leitor.nextDouble();
            if(numero > 0) {
                contadorPositivos++;
            }
        }
        System.out.println(contadorPositivos + " valores positivos");
    }
}
