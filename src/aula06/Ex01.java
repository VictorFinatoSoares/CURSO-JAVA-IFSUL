package aula06;

import helpers.Input;

public class Ex01 {
    public static void main(String[] args) {
        int num = Input.readInteger("Digite um número: ");

        if (num % 2 == 0) {
            System.out.printf("\nO número %d é PAR.", num);
        } else {
            System.out.printf("\nO número %d é ÍMPAR.", num);
        }
    }
}
