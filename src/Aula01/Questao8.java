package Aula01;

public class Questao8 {
    public static void main(String[] args) {
        double distanciaEmMilhas = 15 / 1.6;
        double tempoEmMinutos = 50 + (30 / 60);
        double tempoEmHoras= tempoEmMinutos / 60;

        double velocidadeMediaEmMilhas = distanciaEmMilhas / tempoEmHoras;

        System.out.println("A velocidade média por hora em milhas é: " + velocidadeMediaEmMilhas); //11.25
    }
}
