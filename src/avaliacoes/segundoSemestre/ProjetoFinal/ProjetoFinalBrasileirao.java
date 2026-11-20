package avaliacoes.segundoSemestre.ProjetoFinal;

import java.io.*;

public class ProjetoFinalBrasileirao {
    public static void main(String[] args) {
        String arquivo = "src/avaliacoes/segundoSemestre/ProjetoFinal/classificacao_brasileirao.txt";
        String[][] times = new String[20][10];

        int quantidadeTimes = lerArquivo(arquivo, times);

        if (quantidadeTimes > 0) {
            exibirRelatorio(times, quantidadeTimes);
        } else {
            System.out.println("ERRO: Não encontramos dados de nenhum time!");
        }
    }

    public static int lerArquivo(String arquivo, String[][] times) {
        int quantidadeTimes = 0;

        try {
            BufferedReader buffer = new BufferedReader(new FileReader(arquivo));
            String linha = buffer.readLine();
            linha = buffer.readLine();

            while (linha != null && quantidadeTimes < times.length) {
                times[quantidadeTimes] = linha.split(";");
                quantidadeTimes++;
                linha = buffer.readLine();
            }

            buffer.close();
        } catch (FileNotFoundException e) {
            System.out.printf("%s não existe!\n", arquivo);
        } catch (IOException e) {
            System.out.printf("Erro de leitura em %s.\n", arquivo);
        }

        return quantidadeTimes;
    }

    public static int somarColuna(String[][] times, int quantidadeTimes, int coluna) {
        int soma = 0;

        for (int i = 0; i < quantidadeTimes; i++) {
            soma += Integer.parseInt(times[i][coluna]);
        }

        return soma;
    }

    public static double calcularMedia(int total, int quantidadeTimes) {
        return (double) total / quantidadeTimes;
    }

    public static int encontrarMaior(String[][] times, int quantidadeTimes, int coluna) {
        int indiceMaior = 0;

        for (int i = 1; i < quantidadeTimes; i++) {
            if (Integer.parseInt(times[i][coluna]) > Integer.parseInt(times[indiceMaior][coluna])) {
                indiceMaior = i;
            }
        }

        return indiceMaior;
    }

    public static int encontrarMenor(String[][] times, int quantidadeTimes, int coluna) {
        int indiceMenor = 0;

        for (int i = 1; i < quantidadeTimes; i++) {
            if (Integer.parseInt(times[i][coluna]) < Integer.parseInt(times[indiceMenor][coluna])) {
                indiceMenor = i;
            }
        }

        return indiceMenor;
    }

    public static int contarSaldoPositivo(String[][] times, int quantidadeTimes) {
        int quantidade = 0;
        int colunaSaldoDeGols = 9;

        for (int i = 0; i < quantidadeTimes; i++) {
            if (Integer.parseInt(times[i][colunaSaldoDeGols]) > 0) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static void exibirRelatorio(String[][] times, int quantidadeTimes) {
        int colunaPontos = 2;
        int colunaVitorias = 4;
        int colunaGols = 7;

        int lider = encontrarMaior(times, quantidadeTimes, colunaPontos);
        int lanterna = encontrarMenor(times, quantidadeTimes, colunaPontos);
        int timeComMaisVitorias = encontrarMaior(times, quantidadeTimes, colunaVitorias);
        int totalPontos = somarColuna(times, quantidadeTimes, colunaPontos);
        int totalGols = somarColuna(times, quantidadeTimes, colunaGols);
        double mediaGols = calcularMedia(totalGols, quantidadeTimes);
        int timesComSaldoPositivo = contarSaldoPositivo(times, quantidadeTimes);

        System.out.println("=-=-=-=-=-= RELATÓRIO DO BRASILEIRÃO 2026 (34 JOGOS POR TIME) =-=-=-=-=-=-=");
        System.out.printf("Líder: %s (%s pontos)\n", times[lider][1], times[lider][2]);
        System.out.printf("Lanterna: %s (%s pontos)\n", times[lanterna][1], times[lanterna][2]);
        System.out.printf("Total de pontos somados: %d\n", totalPontos);
        System.out.printf("Média de gols marcados por time: %.2f\n", mediaGols);
        System.out.printf("Time com mais vitórias: %s (%s vitórias)\n", times[timeComMaisVitorias][1], times[timeComMaisVitorias][4]);
        System.out.printf("Quantidade de times com saldo de gols positivo: %d de %d\n", timesComSaldoPositivo, quantidadeTimes);
    }
}
