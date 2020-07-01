package Aula03;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.println("Escolha uma operação: ( + - * / ) ");
        String operacao = sc.next();

        switch(operacao)
        {
            case "+":
                System.out.println("Soma: " + (n1 + n2));
                break;
            case "-":
                System.out.println("Subtração: " + (n1 - n2));
                break;
            case "*":
                System.out.println("Multiplicação: " + (n1 * n2));
                break;
            case "/":
                if(n2 != 0)
                    System.out.println("Divisão: " + (n1 / n2));
                else
                    System.out.println("Não é possível efetuar divisão por zero.");
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
    }
}
