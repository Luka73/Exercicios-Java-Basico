package Aula06;

public class Questao4 {
    public static void main(String[] args) {
        System.out.printf("%.2f", areaDoCirculo(3.4));
    }

    public static double areaDoCirculo(double raio) {
        return Math.PI * raio * raio;
    }
}
