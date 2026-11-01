package aula06;

import helpers.Input;

public class Ex10 {
    public static void main(String[] args) {
        String entrada = Input.readLine("Digite uma letra: ");

        if (entrada.length() != 1 || !Character.isLetter(entrada.charAt(0))) {
            System.out.println("ERRO: Digite apenas uma letra.");
            return;
        }

        char letra = entrada.toUpperCase().charAt(0);
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
