package questaomarcio;

import java.util.Scanner;

public class QuestaoMarcio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao, desejo;
        double H, Peso, IMC;
        double KmpH, mps;
        double Lado1, Lado2, Lado3;
        boolean Valido;
        double a1, q, n;
        double impressao;

        do {
            System.out.println("\nMenu\n\n");

            System.out.println("1 - Para calcular o IMC");
            System.out.println("2 - Para converter de Km/h para m/s");
            System.out.println("3 - Para verificar a existência do Triângulo");
            System.out.println("4 - Para imprimir a PG e o seu somatório");
            System.out.println("0 - Encerrar o Programa");

            System.out.println("Digite a opção de sua preferência: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu calcular o IMC!");
                    System.out.println("Digite a altura da pessoa!");
                    H = entrada.nextDouble();
                    System.out.println("Digite o peso da pessoa!");
                    Peso = entrada.nextDouble();
                    IMC = CalculoIMC(H, Peso);
                    System.out.println("O IMC da pessoa é " + IMC);
                    break;

                case 2:
                    System.out.println("Você escolheu converter de Km/h para m/s");
                    System.out.println("Digite a velocidade (em Km/h): ");
                    KmpH = entrada.nextDouble();
                    mps = ConversaoVelocidade(KmpH);
                    System.out.println(KmpH + "Km/h é equivalente a " + mps + "m/s");
                    break;

                case 3:
                    System.out.println("Você escolheu verificar a validação do triângulo");
                    System.out.println("Digite o valor dos lados do triângulo:");
                    Lado1 = entrada.nextDouble();
                    Lado2 = entrada.nextDouble();
                    Lado3 = entrada.nextDouble();
                    Valido = Validacao(Lado1, Lado2, Lado3);
                    if (Validacao(Lado1, Lado2, Lado3) == true) {
                        Valido = true;
                        System.out.println("O triângulo é existente!");
                    } else {
                        Valido = false;
                        System.out.println("O triângulo não existe!");
                    }
                    break;

                case 4:
                    System.out.println("Você escolheu imprimir a PG e seu somatório!");
                    System.out.println("Digite o valor inicial: ");
                    a1 = entrada.nextDouble();
                    System.out.println("Digite a Razão:");
                    q = entrada.nextDouble();
                    System.out.println("Digite a quantidade de termos: ");
                    n = entrada.nextDouble();
                    impressao = imprimirPG(a1, q, n);
                    System.out.println("O somatório foi " + impressao);

                    break;

                default:
                    System.out.println("Opção não disponível!!");
            }
            System.out.println("Deseja voltar ao Menu? (0 para encerrar)");
            desejo = entrada.nextInt();

        } while (desejo != 0);
        System.out.println("Programa encerrado!");

    }

    public static double CalculoIMC(double H, double Peso) {
        double IMC;
        IMC = Peso / (Math.pow(H, 2));
        return IMC;
    }

    public static double ConversaoVelocidade(double KmpH) {
        double mps;
        mps = KmpH / 3.6;
        return mps;
    }

    public static boolean Validacao(double a, double b, double c) {
        boolean valido;
        if ((Math.abs(b - c) < a && a < b + c) && (Math.abs(a - c) < b && b < a + c) && (Math.abs(a - b) < c && c < a + b)) {
            valido = true;
        } else {
            valido = false;
        }
        return valido;
    }

    public static double imprimirPG(double a1, double q, double n) {
        if (n == 0) {
            return 0;
        }
        System.out.println(a1);
        return a1 + imprimirPG(a1 * q, q, n - 1);
    }
}
