package aula06;

import helpers.Input;

public class Ex15 {
    public static void main(String[] args) {
        int a = Input.readInteger("Informe o primeiro valor: ");
        int b = Input.readInteger("Informe o segundo valor: ");
        int c = Input.readInteger("Informe o terceiro valor: ");

        int ab = a + b;
        int ac = a + c;
        int bc = b + c;

        if (ab <= c || ac <= b || bc <= a) {
            System.out.println("Não forma um triângulo.");
            return;
        }

        if (a == b && b == c) {
            System.out.println("TRIÂNGULO EQUILÁTERO");
        } else if (a == b || b == c || a == c) {
            System.out.println("TRIÂNGULO ISÓSCELES");
        } else {
            System.out.println("TRIÂNGULO ESCALENO");
        }
    }
}
