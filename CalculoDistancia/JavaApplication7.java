package javaapplication7;

import java.util.Scanner;

public class JavaApplication7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double distKm, distM, vMedia, vMediaF;
        int h, min, seg, tGasto;
        int escolha1, escolha2;

        System.out.println("Deseja calcular a velocidade média em Km/h ou m/s ?");
        System.out.println("1 - Para calcular a velocidade em Km/h");
        System.out.println("2 - Para calcular a velocidade em m/s");
        escolha1 = entrada.nextInt();
        //Tratamento da escolha do Usuario
        while (escolha1 != 1 && escolha1 != 2) {
            System.out.println("Opção inválida! Digite novamente!");
            escolha1 = entrada.nextInt();
        }

        if (escolha1 == 1) { //Distancia em Km/h
            System.out.println("Digite a Distância percorrida (em Km): ");
            distKm = entrada.nextDouble();
            System.out.println("Digite a qtd de horas gastas: ");
            h = entrada.nextInt();
            System.out.println("Digite a qtd de minutos gastos: ");
            min = entrada.nextInt();
            System.out.println("Digite a qtd de segundos gastos; ");
            seg = entrada.nextInt();

            tGasto = h + (min / 60) + (seg / 3600);
            vMedia = distKm / tGasto;
            System.out.println("Velocidade média no percurso = " + vMedia + "Km/h");

            System.out.println("Deseja converter de Km/h para m/s ? (1 - p/ converter) ");
            escolha2 = entrada.nextInt();
            if (escolha2 == 1) {
                vMediaF = vMedia * 3.6;
                System.out.println(vMedia + "Km/h = " + vMediaF + "m/s");
            } else {
                System.out.println("##PROGRAMA FINALIZADO##");
            }

        } else if (escolha1 == 2) { //Distancia em m/s
            System.out.println("Digite a Distância percorrida (em metros): ");
            distM = entrada.nextDouble();
            System.out.println("Digite a qtd de horas gastas: ");
            h = entrada.nextInt();
            System.out.println("Digite a qtd de minutos gastos: ");
            min = entrada.nextInt();
            System.out.println("Digite a qtd de segundos gastos; ");
            seg = entrada.nextInt();

            tGasto = (h * 3600) + (min * 60) + seg;
            vMedia = distM / tGasto;
            System.out.println("Velocidade média no percurso = " + vMedia + "m/s");

            System.out.println("Deseja converter de m/s para Km/h ? (1 - p/ converter) ");
            escolha2 = entrada.nextInt();
            if (escolha2 == 1) {
                vMediaF = vMedia / 3.6;
                System.out.println(vMedia + "m/s = " + vMediaF + "Km/h");
            } else {
                System.out.println("##PROGRAMA FINALIZADO##");
            }
        }
    }
}
