package Aula04;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        //Usando While
        int i = 1;
        while(i <= n) {
            System.out.println(i);
            i++;
        }

        System.out.println("***********************");

        //Usando For
        for(int j = 1; j <= n; j++) {
            System.out.println(j);
        }
    }
}
