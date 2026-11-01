package aula06;

import helpers.Input;

public class Ex17 {
    public static void main(String[] args) {
        int dia = Input.readInteger("Dia (1-31): ");
        int mes = Input.readInteger("Mês (1-12): ");
        int ano = Input.readInteger("Ano (0-2026): ");

        if (anoMesInvalido(ano, mes) || diaInvalido(dia, mes, ano)) {
            System.out.println("Data INVÁLIDA!");
            return;
        }

        System.out.printf("Data válida: %02d/%02d/%04d\n", dia, mes, ano);
    }

    public static boolean anoMesInvalido(int ano, int mes) {
        return ano < 0 || ano > 2026 || mes < 1 || mes > 12;
    }

    public static boolean anoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public static int maxDias(int mes, int ano) {
        if (mes == 2) {
            return anoBissexto(ano) ? 29 : 28;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public static boolean diaInvalido(int dia, int mes, int ano) {
        return dia < 1 || dia > maxDias(mes, ano);
    }
}
