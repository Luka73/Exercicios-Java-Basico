package Aula06;

public class Questao1 {
    public static void main(String[] args) {
        System.out.println(comparaNumeros(3, 5));
    }

    public static int comparaNumeros(int n1, int n2) {
        if (n1 < n2) return -1;
        else if(n1 == n2) return 0;
        else return 1;
    }
}
