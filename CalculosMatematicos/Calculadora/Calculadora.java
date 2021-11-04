package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static double somatorio(double a, double b) {
        double resultado;
        resultado = a + b;
        return resultado;
    }

    public static double subtrario(double a, double b) {
        double resultado;
        resultado = a - (b);
        return resultado;
    }

    public static double divisorio(double a, double b) {
        double resultado;
        resultado = a / b;
        return resultado;
    }

    public static double multiplicador(double a, double b) {
        double resultado;
        resultado = a * b;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int choice;
        double calculo, resultado = 0;
        double a, b;

        System.out.print("Digite o valor: ");
        a = entrada.nextDouble();
        System.out.println("");
        //MENU
        do {
            System.out.println("+ 1");//1 - Adição
            System.out.println("- 2");//2 - Subtração
            System.out.println("x 3");//3 - Multiplicação
            System.out.println("÷ 4");//4 - Divisão
            System.out.print("Operação Desejada: ");
            choice = entrada.nextInt();

            switch (choice) {
                case 1:
                    b = entrada.nextDouble();
                    calculo = somatorio(a, b);
                    resultado = calculo;
                    break;
                case 2:
                    b = entrada.nextDouble();
                    calculo = subtrario(a, b);
                    resultado = calculo;
                    break;
                case 3:
                	b = entrada.nextDouble();
                    calculo = multiplicador(a, b);
                    resultado = calculo;
                    break;
                case 4:                   
                    b = entrada.nextDouble();
                    calculo = divisorio(a, b);
                    resultado = calculo;
                    break;
            }
            System.out.println("= " + resultado);
            System.out.println();
            a = resultado;

        } while (choice > 0 || choice < 5);
    }
}
