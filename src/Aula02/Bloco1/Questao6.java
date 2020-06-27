package Aula02.Bloco1;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double f = sc.nextDouble();

        double c = (f-32) * (5.0/9);

        System.out.println("A temperatura em Celsius é: " + c);
    }
}
