package Aula01;

public class Desafio {
    public static void main(String[] args) {
        double a = 2;
        double b = 4;
        double c = -6;

        double delta = (Math.pow(b, 2)) -4 * a * c;
        System.out.println("Delta: " + delta); //64.0

        double div = 2 * a; // 4
        double x1 = (-b + Math.sqrt(delta)) / div;
        double x2 = (-b - Math.sqrt(delta)) / div;

        System.out.println("X1: " + x1); //1.0
        System.out.println("X2: " + x2); //-3.0
    }
}
