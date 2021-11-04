package javaapplication28;

import java.util.Scanner;

public class JavaApplication28 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i, j, k;

        System.out.println("Digite o valor inicial: ");
        i = entrada.nextInt();
        while (i < 1) {
            System.out.println("Digite o valor inicial novamente!");
        }
        System.out.println("Digite o valor relativo final: ");
        j = entrada.nextInt();
        while (j < 1) {
            System.out.println("Digite o valor relativo final novamente!");
        }
        System.out.println("Digite o valor da incrementação: ");
        k = entrada.nextInt();
        while (k < 1) {
            System.out.println("Digite o valor do incremento novamente!");
        }

        imprimeSerieInversa(i, j, k);
    }

    public static void imprimeSerieInversa(int i, int j, int k) {
        if (i < j) {
            System.out.println(i);
            imprimeSerieInversa(i + k, j, k);
        }
    }
}
