package javaapplication34;

import java.util.Scanner;

public class JavaApplication34 {

    public static boolean Validacao(int DiaNasc, int MesNasc, int AnoNasc, int DiaAtual, int MesAtual, int AnoAtual) {
        boolean valido;
        if ((AnoNasc < AnoAtual) || (AnoNasc == AnoAtual && MesNasc < MesAtual) || (AnoNasc == AnoAtual && MesNasc == MesAtual && DiaNasc < DiaAtual)) {
            valido = true;
        } else {
            valido = false;
        }
        return valido;
    }

    public static int CalculoIdade(int DiaNasc, int MesNasc, int AnoNasc, int DiaAtual, int MesAtual, int AnoAtual) {
        int calculo1, calculo2, idade;
        calculo1 = (AnoNasc * 10000 + MesNasc * 100 + DiaNasc);
        calculo2 = (AnoAtual * 10000 + MesAtual * 100 + DiaAtual);
        idade = (calculo2 - calculo1) / 10000;
        return idade;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int DiaAtual = 1, MesAtual = 12, AnoAtual = 2021;
        int DiaNasc, MesNasc, AnoNasc;
        int QtdDiasPMes;
        int i;
        int Idade;
        boolean Valido;

        System.out.println("Digite o Ano em que você nasceu: ");
        AnoNasc = entrada.nextInt();
        while (AnoNasc < 1919 || AnoNasc > 2021) {
            System.out.println("Ano Inválido! Digite novamente: ");
            AnoNasc = entrada.nextInt();
        }
        //ANO BISSEXTO
        if (AnoNasc % 4 == 0 && AnoNasc % 100 != 0) {

            System.out.println("Digite o Mês em que você nasceu: ");
            MesNasc = entrada.nextInt();
            while (MesNasc < 1 || MesNasc > 12) {
                System.out.println("Mês Inválido! Digite novamente: ");
                MesNasc = entrada.nextInt();
            }
            if (MesNasc == 1 || MesNasc == 3 || MesNasc == 5 || MesNasc == 7 || MesNasc == 8 || MesNasc == 10 || MesNasc == 12) {
                QtdDiasPMes = 31;
                System.out.println("Digite o Dia em que você nasceu: ");
                DiaNasc = entrada.nextInt();
                while (DiaNasc < 1 || DiaNasc > 31) {
                    System.out.println("Dia Inválido! Digite novamente: ");
                    DiaNasc = entrada.nextInt();
                }
            } else {
                QtdDiasPMes = 30;
                System.out.println("Digite o Dia em que você nasceu: ");
                DiaNasc = entrada.nextInt();
                while (DiaNasc < 1 || DiaNasc > 30) {
                    System.out.println("Dia Inválido! Digite novamente: ");
                    DiaNasc = entrada.nextInt();
                }
            }
            Valido = Validacao(DiaNasc, MesNasc, AnoNasc, DiaAtual, MesAtual, AnoAtual);
            if (Validacao(DiaNasc, MesNasc, AnoNasc, DiaAtual, MesAtual, AnoAtual) == true) {
                Valido = true;
                System.out.println("PROSSIGA\n");
                System.out.println("Dia de Nascimento: " + DiaNasc + "/" + MesNasc + "/" + AnoNasc);
                System.out.println("Dia Atual: " + DiaAtual + "/" + MesAtual + "/" + AnoNasc);
                Idade = CalculoIdade(DiaNasc, MesNasc, AnoNasc, DiaAtual, MesAtual, AnoAtual);
                System.out.println("A idade do usuário é: " + Idade);
            } else {
                System.out.println("PAROU");
            }

            //Ano NÃO BISSEXTO
        } else {

            System.out.println("Digite o mês que você nasceu: ");
            MesNasc = entrada.nextInt();
            while (MesNasc < 1 || MesNasc > 12) {
                System.out.println("Mês Inválido! Digite novamente: ");
                MesNasc = entrada.nextInt();
            }
            if (MesNasc == 1 || MesNasc == 3 || MesNasc == 5 || MesNasc == 7 || MesNasc == 8 || MesNasc == 10 || MesNasc == 12) {
                QtdDiasPMes = 31;
                System.out.println("Digite o Dia em que você nasceu: ");
                DiaNasc = entrada.nextInt();
                while (DiaNasc < 1 || DiaNasc > 31) {
                    System.out.println("Dia Inválido! Digite novamente: ");
                    DiaNasc = entrada.nextInt();
                }
            } else if (MesNasc == 2) {
                QtdDiasPMes = 28;
                System.out.println("Digite o Dia em que você nasceu: ");
                DiaNasc = entrada.nextInt();
                while (DiaNasc < 1 || DiaNasc > 28) {
                    System.out.println("Dia Inválido! Digite novamente: ");
                    DiaNasc = entrada.nextInt();
                }
            } else {
                QtdDiasPMes = 30;
                System.out.println("Digite o Dia em que você nasceu: ");
                DiaNasc = entrada.nextInt();
                while (DiaNasc < 1 || DiaNasc > 30) {
                    System.out.println("Dia Inválido! Digite novamente: ");
                    DiaNasc = entrada.nextInt();
                }
            }
            Valido = Validacao(DiaNasc, MesNasc, AnoNasc, DiaAtual, MesAtual, AnoAtual);
            if (Validacao(DiaNasc, MesNasc, AnoNasc, DiaAtual, MesAtual, AnoAtual) == true) {
                Valido = true;
                System.out.println("PROSSIGA\n");
                System.out.println("Dia de Nascimento: " + DiaNasc + "/" + MesNasc + "/" + AnoNasc);
                System.out.println("Dia Atual: " + DiaAtual + "/" + MesAtual + "/" + AnoNasc);
                Idade = CalculoIdade(DiaNasc, MesNasc, AnoNasc, DiaAtual, MesAtual, AnoAtual);
                System.out.println("A idade do usuário é: " + Idade);
            } else {
                System.out.println("PAROU!!");
            }

        }

    }
}
