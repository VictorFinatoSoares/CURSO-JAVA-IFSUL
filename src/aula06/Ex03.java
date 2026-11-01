package aula06;

import helpers.Input;

public class Ex03 {
    public static void main(String[] args) {
        int a = Input.readInteger("Digite o primeiro número: ");
        int b = Input.readInteger("Digite o segundo número: ");

        double resultado = (double) a / b;

        System.out.printf("\n%d dividido por %d = %.2f\n", a, b, resultado);
    }
}
