package aula06;

import helpers.Input;

public class Ex11 {
    public static void main(String[] args) {
        double preco = Input.readDouble("Informe o preço: R$ ");
        int qtd = Input.readInteger("Informe a quantidade: ");

        double total = preco * qtd;
        System.out.printf("Total: R$ %.2f\n", total);
    }
}
