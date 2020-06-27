package Aula02.Bloco2;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Você é estudante? [S/N] ");
        boolean estudante = sc.next().equalsIgnoreCase("s");

        if((idade < 21 || idade > 65) || estudante) {
            System.out.println("Paga meia-entrada");
        } else { //false
            System.out.println("Paga entrada inteira");
        }

    }
}
