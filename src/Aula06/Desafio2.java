package Aula06;

public class Desafio2 {
    public static void main(String[] args) {
        System.out.println(EPalindromo("ARARA"));
    }

    public static boolean EPalindromo(String value) {
        int j = value.length() - 1;
        int count = 0;
        for(int i = 0; i < value.length(); i++) {
           if(value.charAt(i)  == value.charAt(j)){
               count++;
            }
           j--;
        }

        return count == value.length();
    }
}
