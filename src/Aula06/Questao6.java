package Aula06;

public class Questao6 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = inverteArray(array1);

        for (int i : array1) {
            System.out.println(i);
        }

        System.out.println("**************************");

        for (int j : array2) {
            System.out.println(j);
        }
    }

    public static int[] inverteArray(int[] array) {
        int pos = array.length - 1;
        int[] arrayInvertido = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[pos];
            pos--;
        }
        return arrayInvertido;
    }
}
