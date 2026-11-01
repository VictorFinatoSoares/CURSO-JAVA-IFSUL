package aula06;

import helpers.Input;

public class Ex04 {
    public static void main(String[] args) {
        int a = Input.readInteger("Digite o primeiro valor: ");
        int b  = Input.readInteger("Digite o segundo valor: ");
        int c = Input.readInteger("Digite o terceiro valor: ");

        int menor = Math.min(a, Math.min(b, c));
        System.out.printf("O menor valor é %d\n", menor);
    }
}
