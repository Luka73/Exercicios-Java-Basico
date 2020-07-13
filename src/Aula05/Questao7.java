package Aula05;

import java.util.Arrays;

public class Questao7 {
    public static void main(String[] args) {
        int[][] arr = new int[6][4]; // matriz
        int lines = arr.length; // 6
        int columns = arr[0].length; // 4

        for(int i = 0; i < lines; i++){
            for(int j = 0; j < columns; j++) {
                arr[i][j] = 0;

                if(i == 0 || i == lines - 1)
                    arr[i][j] = 1;

                if(j == 0 || j == columns - 1)
                    arr[i][j] = 1;

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        /*for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }*/
    }
}
