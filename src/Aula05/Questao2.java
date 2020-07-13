package Aula05;

public class Questao2 {
    public static void main(String[] args) {
        int[] arr = {27, 98, 19, 23, 66, 32, 71, 2, 9, 47, 31, 11, 29, 10, 17, 8, 54, 79, 5, 62};

        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Soma dos valores: " + sum);
    }
}
