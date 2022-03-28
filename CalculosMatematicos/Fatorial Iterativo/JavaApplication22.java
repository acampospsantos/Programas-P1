package javaapplication22;

import java.util.Scanner;

public class JavaApplication22 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        int Resultado;

        System.out.println("Digite o valor de n");
        n = entrada.nextInt();

        Resultado = (int) FatorialInterativo(n);
        System.out.println("O valor final é " + Resultado);
    }

    public static double FatorialInterativo(int n) {
        int i;
        int result = 1;
        for (i = 1; i <= n; i = i + 1) {
            result = result * i;
        }
        return result;
    }

}
