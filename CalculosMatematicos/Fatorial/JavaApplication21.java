package javaapplication21;

import java.util.Scanner;

public class JavaApplication21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        int FatorialF;

        System.out.println("Digite o valor de n");
        n = entrada.nextInt();

        FatorialF = (int) fatorial(n);
        System.out.println(FatorialF);
    }

    public static double fatorial(double n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
}
