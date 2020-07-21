package Aula06;

public class Questao2 {
    public static void main(String[] args) {
        if(parOuImpar(6) == 1)
            System.out.println("6 é par!");

        if(parOuImpar(11) == -1)
            System.out.println("11 é ímpar!");
    }

    public static int parOuImpar(int n) {
        return (n % 2 == 0) ? 1 : -1;
    }
}
