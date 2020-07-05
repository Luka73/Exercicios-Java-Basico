package Aula04;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        int fatorial = 1;

        //Usando While
        int i = 1;
        while(i <= n) {
            fatorial = fatorial * i;
            //fatorial *= i;
            i++;
        }

        System.out.println("O fatorial de " + n + " é: " + fatorial);

        System.out.println("***********************");

        //Usando For
        fatorial = 1;
        for(int j = 1; j <= n; j++) {
            fatorial = fatorial * j;
        }

        System.out.println("O fatorial de " + n + " é: " + fatorial);
    }
}
