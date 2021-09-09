package com.allancordeiro;

import java.io.IOException;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        for(int i = 2; i <= numero; i += 2) {
            System.out.println(i);
        }
    }
}
