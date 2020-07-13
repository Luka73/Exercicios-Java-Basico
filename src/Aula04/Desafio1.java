package Aula04;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: "); //6
        int n = sc.nextInt();
        int fatorial = 1;
        //6! = 6 x 5 x 4 x 3 x 2 x 1 = 720
        //elemento neutro da multiplicação é 1 (4 * 1 = 4)
        //elemento neutro da adição 0 (4 + 0 = 4)



        int x = 1; //contador
        int soma = 0; //acumulador (elemento neutro)
        while(x <= 10) { // 1 + 2 + 3 + ...+ 9 + 10
            soma = soma + x;
            //soma += x;
            x++;
        }

        int y = 1; //contador
        while(y <= 10) { // 1 3 5 7 9
            System.out.println(y);
            y = y + 2;
        }

        System.out.println("A soma dos elementos é: " + soma);


        //Usando While
        int i = 1;
        while(i <= n) { // 1 * 2 * 3 * 4 * 5 * 6
            fatorial = fatorial * i; //acumular
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
