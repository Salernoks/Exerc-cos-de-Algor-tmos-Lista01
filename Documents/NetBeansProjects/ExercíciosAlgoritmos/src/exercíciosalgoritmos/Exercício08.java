package exercíciosalgoritmos;
  import java.util.Scanner;
     public class Exercício08 {
        public static void main (String [] args){
          Scanner leitor = new Scanner(System.in);
          double n1, n2, n3, n4, m;
            System.out.println("Média aritmética");
            System.out.println("Digite um número: ");
            n1 = leitor.nextDouble();
            System.out.println("Digite outro número: ");
            n2 = leitor.nextDouble();
            System.out.println("Digite outro número: ");
            n3 = leitor.nextDouble();
            System.out.println("Digite outro número: ");
            n4 = leitor.nextDouble();
            m = (n1 + n2 + n3  +  n4) / 4;
            System.out.println("A média é "+m);
    }
}
