package aula06;

import helpers.Input;

public class Ex02 {
    public static void main(String[] args) {
        int a = Input.readInteger("Digite o primeiro número: ");
        int b = Input.readInteger("Digite o segundo número: ");

        if (a > b) {
            System.out.printf("O maior é: %d\n", a);
        } else if (a < b) {
            System.out.printf("O maior é: %d\n", b);
        } else {
            System.out.println("Os dois valores são iguais!");
        }
    }
}
