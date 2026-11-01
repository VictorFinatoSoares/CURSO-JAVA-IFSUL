package aula06;

import helpers.Input;

public class Ex09 {
    public static void main(String[] args) {
        double ga = Input.readDouble("Nota do Grau A: ");
        double gb = Input.readDouble("Nota do Grau B: ");

        if (ga < 0 || gb < 0) {
            System.out.println("ERRO: Notas não podem ser NEGATIVAS!");
        } else {
            double media = ga * 0.3 + gb * 0.7;
            System.out.printf("Média: %.1f\n", media);
            if (media < 6.0) {
                System.out.println("É necessário realizar o Grau C.");
            } else {
                System.out.println("Grau C não necessário. Aprovado!");
            }
        }
    }
}
