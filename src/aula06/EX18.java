package aula06;

import helpers.Input;

public class EX18 {
    public static void main(String[] args) {
        double saldo = Input.readDouble("Digite seu saldo: R$ ");

        System.out.println("[1] Saque\n[2] Depósito\n");
        int opcao = Input.readInteger("Escolha: ");

        if (opcao == 1) {
            saldo = sacar(saldo);
        } else if (opcao == 2) {
            saldo = depositar(saldo);
        } else {
            System.out.println("ERRO: Opção INVÁLIDA!");
            return;
        }

        System.out.printf("Saldo atualizado: R$ %.2f\n", saldo);
    }

    public static double sacar(double saldo) {
        double valorSaque;

        do {
            valorSaque = Input.readDouble("Valor a sacar: R$ ");

            if (valorSaque <= 0) {
                System.out.println("ERRO: O valor de saque precisa ser maior que ZERO!");
            }

            if (valorSaque > saldo) {
                System.out.println("ERRO: Saldo INSUFICIENTE para esse saque!");
            }
        } while (valorSaque <= 0 || valorSaque > saldo);

        return saldo -= valorSaque;
    }

    public static double depositar(double saldo) {
        double valorDeposito;

        do {
            valorDeposito = Input.readDouble("Valor a depositar (máx: R$ 300,00): R$ ");

            if (valorDeposito <= 0) {
                System.out.println("ERRO: O valor de saque precisa ser maior que ZERO!");
            }

            if (valorDeposito > 300) {
                System.out.println("ERRO: O valor de depósito máximo é R$ 300,00!");
            }

        } while (valorDeposito <= 0 || valorDeposito > 300);

        return saldo += valorDeposito;
    }
}
