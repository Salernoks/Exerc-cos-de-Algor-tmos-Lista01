package exercíciosalgoritmos;
  import java.util.Scanner;
    public class Exercício06 {
       public static void main (String [] args){
          Scanner leitor = new Scanner(System.in);
          int A, B, C, a;
          System.out.println("Escreva três números inteiros para calcular: ");
          System.out.println("A) a área do triângulo retângulo que tem A por base e C por altura.");
          System.out.print("Digite a base do triâmgulo: ");
          A = leitor.nextInt();
          System.out.print("Digite a altura do triângulo: ");
          C = leitor.nextInt();
          a = (A * C) / 2;
          System.out.println(" A área do triângulo é "+a);
          int r, Aa;
          double pi, Aaa;
          System.out.println("B) a área do círculo de raio C. (PI = 3.14159)." );
            System.out.print("Digite o raio do circulo: ");
            r = leitor.nextInt();
            pi = 3.14159;
            Aa = (r * r);
            Aaa = pi * Aa;
            System.out.print("A área do círculo é "+Aaa);
    }
}
