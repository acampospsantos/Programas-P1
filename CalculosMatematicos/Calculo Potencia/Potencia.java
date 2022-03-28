package potencia;

import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int expoente;
        double base;
        double ValorFinal;

        System.out.println("Digite o valor da Base");
        base = entrada.nextDouble();
        System.out.println("Digite o valor do expoente");
        expoente = entrada.nextInt();

        ValorFinal = CalculoPotencia(expoente, base);
        System.out.println("Valor final = " + ValorFinal);
    }

    public static double CalculoPotencia(int expoente, double base) {
        int i;
        double Result = 1.0;
        if (expoente == 0) {
            return 1;
        }
        if (base == 0) {
            return 0;
        }
        if (expoente < 0) {
            base = 1 / base;
            expoente = -expoente;
        }
        for (i = 1; i <= expoente; i = i + 1) {
            Result = Result * base;
        }
        return Result;
    }

    public static double PotenciaRecursiva(double base, int expoente) {
        if (expoente == 0) {
            return 1;
        } else if (expoente < 0) {
            return (1 / base * PotenciaRecursiva(base, -expoente));
        } else {
            return base * PotenciaRecursiva(base, expoente - 1);
        }
    }

}
