package exercíciosalgoritmos;
import java.util.Scanner;
public class Exercício14 {
    public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);
        double n2, n1, d, r;
        System.out.print("Digite um número: ");
        n1 = leitor.nextDouble();
        System.out.print("digite outro número: ");
        n2 = leitor.nextDouble();
        if (n1>n2){
            d = n1 / n2;
            System.out.println("A divisão do maior número pelo meno é: "+d);
        }else {
            d = n2 / n1;
            System.out.println("A divisão do maior número pelo menor é: "+d);
        }
    }
}
