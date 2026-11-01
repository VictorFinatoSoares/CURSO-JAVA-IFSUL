package aula06;

import helpers.Input;

public class Ex06 {
    public static void main(String[] args) {
        double valor;

        do {
            valor = Input.readDouble("Digite o valor: R$ ");

            if (valor <= 0) {
                System.out.println("ERRO: O valor precisa ser maior que ZERO!");
            }
        } while (valor <= 0);

        int taxa;

        if (valor < 100) {
            taxa = 10;
        } else if (valor < 300) {
            taxa = 20;
        } else if (valor < 1000) {
            taxa = 50;
        } else {
            taxa = 0;
        }

        if (taxa > 0 ) {
            System.out.printf("Taxa: %d%%\nNovo valor: R$%.2f\n", taxa, valor * (1 + (double) taxa / 100));
        } else {
            System.out.println("Valor >= 1000, sem taxa definida!");
        }
    }
}
