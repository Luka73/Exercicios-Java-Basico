package Aula05;

import java.util.Arrays;

public class Questao8 {
    public static void main(String[] args) {
        String[][] arr = new String[3][3];
        int line = arr.length;
        int column = arr[0].length;

        for(int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                if(i % 2 == 0)
                    arr[i][j] = (j % 2 == 0) ? "X" : "O";
                else
                    arr[i][j] = (j % 2 == 0) ? "O" : "X";

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        /*for (String[] s : arr) {
            System.out.println(Arrays.toString(s));
        }*/
    }
}
