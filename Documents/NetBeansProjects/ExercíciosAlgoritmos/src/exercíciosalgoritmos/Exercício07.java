package exercíciosalgoritmos;
  import java.util.Scanner;
    public class Exercício07 {
      public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);
        double b, a, h1, h2, r;
          System.out.print("Digite a base do triângulo: ");
          b = leitor.nextDouble();
          System.out.print("Digite a altura do triangulo: ");
          a = leitor.nextDouble();
          h1 = (a * a);
          h2 = (b * b);
          r = Math.sqrt(h1 + h2);
          System.out.println("A hipotenusa do triângulo é "+r);
    }
}
