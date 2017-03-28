package exercíciosalgoritmos;

import java.util.Scanner;

public class Exercício05 {
    public static void main(String [] args){
        Scanner leitor = new Scanner (System.in);
        double l, l1, a;
          System.out.println("Área do quadrado.");
          System.out.print("Digite a base do quadrado: ");
          l = leitor.nextDouble();
          System.out.print("Digite a altura do quadrado: ");
          l1 = leitor.nextDouble();
          a = l * l1;
          System.out.println("A área do quadrado é: "+a);
    }
}
