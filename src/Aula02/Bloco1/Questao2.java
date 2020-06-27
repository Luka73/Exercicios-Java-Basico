package Aula02.Bloco1;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        int antecessor = n - 1;

        System.out.println("O antecessor de " + n + " é: " + antecessor);
    }
}
