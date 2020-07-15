package Aula05;

public class Questao1 {
    public static void main(String[] args) {
        int[] numeros = new int[10]; //tamanho do array (10)

        int pos = 0; //
        for(int i = 1; i <= 20; i++) {
            if(i % 2 == 1) {  // % --> módulo = resto
                numeros[pos] = i;
                pos++;
                System.out.print(i + " ");
            }
        }
    }
}
