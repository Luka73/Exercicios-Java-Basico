package Aula06;

public class Desafio1 {
    public static void main(String[] args) {
        int vogais = contaVogais("LuAna");
        System.out.println("O texto contém " + vogais + " vogais.");
    }

    public static int contaVogais(String texto) {
        int count = 0; //acumulador
        for(int i = 0; i < texto.length(); i++) {
            if(eVogal(texto.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static boolean eVogal(char letra) {
        char v = Character.toLowerCase(letra);
        return  v == 'a' || v == 'e'
                || v == 'i' || v == 'o'
                || v == 'u';
    }
}
