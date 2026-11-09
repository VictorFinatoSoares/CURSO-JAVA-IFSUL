package aula31;

import helpers.Input;

public class ExercicioInicial {
    public static void main(String[] args) {
        while (true) {
            String dadosAluno = Input.readLine("Digite os dados do aluno: ");

            if (dadosAluno.trim().equalsIgnoreCase("fim")) {
                System.out.println("Encerrando sistema...");
                break;
            }

            String[] dadosSeparados = dadosAluno.split(",");
            exibirDados(dadosSeparados);
        }
    }

    public static void exibirDados(String[] dadosSeparados) {
        for (int i = 0; i < dadosSeparados.length; i++) {
            if (i == 0) {
                System.out.printf("Aluno: %s\n", dadosSeparados[i]);
            } else {
                System.out.printf("Nota %d: %.1f\n", i, Double.parseDouble(dadosSeparados[i]));
            }
        }

        double media = calcularMedia(dadosSeparados);
        
        System.out.printf("Média: %.2f\n", media);
        System.out.printf("Situação: %s\n", verificarSituacao(media));
    }
    
    public static double calcularMedia(String[] dadosSeparados) {
        double soma = 0;

        for (int i = 1; i < dadosSeparados.length; i++) {
            soma += Double.parseDouble(dadosSeparados[i]);
        }
        
        return soma / (dadosSeparados.length - 1);
    }

    public static String verificarSituacao(double media) {
        if (media >= 7) {
            return "APROVADO";
        } else if (media >= 5) {
            return "RECUPERAÇÃO";
        } else {
            return "REPROVADO";
        }
    }
}
