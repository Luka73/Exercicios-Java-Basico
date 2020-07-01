package Aula03;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu dia de nascimento: ");
        int dia = sc.nextInt();

        System.out.println("Digite seu mês de nascimento: ");
        int mes = sc.nextInt();
        String signo = "";

        switch(mes)
        {
            case 1:
                signo = (dia <= 20) ? "Capricórnio" : "Áquario";
                break;
            case 2:
                signo = (dia <= 19) ? "Aquário" : "Peixes";
                break;
            case 3:
                signo = (dia <= 20) ? "Peixes" : "Áries";
                break;
            case 4:
                signo = (dia <= 20) ? "Áries" : "Touro";
                break;
            case 5:
                signo = (dia <= 20) ? "Touro" : "Gêmeos";
                break;
            case 6:
                signo = (dia <= 20) ? "Gêmeos" : "Câncer";
                break;
            case 7:
                signo = (dia <= 21) ? "Câncer" : "Leão";
                break;
            case 8:
                signo = (dia <= 22) ? "Leão" : "Virgem";
                break;
            case 9:
                signo = (dia <= 22) ? "Virgem" : "Libra";
                break;
            case 10:
                signo = (dia <= 22) ? "Libra" : "Escorpião";
                break;
            case 11:
                signo = (dia <= 21) ? "Escorpião" : "Sagitário";
                break;
            case 12:
                signo = (dia <= 21) ? "Sagitário" : "Capricórnio";
                break;
            default:
                System.out.println("Mês inválido");
                break;
        }

        System.out.println("Seu signo é: " + signo);
    }
}
