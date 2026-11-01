package aula06;

import helpers.Input;

public class Ex12 {
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
            qtd = Input.readInteger("Informe a quantidade: ");

            if (qtd <= 0) {
                System.out.println("ERRO: A quantidade deve ser maior que ZERO!");
            }
        } while (qtd <= 0);

        double total = preco * qtd;
        double desconto;

        if (qtd < 3) {
            desconto = 0;
        } else if (qtd <= 4) {
            desconto = 0.10;
        } else if (qtd <= 10) {
            desconto = 0.15;
        } else {
            desconto = 0.20;
        }

        total *= (1.0 - desconto);
        System.out.printf("Desconto: %.0f%% | Total: R$ %.2f\n", desconto * 100, total);
    }
}
