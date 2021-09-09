package com.allancordeiro;

import java.io.IOException;
import java.util.Scanner;

public class Autonomia {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int km = leitor.nextInt();
        double combustivel = leitor.nextDouble();

        double media = km / combustivel;
        System.out.println(String.format("%.3f km/l", media));

    }
}
