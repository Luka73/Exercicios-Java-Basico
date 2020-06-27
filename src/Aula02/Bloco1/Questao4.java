package Aula02.Bloco1;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.next();

        System.out.println("Digite a sua idade ");
        int idade = sc.nextInt();

        int anoDeNascimento = 2020 - idade;

        System.out.println(nome + " nasceu em " + anoDeNascimento);
    }
}
