package javaapplication29;

import java.util.Scanner;

public class JavaApplication29 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i;
        int NumContas = 0;
        int NumPrimo;
        double Result;
        int Question;

        do {
            System.out.println("Digite o número que deseja verificar: ");
            NumPrimo = entrada.nextInt();

            for (i = 2; i <= NumPrimo; i = i + 1) {
                NumContas = NumContas + 1;
                Result = NumPrimo / i;
                System.out.println(NumContas + "º Conta: " + Result);
            }

            System.out.println("Deseja repetir? (1 -- para encerrar)");
            Question = entrada.nextInt();

        } while (Question != 1);
        System.out.println("##PROGRAMA ENCERRADO ##");
    }
}
