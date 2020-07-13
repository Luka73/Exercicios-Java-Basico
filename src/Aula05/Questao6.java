package Aula05;

public class Questao6 {
    public static void main(String[] args) {
        int[] tab = {545, 5665, 65, 76, 12, 65};

        int min = tab[0];
        int max = 0;

        for(int i : tab) {
            if(i > max) max = i;
            if(i < min) min = i;
        }

        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
    }
}
