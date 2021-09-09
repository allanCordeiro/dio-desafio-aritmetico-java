package com.allancordeiro;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContagemCedulas {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int dinheiro = leitor.nextInt();
        List<Cedulas> notas = new ArrayList<Cedulas>();
        System.out.println(dinheiro);
        notas.add(new Cedulas(dinheiro, 100));
        dinheiro -= notas.get(0).getValorTotal();
        notas.add(new Cedulas(dinheiro, 50));
        dinheiro -= notas.get(1).getValorTotal();
        notas.add(new Cedulas(dinheiro, 20));
        dinheiro -= notas.get(2).getValorTotal();
        notas.add(new Cedulas(dinheiro, 10));
        dinheiro -= notas.get(3).getValorTotal();
        notas.add(new Cedulas(dinheiro, 5));
        dinheiro -= notas.get(4).getValorTotal();
        notas.add(new Cedulas(dinheiro, 2));
        dinheiro -= notas.get(5).getValorTotal();
        notas.add(new Cedulas(dinheiro, 1));

        for (Cedulas nota: notas) {
            System.out.println(nota);
        }

    }
}

class Cedulas {

    private final int valorTotal;
    private final int cedula;
    private final int totalCedulas;

    public Cedulas(int valorTotal, int cedula) {
        this.cedula = cedula;
        this.totalCedulas = valorTotal/ this.cedula;
        this.valorTotal = this.totalCedulas * this.cedula;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {
        return totalCedulas + " nota(s) de R$ " + cedula + ",00";
    }
}
