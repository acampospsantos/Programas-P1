package calculop.g;

import java.util.Scanner;

public class CalculoPG {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double a, a1, q;
        int n;
        
        System.out.println("Digite o Valor Inicial(a1): ");
        a1 = entrada.nextDouble();
        
        System.out.println("Digite o Valor da Razão(q): ");
        q = entrada.nextDouble();
        
        System.out.println("Digite o valor de n: ");
        n = entrada.nextInt();
        
        //FÓRMULA: an  = a1 * q^(n-1)
        a = a1 * Math.pow(q, n - 1);
        System.out.println("an = " + a);               
    }   
}
