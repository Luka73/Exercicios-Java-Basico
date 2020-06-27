package Aula02.Bloco2;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        if(n > 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }
    }
}
