package Aula04;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt(); // 8
        int count = 0;

        //Número primo --> dois divisores
        //div(8) = {1, 2, 4, 8} --> 4 divisores
        //div(15) = {1, 3, 5, 15} --> 5 divisores
        //div(7) = {1, 7} --> 2 divores (é primo)
        //div(2) = {1, 2} --> 2 divisores (é primo)

        //Acumulador que conta quantos divisores um número tem.
        //Se o acumulador no final for igual a 2, o número é primo.
        //Não existe divisão por zero!
        // 8 / 4 = 2
        // 8 % 4 --> resto zero!!

        //Usando While
        int i = 1;
        while (i <= n) {
            if(n % i == 0) { //8 % 4 == 0 --> sim!
                count++; // 3
            }
            i++;
        }

        if(count == 2) {
            System.out.println(n + " é primo");
        } else {
            System.out.println(n + " não é primo");
        }

        //Usando For
        count = 0;
        for(int j = 1; j <= n; j++) {
            if(n % j == 0) {
                count++;
            }
        }

        String msg = (count == 2) ? " é primo" : " não é primo";
        System.out.println(n + msg);
    }
}
