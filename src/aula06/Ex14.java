package aula06;

import helpers.Input;

public class Ex14 {
    public static void main(String[] args) {
        int senha = Input.readInteger("Digite sua senha: ");

        if (senha == 9876) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Senha incorreta!");
        }
    }
}
