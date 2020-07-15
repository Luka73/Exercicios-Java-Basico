package Aula05;

/*Preencha uma matriz 2 x 2 com números inteiros.
Em seguida, conte e escreva quantos valores maiores que 10 ela possui.*/

public class Questao5 {
    public static void main(String[] args) {
        int[][] arr = new int[2][2]; //matriz quadrática
        //int[][] arr1 = { {2,5}, {14,7} };
        arr[0][0] = 2;
        arr[0][1] = 5;
        arr[1][0] = 14;
        arr[1][1] = 7;

        //int tamanhoDoVetor = arr.length;
        //int tamanhoDaLinha = arr.length;
        //int tamanhoDaColuna = arr[0].length;

       /* System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);*/

        int count = 0;
        for(int i = 0; i < arr.length; i++) { //linhas
            for(int j = 0; j < arr[0].length; j++) { //colunas
                if(arr[i][j] > 10) { //arr[1][1]
                    count++; //1
                }
            }
        }

        //System.out.println(arr.length);
        System.out.println("Valores maiores que 10: " + count);
    }
}
