package Aula01;

public class Questao6 {
    public static void main(String[] args) {
        //Notas de inglês do Gabriel
        double p1 = 6.5;
        double p2 = 7.8;
        double p3 = 8.0;
        double p4 = 7.1;
        double somaDosPesos = 2+2+3+3;

        double mediaPonderada = ((p1*2) + (p2*2) + (p3*3) + (p4*3)) / somaDosPesos;
        System.out.println("A média ponderada do Gabriel é: " + mediaPonderada); //7.390...
    }
}
