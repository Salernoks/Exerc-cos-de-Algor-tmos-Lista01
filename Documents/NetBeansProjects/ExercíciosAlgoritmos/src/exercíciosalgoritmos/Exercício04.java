package exercíciosalgoritmos;

import java.util.Scanner;

public class Exercício04 {
    public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);
        int n1, n2, c1, c2;
          System.out.println("Números Consecutivos.");
          System.out.print("Digite o 1º número: ");
          n1 = leitor.nextInt();
          System.out.print("Digite o 2º número: ");
          n2 = leitor.nextInt();
          c1 = n1 + 1;
          c2 = n2 + 1;
          System.out.println("Os números consecutivos dos que escolheu são: "+c1+" e "+c2);
    }
}
