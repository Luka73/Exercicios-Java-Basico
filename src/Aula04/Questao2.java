package Aula04;

public class Questao2 {
    public static void main(String[] args) {
        //Usando While incluindo -30 e 30
        int i = -30;
        while(i <= 30) {
            System.out.println(i);
            i++;
        }

        System.out.println("***********************");

        //Usando While excluindo -30 e 30
        int j = -29;
        while(j < 30) {
            System.out.println(j);
            j++;
        }

        System.out.println("***********************");

        //Usando For incluindo -30 e 30
        for(int x = -30; x <= 30; x++) {
            System.out.println(x);
        }

        System.out.println("***********************");

        //Usando For excluindo -30 e 30
        for(int y = -29; y < 30; y++) {
            System.out.println(y);
        }

    }
}
