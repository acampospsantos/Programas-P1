package javaapplication23;

import java.util.Scanner;

public class JavaApplication23 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        double ValorFinal;

        System.out.println("Digite o valor de n: ");
        n = entrada.nextInt();

        ValorFinal = (int) Somatorio(n);
        System.out.println(ValorFinal);
    }

    public static double Somatorio(int n) {
        if (n == 0) {
            return 0;
        } else {
            System.out.println(n);
            return n + Somatorio(n - 1);
        }
    }
}
