package Aula06;

public class Questao7 {
    public static void main(String[] args) {
        System.out.println(padLeft(5, '0', "1")); //"00001"
        System.out.println(padLeft(5, '0', "123")); //"00123"
        System.out.println(padLeft(5, '0', "12345")); //"12345"
        System.out.println(padRight(5, '0', "1")); //"10000"
        System.out.println(padRight(5, '0', "123")); //"12300"
        System.out.println(padRight(5, '0', "12345")); //"12345"
        System.out.println(padding(5, '0', "1", true)); //"10000"
        System.out.println(padding(5, '0', "1", false)); //"00001"
    }

    public static String padLeft(int n, char element, String value) {
        String pad = "";
        int fim = Math.max(n, value.length()) - Math.min(n, value.length());
        for(int i = 1; i <= fim; i++) {
            pad += element;
        }

        return pad+value;
    }

    public static String padRight(int n, char element, String value) {
        String pad = "";
        int fim = Math.max(n, value.length()) - Math.min(n, value.length());
        for(int i = 1; i <= fim; i++) {
            pad += element;
        }

        return value+pad;
    }

    public static String padding(int n, char element, String value, boolean side) {
        String pad = "";
        int fim = Math.max(n, value.length()) - Math.min(n, value.length());
        for(int i = 1; i <= fim; i++) {
            pad += element;
        }

        return (side) ? value+pad : pad+value;
    }
}
