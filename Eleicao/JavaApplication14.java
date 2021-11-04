package javaapplication14;

import java.util.Scanner;

public class JavaApplication14 {

    public static int somaVotos(int a, int b, int c, int d, int e, int f) {
        int result;
        result = a + b + c + d + e + f;
        return result;
    }

    public static void contagem(int votoCand1, int votoCand2, int votoCand3, int votoCand4, int votoBranco, int votoNulo) {
        int totalDeVotos;
        System.out.println("--- CONTAGEM DOS VOTOS ---");
        System.out.println("Candidato 1: " + votoCand1 + " votos");
        System.out.println("Candidato 2: " + votoCand2 + " votos");
        System.out.println("Candidato 3: " + votoCand3 + " votos");
        System.out.println("Candidato 4: " + votoCand4 + " votos");
        System.out.println("Brancos: " + votoBranco + " votos");
        System.out.println("Nulos: " + votoNulo + " votos");
        totalDeVotos = somaVotos(votoCand1, votoCand2, votoCand3, votoCand4, votoBranco, votoNulo);
        System.out.println("TOTAL: " + totalDeVotos + " votos");
        System.out.println("-------------------------");
        vencedor(votoCand1, votoCand2, votoCand3, votoCand4, votoBranco, votoNulo);
    }

    public static void vencedor(int votoCand1, int votoCand2, int votoCand3, int votoCand4, int votoBranco, int votoNulo) {
        int winner = 0;
        String campeao = "";        
        if (winner < votoCand1) {
            winner = votoCand1;
            campeao = "Candidato 1";
        }    
        if (winner < votoCand2) {
            winner = votoCand2;
            campeao = "Candidato 2";
        }    
        if (winner < votoCand3) {
            winner = votoCand3;
            campeao = "Candidato 3";
        }    
        if (winner < votoCand4) {
            winner = votoCand4;
            campeao = "Candidato 4";
        }    
        if (winner < votoBranco) {
            winner = votoBranco;
            campeao = "Branco";
        }    
        if (winner < votoNulo) {
            winner = votoNulo;
            campeao = "Nulo";
        }
        if (winner == votoBranco || winner == votoNulo) {
            System.out.println("##NÃO HOUVE VENCEDORES##");
        } else {
            System.out.println("ELEITO: " + campeao);
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i, QtdEleitores, Voto;
        int votoCand1 = 0, votoCand2 = 0, votoCand3 = 0, votoCand4 = 0;
        int votoBranco = 0, votoNulo = 0;

        System.out.println("Informe o número de alunos eleitores: ");
        QtdEleitores = entrada.nextInt();

        if (QtdEleitores <= 0) {
            System.out.println("## NÃO HOUVE ELEITORES ##");

        } else {
            System.out.println("0 - Branco");
            System.out.println("1 - Candidato 1");
            System.out.println("2 - Candidato 2");
            System.out.println("3 - Candidato 3");
            System.out.println("4 - Candidato 4");
            System.out.println("5 - Nulo");
            for (i = 0; i < QtdEleitores; i = i + 1) {
                System.out.println("\nEleitor " + (i + 1) + "º, Digite seu voto: ");
                Voto = entrada.nextInt();

                while (Voto < 0 || Voto > 5) {
                    System.out.println("Voto Inválido!! Digite seu voto novamente!!");
                    Voto = entrada.nextInt();
                }

                if (Voto == 0) {
                    System.out.println("Voto foi computado como Branco");
                    votoBranco = votoBranco + 1;
                } else if (Voto == 1) {
                    System.out.println("Voto computado para o candidato 1");
                    votoCand1 = votoCand1 + 1;
                } else if (Voto == 2) {
                    System.out.println("Voto computado para o candidato 2");
                    votoCand2= votoCand2 + 1;
                } else if (Voto == 3) {
                    System.out.println("Voto computado para o candidato 3");
                    votoCand3 = votoCand3 + 1;
                } else if (Voto == 4) {
                    System.out.println("Voto computado para o candidato 4");
                    votoCand4 = votoCand4 + 1;
                } else {
                    System.out.println("Voto computado para Nulo");
                    votoNulo = votoNulo + 1;
                }
            }
            System.out.println("");
            System.out.println("##SISTEMA DE ELEIÇÃO ENCERRADO ##");
            System.out.println("Divulgação dos resultados: \n");

            //ESTATÍSTICA            
            contagem(votoCand1, votoCand2, votoCand3, votoCand4, votoBranco, votoNulo);
        }
    }
}
