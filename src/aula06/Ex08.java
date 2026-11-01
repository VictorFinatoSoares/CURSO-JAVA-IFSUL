package aula06;

import helpers.Input;

public class Ex08 {
    public static void main(String[] args) {
        System.out.println("""
                ====== CALCULADORA ======
                
                [1] Adição
                [2] Subtração
                [3] Multiplicação
                [4] Divisão
                
                """);

        int opcao;

        do {
            opcao = Input.readInteger("Escolha uma opção (1-4): ");

            if (opcao < 1 || opcao > 4) {
                System.out.println("ERRO: Essa opção não existe!");
            }

        } while (opcao < 1 || opcao > 4);

        double x = Input.readDouble("Informe o primeiro valor: ");
        double y = Input.readDouble("Informe o segundo valor: ");

        switch (opcao) {
            case 1:
                System.out.printf("%.2f + %.2f = %.2f", x, y, x + y);
                break;
            case 2:
                System.out.printf("%.2f - %.2f = %.2f", x, y, x - y);
                break;
            case 3:
                System.out.printf("%.2f * %.2f = %.2f", x, y, x * y);
                break;
            case 4:
                System.out.printf("%.2f / %.2f = %.2f", x, y, x / y);
                break;
            default:
                System.out.println("Não foi possível operar.");
        }
    }
}
