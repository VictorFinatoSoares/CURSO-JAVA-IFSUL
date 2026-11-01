package aula06;

import helpers.Input;

public class Ex10 {
    public static void main(String[] args) {
        char letra = Input.readLine("Digite uma letra: ").toUpperCase().charAt(0);
        String vogais = "AEIOU";

        for (int i = 0; i < vogais.length(); i++) {
            if (vogais.charAt(i) == letra) {
                System.out.println("É uma VOGAL.");
                return;
            }
        }

        System.out.println("É uma CONSOANTE.");
    }
}
