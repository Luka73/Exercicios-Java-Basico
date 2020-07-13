package Aula05;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        double[] arr = new double[5];
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + ": ");
            arr[i] = sc.nextDouble();
            sum = sum + arr[i];
        }

        double media = sum / 5;
        int acimaDaMedia = 0;

        for(double d : arr) {
            if(d > media) {
                acimaDaMedia++;
            }
        }

        System.out.println("Média da turma: " + media);
        System.out.println("Alunos acima da média: " + acimaDaMedia);
    }
}
