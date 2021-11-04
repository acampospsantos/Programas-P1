package javaapplication16;

import java.util.Scanner;

public class JavaApplication16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double SalAtual, SalNovo, Contrib;
        int Calculo;

        do {
            System.out.println("Digite seu Salário Atual: ");
            SalAtual = entrada.nextDouble();

            if (SalAtual <= 1000) {
                SalNovo = SalAtual + SalAtual * 0.01;
                Contrib = 0;

            } else if (SalAtual > 1000 && SalAtual <= 2000) {
                SalNovo = SalAtual + SalAtual * 0.08;
                Contrib = 20;

            } else if (SalAtual > 2000 && SalAtual <= 3000) {
                SalNovo = SalAtual + SalAtual * 0.05;
                Contrib = 30;

            } else if (SalAtual > 3000 && SalAtual <= 4000) {
                SalNovo = SalAtual + SalAtual * 0.02;
                Contrib = 10;

            } else {
                SalNovo = SalAtual + SalAtual * 0.12;
                Contrib = 180;
            }
            System.out.println("\nNovo salário será R$" + SalNovo + " e a contribuição R$" + Contrib);

            System.out.println("\nDeseja realizar outro cálculo? (0 para encerrar)");
            Calculo = entrada.nextInt();

        } while (Calculo != 0);
        System.out.println("Programa encerrado!!");

    }

}
