package Aula04;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número entre 3 e 20: "); //5
        int n = sc.nextInt(); //5
        // 1, 1, 2, 3, 5

        if(n >= 3 && n <= 20) {
            int t1 = 1;
            int t2 = 1;
            int t3;

            //Usando While
            System.out.print(t1 + ", ");
            System.out.print(t2 + ", ");
            //1, 1, 2, 3, 5

            int i = 3;
            while(i <= n) {
                t3 = t1 + t2;
                System.out.print(t3);
                if(i != n) System.out.print(", ");
                t1 = t2;
                t2 = t3;
                i++;
            }

            System.out.println();
            System.out.println("***********************");

            t1 = t2 = 1;
            System.out.print(t1 + ", ");
            System.out.print(t2 + ", ");
            //Usando For
            for(int j = 3; j <= n; j++) {
                t3 = t1 + t2;
                System.out.print(t3);
                if(j != n) System.out.print(", ");
                t1 = t2;
                t2 = t3;
            }

        } else {
            System.out.println("Número inválido.");
        }
    }
}
