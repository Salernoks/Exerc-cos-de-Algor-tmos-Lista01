package exercíciosalgoritmos;
 import java.util.Scanner;
  public class Exercício09 {
    public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);
        float  n, ht, vh, s;
        System.out.print("digite o nº de cadastro do funcionário: ");
        n = leitor.nextFloat();
        System.out.print("digite as horas trabalhadas do funcionário: ");
        ht = leitor.nextFloat();
        System.out.print("Digite o valor que recebe por hora: ");
        vh = leitor.nextFloat();
        s = ht * vh;
        System.out.println("O salário do funcinário é "+s);
    }
}
