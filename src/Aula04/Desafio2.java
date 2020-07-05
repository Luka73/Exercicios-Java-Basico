package Aula04;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        int count = 0;

        //Usando While
        int i = 1;
        while (i <= n) {
            if(n % i == 0) { //i é divisor de n
                count++;
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
