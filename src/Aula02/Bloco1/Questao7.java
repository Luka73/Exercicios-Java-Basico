package Aula02.Bloco1;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de eleitores: ");
        int eleitores = sc.nextInt(); //100

        System.out.println("Digite o número de votos bracos: ");
        double votosBrancos = sc.nextDouble(); //10

        System.out.println("Digite o número de votos nulos: ");
        double votosNulos = sc.nextDouble(); //20

        System.out.println("Digite o número de votos válidos: ");
        double votosValidos = sc.nextDouble(); //70

        double totalDeVotos = votosBrancos + votosNulos + votosValidos;

        double percentualBrancos = (votosBrancos / totalDeVotos) * 100;
        double percentualNulos = (votosNulos / totalDeVotos) * 100;
        double percentualValidos = (votosValidos / totalDeVotos) * 100;

        System.out.println("Total de eleitores: " + eleitores);
        System.out.println("Votos brancos: " + percentualBrancos + "%");
        System.out.println("Votos nulos: " + percentualNulos + "%");
        System.out.println("Votos válidos: " + percentualValidos + "%");
    }
}
