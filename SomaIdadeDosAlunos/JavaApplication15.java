package javaapplication15;

import java.util.Scanner;

public class JavaApplication15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i, idade, QtdAlunos;
        int soma = 0;

        System.out.println("Digite a quantidade de alunos da escola: ");
        QtdAlunos = entrada.nextInt();

        for (i = 1; i <= QtdAlunos; i = i + 1) {
            System.out.println("Digite a idade do " + i + "° aluno: ");
            idade = entrada.nextInt();
            soma = soma + idade;
        }
        System.out.println("A soma das idades dos" + QtdAlunos + "alunos é " + soma);
    }

}
