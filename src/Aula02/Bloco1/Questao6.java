package Aula02.Bloco1;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double f = sc.nextDouble(); //Pega o valor em double que a pessoa digitou na tela

        double c = (f-32) * (5.0/9);

        System.out.printf("A temperatura em Celsius é: %.2f ", c);
    }
}
