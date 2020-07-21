package Aula06;

public class Questao3 {
    public static void main(String[] args) {
        System.out.println(potencia(2, 10));
    }

    public static int potencia(int base, int exp) {
        int pow = 1;
        for(int i = 1; i <= exp; i++) {
            pow *= base;
        }
        return pow;
    }
}
