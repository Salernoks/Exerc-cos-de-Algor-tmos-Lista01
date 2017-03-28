package exercíciosalgoritmos;

import java.util.Scanner;

public class Exercício03 {
    public static void main(String [] args){
        Scanner leitor = new Scanner (System.in);
        double n1, n2, sp, p1, p2;
            System.out.println("Soma dos quadrados de dois núemeros.");
            System.out.print("Digite o 1º número: ");
            n1 = leitor.nextDouble();
            System.out.print("Digite o 2º número: ");
            n2 = leitor.nextDouble();
            p1 = n1 * n1;
            p2 = n2 * n2;
            sp = p1 + p2;
            System.out.println("A soma dos quadrados dos números é: "+sp);
    }
}
