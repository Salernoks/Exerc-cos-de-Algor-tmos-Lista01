package exercíciosalgoritmos;

import java.util.Scanner;

public class Exercício01 {
    public static void main(String[] args) {
        Scanner leitor =new Scanner(System.in);
        float n1, n2, r;
        System.out.println("Multiplicação de dois números no NetBeans.");
        System.out.print("Digite um número à ser multiplicado: ");
        n1 = leitor.nextFloat();
        System.out.print("Digite um outro número à ser multiplicado: ");
        n2 = leitor.nextFloat();
        r = (n1*n2);
        System.out.println("Esse é o resultado da multiplicação: "+r);
        System.out.println("Fim do Processo.");
    }
}
