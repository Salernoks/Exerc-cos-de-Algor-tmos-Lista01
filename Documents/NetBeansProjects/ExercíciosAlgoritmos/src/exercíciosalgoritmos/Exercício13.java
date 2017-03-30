package exercíciosalgoritmos;
 import java.util.Scanner;
   public class Exercício13 {
     public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);
        double n1, n2, n3;
         System.out.print("digite um número: ");
         n1 = leitor.nextDouble();
         System.out.print("digite um número: ");
         n2 = leitor.nextDouble();
         System.out.print("digite um número: ");
         n3 = leitor.nextDouble();
         if(n1<n2){
             System.out.println("O maior é o número: "+n2);
         }if (n1>n2){
             System.out.println("O maior é o número: "+n1);
         }else {
             System.out.println("O maior é o número: "+n3);
         }
    }
}
