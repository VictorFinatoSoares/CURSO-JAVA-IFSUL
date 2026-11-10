package aula31;

import java.io.*;

public class LeituraDeArquivos {
    public static void main(String[] args) {
        String arquivo = "src/aula31/megasena.csv";

        try {
            BufferedReader buffer = new BufferedReader(new FileReader(arquivo));
            String linha = buffer.readLine();
            System.out.println(linha.replace(";", " | "));

            linha = buffer.readLine();
            int[] contagem = new int[61];

            while (linha != null) {
                String[] linhaSeparada = linha.split(";");

                boolean somentePares = true;
                String[] numerosSeparados = linhaSeparada[2].split(" ");

                for (String numeroTexto: numerosSeparados) {
                    int numero = Integer.parseInt(numeroTexto);

                    if (numero % 2 != 0) {
                        somentePares = false;
                    }

                    contagem[numero]++;
                }

                if (somentePares) {
                    System.out.println(linha.replace(";", " | "));
                }

                linha = buffer.readLine();
            }
            buffer.close();

            int maisSorteado = 0;
            int maxSorteios = contagem[maisSorteado];

            for (int i = 1; i <= 60; i++) {
                if (contagem[i] > maxSorteios) {
                    maxSorteios = contagem[i];
                    maisSorteado = i;
                }
            }
            System.out.printf("O número mais sorteado é %d. (%d vezes)\n", maisSorteado, maxSorteios);
        } catch (FileNotFoundException e) {
            System.out.printf("%s não existe!\n", arquivo);
        } catch (IOException e) {
            System.out.printf("Erro de leitura em %s.\n", arquivo);
        }
    }
}
