package Aula04;

public class Questao6 {
    public static void main(String[] args) {
        //Usando While
        int i = 0;
        while (i <= 10) {
            System.out.println("6 x " + i + " = " + (6 * i));
            i++;
        }

        System.out.println("***********************");

        //Usando For
        for (int j = 0; j <= 10; j++) {
            System.out.println("6 x " + j + " = " + (6 * j));
        }
    }
}
