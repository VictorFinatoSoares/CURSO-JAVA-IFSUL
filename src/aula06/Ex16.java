package aula06;

import helpers.Input;

public class Ex16 {
    public static void main(String[] args) {
        char opcao = 'X';

        do {
            opcao = Input.readLine("Escolha sua opção PAR (P) ou ÍMPAR (I): ").toUpperCase().charAt(0);

            if (opcao != 'P' && opcao != 'I') {
                System.out.println("ERRO: Opção INVÁLIDA!");
            }
        } while (opcao != 'P' && opcao != 'I');

        int jogadorUm = Input.readInteger("Jogador um: ");
        int jogadorDois = Input.readInteger("Jogador dois: ");

        int soma = jogadorUm + jogadorDois;
        boolean voceVenceu = (soma % 2 == 0 && opcao == 'P') || (soma % 2 != 0 && opcao == 'I');

        System.out.println(voceVenceu ? "Jogador um VENCEU!" : "Jogador dois VENCEU!");
    }
}
