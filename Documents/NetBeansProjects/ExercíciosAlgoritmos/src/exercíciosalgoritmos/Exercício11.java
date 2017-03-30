package exercíciosalgoritmos;
 import java.util.Scanner;
   public class Exercício11 {
    public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);
        int n;
        System.out.print("Digite um número: ");
        n = leitor.nextInt();
        if (n<0){
            System.out.println("Número negativo.");
        }else{
            System.out.println("Número positivo.");
        }
    }
}
