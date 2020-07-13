package Aula05;

import java.util.Arrays;

public class Questao5 {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        //int[][] arr1 = { {2,5}, {14,7} };
        arr[0][0] = 2;
        arr[0][1] = 5;
        arr[1][0] = 14;
        arr[1][1] = 7;

/*      System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);*/

        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++) {
                if(arr[i][j] > 10) {
                    count++;
                }
            }
        }

        //System.out.println(arr.length);
        System.out.println("Valores maiores que 10: " + count);
    }
}
