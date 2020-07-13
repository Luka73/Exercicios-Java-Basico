package Aula05;

public class Questao1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        // 1, 3, 5, 7, 9, 11, 13, 15, 17, 19

        int pos = 0;
        for(int i = 1; i <= 20; i++) {
            if(i % 2 == 1) {
                arr[pos] = i;
                pos++;
                System.out.print(i + " ");
            }
        }
    }
}
