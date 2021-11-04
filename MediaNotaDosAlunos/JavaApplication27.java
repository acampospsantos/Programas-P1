package javaapplication27;

import java.util.Scanner;

public class JavaApplication27 {

    public static double CalculoMedia(double nota1, double nota2) {
        double media;
        media = (nota1 + nota2) / 2;
        return media;
    }

    public static void Conceito(double media) {
        if (media >= 0 && media < 5) {
            System.out.println("Conceito = D");
        } else if (media >= 5 && media < 7) {
            System.out.println("Conceito = C");
        } else if (media >= 7 && media < 9) {
            System.out.println("Conceito = B");
        } else {
            System.out.println("Conceito = A");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i;
        double nota1, nota2;
        double media;

        for (i = 1; i <= 60; i = i + 1) {
            System.out.println(i + "º aluno: digite sua 1º e 2º nota, respectivamente: ");
            nota1 = entrada.nextDouble();
            while (nota1 < 0 || nota1 > 10) {
                System.out.println("Nota inválida! Digite novamente:");
                nota1 = entrada.nextDouble();
            }
            nota2 = entrada.nextDouble();
            while (nota2 < 0 || nota2 > 10) {
                System.out.println("Nota inválida! Digite novamente: ");
                nota2 = entrada.nextDouble();
            }
            media = CalculoMedia(nota1, nota2);
            System.out.println("A média do " + i + "º aluno foi " + media);
            Conceito(media);
            System.out.println("");
        }
    }
}
