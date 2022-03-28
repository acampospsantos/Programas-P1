package javaapplication11;

import java.util.Scanner;

public class JavaApplication11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Option;
        double AQ, AT, AC;
        double Lquadrado, BaseTriangulo, HTriangulo, RaioC, π = 3.14;

        System.out.println("Digite 1 - Se quiser calcular a área do Quadrado");
        System.out.println("Digite 2 - Se quiser calcular a área do Triângulo");
        System.out.println("Digite 3 - Se quiser calcular a área do Círculo");
        System.out.println("Digite 4 - Se quiser encerrar o programa");

        System.out.println("Digite a Opção: ");
        Option = entrada.nextInt();

        while (Option < 1 || Option > 4) {
            System.out.println("Opção Incorreta!! Digite novamente: ");
            Option = entrada.nextInt();
        }

        if (Option == 1) {
            System.out.println("Você escolheu calcular a área do quadrado!");
            System.out.println("Digite o valor dos Lados(em metros): ");
            Lquadrado = entrada.nextDouble();
            AQ = Lquadrado * Lquadrado;
            System.out.println("A Área do Quadrado foi de " + AQ + " M²");

        } else if (Option == 2) {
            System.out.println("Você escolheu calcular a área do Triângulo!");
            System.out.println("Digite o valor da Base(em metros): ");
            BaseTriangulo = entrada.nextDouble();
            System.out.println("Digite o valor da Altura(em metros): ");
            HTriangulo = entrada.nextDouble();
            AT = (BaseTriangulo * HTriangulo) / 2;
            System.out.println("A Área do Triângulo foi de " + AT + " M²");

        } else if (Option == 3) {
            System.out.println("Você escolheu calcular a área do Círculo!");
            System.out.println("Digite o valor do Raio(em metros): ");
            RaioC = entrada.nextDouble();
            AC = π * (RaioC * RaioC);
            System.out.println("A Área do Círculo foi de " + AC + " M²");

        } else {
            System.out.println("Você desejou encerrar o programa!!");
            System.out.println("## FIM ## ");
        }
    }
}
