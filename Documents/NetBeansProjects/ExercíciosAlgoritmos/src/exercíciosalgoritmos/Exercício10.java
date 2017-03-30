package exercíciosalgoritmos;
 import java.util.Scanner;
   public class Exercício10 {
     public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);
        String nome = "nome";
        double sf, tv, c, st;
         System.out.print("Digite o nome do funcionário: ");
         nome = leitor.nextLine();
         System.out.print("Digite o salário fixo do funcionário: ");
         sf = leitor.nextDouble();
         System.out.print("digite o total de vendas feitas no mês: ");
         tv = leitor.nextDouble();
         c = 15.0 / 100;
         st = sf * (c * sf);
         System.out.println("O total á receber, já com a comissão é "+st);
    }
}
