package exercíciosalgoritmos;

import java.util.Scanner;

public class Exercício02 {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        double b,e,r;
        System.out.println("Potenciação de números no NetBeans.");
        System.out.print("Digite a base da potencia: ");
        b = leitor.nextDouble();
        System.out.print("Digite o expoente da potencia: ");
        e = leitor.nextDouble();
        r = Math.pow(b,e);
        System.out.println("Esse é o resulta da potencia: "+r);
        System.out.println("Fim.");
        
        
       
        
        
        
    }
    
}
