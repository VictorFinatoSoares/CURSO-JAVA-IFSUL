package aula06;

import helpers.Input;

public class Ex12 {
    public static void main(String[] args) {
        double preco = Input.readDouble("Informe o preço: R$ ");
        int qtd = Input.readInteger("Informe a quantidade: ");

        double total = preco * qtd;
        double desconto = 0;

        if (qtd >= 3 && qtd <= 4) {
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
