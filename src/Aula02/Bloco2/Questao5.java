package Aula02.Bloco2;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double horasExtra = 0;
        double valorDasHorasExtra= 0;

        System.out.println("Digite o número de horas trabalhadas neste mês:  ");
        double horasTrabalhadas = sc.nextDouble();

        System.out.println("Digite o valor da hora de trabalho: ");
        double valorDaHora = sc.nextDouble();

        if(horasTrabalhadas > 160) {
            horasExtra = horasTrabalhadas - 160;
            valorDasHorasExtra = (valorDaHora * 0.50) * horasExtra;
        }

        double salario = horasTrabalhadas * valorDaHora + valorDasHorasExtra;
        System.out.println("Salário: " + salario);
    }
}
