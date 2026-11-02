package aula10;

import helpers.Input;

public class Exercicios {
    public static void main(String[] args) {
        ex01();
    }

    public static void ex01() {
        System.out.println("RODANDO EXERCÍCIO #01:");

        int i = 0;
        double soma = 0;

        while (i < 20) {
            soma += Input.readDouble("Digite um número: ");
            i++;
        }

        System.out.printf("A soma de todos estes números é %.2f!\n", soma);
    }

    public static void ex02() {
        System.out.println("RODANDO EXERCÍCIO #02:");

        int i = 0;
        while (i <= 1000) {
            System.out.println(i);
            i++;
        }
    }

    public static void ex03() {
        System.out.println("RODANDO EXERCÍCIO #03:");

        int i = 0;

        while (i <= 2000) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

            i++;
        }
    }

    public static void ex04() {
        System.out.println("RODANDO EXERCÍCIO #04:");

        int i = 1000;

        while (i >= 0) {
            System.out.println(i);
            i--;
        }
    }

    public static void ex05() {
        System.out.println("RODANDO EXERCÍCIO #05:");

        int qtdVogais = 0;
        int qtdConsoantes = 0;
        int i = 0;

        while (i < 10) {
            String text;
            char letter;

            do {
                text = Input.readLine("Digite uma letra: ").toUpperCase();
                letter = text.charAt(0);

                if (!Character.isLetter(letter)) {
                    System.out.println("ERRO: A entrada precisa ser uma LETRA!");
                }

                if (text.length() != 1) {
                    System.out.println("ERRO: A entrada precisa conter apenas uma LETRA!");
                }

            } while (!Character.isLetter(letter) || text.length() != 1);


            if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                qtdVogais++;
            } else {
                qtdConsoantes++;
            }

            i++;
        }

        System.out.printf("Quantidade de vogais: %d\n", qtdVogais);
        System.out.printf("Quantidade de consoantes: %d\n", qtdConsoantes);
    }

    public static void ex06() {
        System.out.println("RODANDO EXERCÍCIO #06:");

        while (true) {
            double num = Input.readDouble("Digite um número (positivo): ");

            if (num > 0) {
                System.out.println("O número inserido é VÁLIDO!");
                break;
            } else {
                System.out.println("ERRO: O número inserido é INVÁLIDO! Tente novamente.");
            }
        }
    }

    public static void ex07() {
        System.out.println("RODANDO EXERCÍCIO #07:");

        int i = 0;
        int soma = 0;

        while (i < 10) {
            soma += Input.readInteger("Digite um número: ");
            i++;
        }

        System.out.printf("A soma de todos estes números é %d!\n", soma);
    }

    public static void ex08() {
        System.out.println("RODANDO EXERCÍCIO #08:");

        int quant = Input.readInteger("Quantos números você irá digitar? ");
        int i = 0;

        while (i < quant) {
            int num = Input.readInteger("Digite um número: ");

            if (num > 0) {
                System.out.println("POSITIVO!");
            } else if (num == 0) {
                System.out.println("ZERO!");
            } else {
                System.out.println("NEGATIVO!");
            }
            i++;
        }
    }

    public static void ex09() {
        System.out.println("RODANDO EXERCÍCIO #09:");

        int num1;
        int num2;

        do {
            num1 = Input.readInteger("Digite o primeiro número: ");

            if (num1 <= 0) {
                System.out.println("ERRO: O Número precisa ser POSITIVO!");
            }

        } while (num1 <= 0);

        do {
            num2 = Input.readInteger("Digite o segundo número: ");

            if (num2 <= num1) {
                System.out.println("ERRO: O segundo número precisa ser POSITIVO e MAIOR que o PRIMEIRO!");
            }

        } while (num2 <= 0 || num2 <= num1);

        int i = num1;

        while (i <= num2) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

            i++;
        }
    }

    public static void ex10() {
        System.out.println("RODANDO EXERCÍCIO #10:");

        int i = 0;
        int soma = 0;

        while (i <= 198) {
            soma += i;
            i++;
        }

        System.out.printf("A soma de todos os números de 0 a 198 é: %d\n", soma);
    }

    public static void ex11() {
        System.out.println("RODANDO EXERCÍCIO #11:");

        int inicio = Input.readInteger("Início: ");
        int fim;

        do {
            fim = Input.readInteger("Fim: ");

            if (fim <= inicio) {
                System.out.println("O FIM precisa ser MAIOR que o ÍNICIO");
            }
        } while (fim <= inicio);

        int somaPares = 0;
        int somaImpares = 0;

        int i = inicio;

        while (i <= fim) {
            if (i % 2 == 0) {
                somaPares += i;
            } else {
                somaImpares += i;
            }
            i++;
        }

        System.out.printf("A soma dos pares é %d\n", somaPares);
        System.out.printf("A soma dos ímpares é %d\n", somaImpares);
    }

    public static void ex12() {
        System.out.println("RODANDO EXERCÍCIO #12:");

        double soma = 0;
        int qtd = 0;

        while (true) {
            double num = Input.readDouble("Escreva um número: ");

            if (num < 0) {
                break;
            }

            soma += num;
            qtd++;
        }

        if (qtd == 0) {
            System.out.println("Não foi possível calcular a média.");
        } else {
            System.out.printf("A média destes números é: %.2f\n", soma / qtd);
        }
    }

    public static void ex13() {
        System.out.println("RODANDO EXERCÍCIO #13:");
        int num;

        do {
            num = Input.readInteger("Digite um número inteiro positivo: ");
            if (num <= 0) {
                System.out.println("ERRO: O número precisa ser POSITIVO!");
            }
        } while (num <= 0);

        int i = 1;
        int fatorial = 1;

        while (i <= num) {
            fatorial *= i;
            i++;
        }

        System.out.printf("O fatorial de %d é %d.\n", num, fatorial);
    }

    public static void ex14() {
        System.out.println("RODANDO EXERCÍCIO #14:");

        int num = Input.readInteger("Escreva um número: ");
        int i = 1;
        int divisores = 0;

        while (i <= num) {
            if (num % i == 0) {
                divisores++;
            }
            i++;
        }
        System.out.printf(divisores == 2 ? "É PRIMO!" : "NÃO É PRIMO!");
    }

    public static void ex15() {
        System.out.println("RODANDO EXERCÍCIO #15:");

        int i = 1;
        int soma = 0;

        while (i <= 200) {
            int j = 1;
            int divisores = 0;

            while (j <= i) {
                if (i % j == 0) {
                    divisores++;
                }
                j++;
            }

            if (divisores == 2) {
                System.out.println(i);
                soma += i;
            }

            i++;
        }
        System.out.printf("A soma de todos os números primos entre 1 e 200 é %d!\n", soma);
    }
}
