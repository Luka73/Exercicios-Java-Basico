package Aula02.Bloco2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de maçãs: ");
        int macas = sc.nextInt();
        double preco = 0;

        if(macas >= 12) {
            preco = 1.00;
        } else {
            preco = 1.30;
        }

        double valorFinal = preco * macas;
        System.out.println("O valor a pagar é R$" + valorFinal);
    }
}
