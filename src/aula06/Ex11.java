package aula06;

import helpers.Input;

public class Ex11 {
    public static void main(String[] args) {
        double preco;
        int qtd;

        do {
            preco = Input.readDouble("Informe o preço: R$ ");

            if (preco <= 0) {
                System.out.println("ERRO: O preço deve ser maior que ZERO!");
            }
        } while (preco <= 0);

        do {
            qtd = Input.readInteger("Informe a quantidade (maior que zero): ");

            if (qtd <= 0) {
                System.out.println("ERRO: A quantidade deve ser maior que ZERO!");
            }
        } while (qtd <= 0);

        double total = preco * qtd;
        System.out.printf("Total: R$ %.2f\n", total);
    }
}
