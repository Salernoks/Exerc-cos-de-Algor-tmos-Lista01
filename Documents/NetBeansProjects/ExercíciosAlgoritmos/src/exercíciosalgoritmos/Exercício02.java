package exercíciosalgoritmos;

import java.util.Scanner;

public class Exercício02 {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        double n1, n2, r;
        System.out.println("Cálculo de potência.");
        System.out.print("Digite a base da potência: ");
        n1 = leitor.nextDouble();
        System.out.print("Digite o expoente da potência: ");
        n2 = leitor.nextDouble();
        r = Math.pow(n1, n2);
        System.out.println("Sua resposta é: "+ r);
    }
}
