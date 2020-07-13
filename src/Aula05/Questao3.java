package Aula05;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        String[] arr = new String[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro nome: ");
        arr[0] = sc.next();

        System.out.println("Digite o segundo nome: ");
        arr[1] = sc.next();

        System.out.println("Digite o terceiro nome: ");
        arr[2] = sc.next();

        System.out.println("Digite o nome a ser consultado: ");
        String nome  = sc.next();

        for(String s : arr) {
            if(s.equalsIgnoreCase(nome)) {
                System.out.println(nome + " pertence a lista de nomes.");
            }
        }
    }
}
