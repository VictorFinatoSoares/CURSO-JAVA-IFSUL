package aula06;

import helpers.Input;

public class Ex07 {
    public static void main(String[] args) {
        int ano = Input.readInteger("Informe o ano atual: ");
        boolean anoBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if (anoBissexto) {
            System.out.println(ano + " é bissexto.");
        } else {
            System.out.println(ano + " não é bissexto.");
        }
    }
}
