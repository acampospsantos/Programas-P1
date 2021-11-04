package calculopg.pkg2;

import java.util.Scanner;

public class CalculoPG2 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double a1, q, n, Sn;        
        
        System.out.println("Digite o Valor Inicial(a1): ");
        a1 = entrada.nextDouble();
        
        System.out.println("Digite o Valor da Razão(q): ");
        q = entrada.nextDouble();
        
        System.out.println("Digite o Valor de n: ");
        n = entrada.nextDouble();
        
        //SOMA DE UMA PG FINITA
        //FÓRMULA: Sn = ( a1 * ((q^n)-1)) / (q - 1)        
       Sn = (a1 * (Math.pow(q,n) -1)) / (q-1);
       System.out.println("Sn = " + Sn);
    }    
}
