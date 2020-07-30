package Aula01;

public class Questao5 {
    public static void main(String[] args) {
        double D = 6.82;
        double d = 3.41;

        double area = (D * d) / 2;
        System.out.println("Área: " + area); // Área: 11.6280000000001
        System.out.printf("Área: %.2f", area); // Área: 11.63
        System.out.printf("Área: %.2f", area - 0.005); // Área: 11.62 (sem arredondar)
    }
}
