package Explicacoes;

import java.util.Scanner;

public class ScannerECondicional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");
        String nome = scan.next(); // Ler o nome que a pessoa escreveu na tela
        System.out.println("Qual o seu sobrenome? ");
        String sobrenome = scan.next(); // Ler o sobrenome que a pessoa escreveu na tela
        System.out.println("Seu nome é: " + nome + " " + sobrenome);

        System.out.println("Qual a sua idade? ");
        int idade = scan.nextInt(); // Ler a idade que a pessoa escreveu na tela
        System.out.println("A sua idade é: " + idade);

        System.out.println("Qual o seu salário? ");
        double salario = scan.nextDouble();
        System.out.println("O seu salário é: " + salario);

        //boolean condicao = idade > 40; // true

        // =  --> recebe
        // == --> igual
        // != --> diferente

        double desconto = 0;

        if(idade >= 40) { // boolean --> true
            desconto = 30; // pertence ao escopo if
            desconto = 60;
            desconto = 80;
        } else {
            desconto = 20;
        }

        //if ternário --> 2 opções de valores
        salario = (idade >= 40) ? 3000 : 2000;
        // ? --> então
        // : --> senão
    }
}
