package aula06;

import helpers.Input;

public class Ex09 {
    public static void main(String[] args) {
        double ga;
        double gb;

        do {
            ga = Input.readDouble("Nota do Grau A (0-10): ");

            if (ga < 0 || ga > 10) {
                System.out.println("ERRO: A nota deve estar entre 0 e 10!");
            }
        } while (ga < 0 || ga > 10);

        do {
            gb = Input.readDouble("Nota do Grau B (0-10): ");

            if (gb < 0 || gb > 10) {
                System.out.println("ERRO: A nota deve estar entre 0 e 10!");
            }
        } while (gb < 0 || gb > 10);

        double media = ga * 0.3 + gb * 0.7;
        System.out.printf("Média: %.1f\n", media);

        if (media < 6.0) {
            System.out.println("É necessário realizar o Grau C.");
        } else {
            System.out.println("Grau C não necessário. Aprovado!");
        }
    }
}
