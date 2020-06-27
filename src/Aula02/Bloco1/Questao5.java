package Aula02.Bloco1;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário atual: ");
        double salarioAtual = sc.nextDouble();

        System.out.println("Digite o percentual de reajuste: ");
        double percentual = sc.nextDouble();

        double novoSalario = salarioAtual * (1 + percentual/100);

        System.out.println("O novo salário é R$" + novoSalario);
    }
}
