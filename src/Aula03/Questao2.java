package Aula03;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um combustível: ");
        System.out.println("A - Álcool");
        System.out.println("G - Gasolina");
        String combustivel = sc.next();

        System.out.println("Quantos litros você deseja? ");
        double litros = sc.nextDouble();
        double desconto = 0;
        double preco = 0;

        switch(combustivel.toUpperCase())
        {
            case "A":
                desconto = (litros > 20) ? 0.05 : 0.03;
                preco = 2.90 * litros;
                break;
            case "G":
                desconto = (litros > 20) ? 0.06 : 0.04;
                preco = 3.30 * litros;
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        double precoFinal = preco * (1 - desconto);
        System.out.println("Valor a pagar: " + precoFinal);
    }
}
