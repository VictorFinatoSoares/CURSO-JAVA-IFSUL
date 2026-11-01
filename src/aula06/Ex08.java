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
                [5] Potenciação
                [6] Radiciação
                
                """);

        int opcao;

        do {
            opcao = Input.readInteger("Escolha uma opção (1-6): ");

            if (opcao < 1 || opcao > 6) {
                System.out.println("ERRO: Essa opção não existe!");
            }

        } while (opcao < 1 || opcao > 6);

        double x = Input.readDouble("Informe o primeiro valor: ");

        switch (opcao) {
            case 1:
                double y = Input.readDouble("Informe o segundo valor: ");
                System.out.printf("%.2f + %.2f = %.2f", x, y, x + y);
                break;
            case 2:
                y = Input.readDouble("Informe o segundo valor: ");
                System.out.printf("%.2f - %.2f = %.2f", x, y, x - y);
                break;
            case 3:
                y = Input.readDouble("Informe o segundo valor: ");
                System.out.printf("%.2f * %.2f = %.2f", x, y, x * y);
                break;
            case 4:
                y = Input.readDouble("Informe o segundo valor: ");
                if (y == 0) {
                    System.out.println("Não pode dividir por ZERO!");
                } else {
                    System.out.printf("%.2f / %.2f = %.2f", x, y, x / y);
                }
                break;
            case 5:
                y = Input.readDouble("Informe o expoente: ");
                System.out.printf("%.2f elevado a %.2f = %.2f", x, y, Math.pow(x, y));
                break;
            case 6:
                int n;
                do {
                    n = Input.readInteger("Informe o índice da raiz (inteiro positivo): ");

                    if (n <= 0) {
                        System.out.println("ERRO: O índice da raiz deve ser maior que ZERO!");
                    }
                } while (n <= 0);

                if (x < 0 && n % 2 == 0) {
                    System.out.println("ERRO: Não existe raiz real de índice par para número negativo.");
                } else if (x < 0) {
                    double resultado = -Math.pow(-x, 1.0 / n);
                    System.out.printf("Raiz %d de %.2f = %.2f", n, x, resultado);
                } else {
                    double resultado = Math.pow(x, 1.0 / n);
                    System.out.printf("Raiz %d de %.2f = %.2f", n, x, resultado);
                }
                break;
            default:
                System.out.println("Não foi possível operar.");
        }
    }
}
