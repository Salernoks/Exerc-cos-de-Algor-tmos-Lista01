package exercíciosalgoritmos;

import java.util.Scanner;

public class Exercício03 {
    public static void main(String [] args){
        Scanner leitor = new Scanner (System.in);
        double n1, n2, a1, a2, r;
        System.out.println("Soma do quadrado de dois números.");
        System.out.print("Digite o 1º número: ");
        n1 = leitor.nextDouble();
        System.out.print("Digite o 2º número: ");
        n2 = leitor.nextDouble();
        a1 = (n1*n1);
        System.out.println("O 1º número ao quadrado é igual à: "+a1);
        a2 = (n2*n2);
        System.out.println("O 2º número ao quadrado é igual à: "+a2);
        r = a1+a2;
        System.out.println("O resultado da soma dos quadrados dos dois números é igual à: "+r);
        
        
        
        
            
        
    }
    
}
