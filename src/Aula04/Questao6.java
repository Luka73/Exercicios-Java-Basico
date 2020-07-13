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
        for (int j = 0; j <= 10; j++) { //0 --> 10
            System.out.println("6 x " + j + " = " + (6 * j)); //mockado --> fixo
        }

        //6 x 0  = 0
        //6 x 1  = 1
        //6 x 2  = 12
        //6 x 3  = 18
        //6 x 4  = 24
        //6 x 5  = 30
        //6 x 6  = 36
        //6 x 7  = 42
        //6 x 8  = 48
        //6 x 9  = 54
        //6 x 10 = 60
    }
}
