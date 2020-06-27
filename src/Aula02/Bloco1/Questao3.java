package Aula02.Bloco1;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base do retângulo: ");
        double b = sc.nextDouble();

        System.out.println("Digite a altura do retângulo: ");
        double a = sc.nextDouble();

        double A = a * b;

        System.out.println("A área deste retângulo é: " + A);
    }
}
