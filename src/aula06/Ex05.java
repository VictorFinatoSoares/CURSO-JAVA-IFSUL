package aula06;

import helpers.Input;

public class Ex05 {
    public static void main(String[] args) {
        double preco;

        do {
            preco = Input.readDouble("Digite o preço: R$ ");

            if (preco <= 0) {
                System.out.println("ERRO: O preço precisa ser maior que ZERO!");
            }
        } while (preco <= 0);

        if (preco <= 30) {
            System.out.println("Preço baixo");
        } else if (preco <= 50) {
            System.out.println("Preço médio");
        } else {
            System.out.println("Preço alto");
        }
    }
}
