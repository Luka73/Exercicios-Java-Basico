package Aula02.Bloco2;

import java.util.Calendar;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH) + 1; //JANUARY is 0 [array]
        int year = cal.get(Calendar.YEAR);

        int idade = year - anoNascimento;

        if(idade >= 16) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Não pode votar");
        }

    }
}
