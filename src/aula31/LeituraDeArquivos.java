package aula31;

import java.io.*;

public class LeituraDeArquivos {
    public static void main(String[] args) {
        String arquivo = "src/aula31/megasena.csv";

        try {
            FileReader leitorArquivos = new FileReader(arquivo);
            BufferedReader buffer = new BufferedReader(leitorArquivos);

            String linha = buffer.readLine();

            boolean primeiraLinha = true;
            int[] contagem = new int[61];

            while (linha != null) {
                String[] linhaSeparada = linha.split(";");

                for (int i = 0; i < linhaSeparada.length; i++) {
                    if (primeiraLinha) {
                        System.out.print(linhaSeparada[i] + " | ");

                        if (i == 2) {
                            System.out.println();
                        }

                    } else {
                        String[] numerosSeparados = linhaSeparada[2].split(" ");
                        boolean somentePares = true;

                        for (String numero : numerosSeparados) {
                            if (i == 2) {
                                contagem[Integer.parseInt(numero)]++;
                            }
                            if (Integer.parseInt(numero) % 2 != 0) {
                                somentePares = false;
                            }
                        }

                        if (somentePares) {
                            System.out.print(linhaSeparada[i] + " ");

                            if (i == 2) {
                                System.out.println();
                            }

                        }
                    }
                }

                linha = buffer.readLine();
                primeiraLinha = false;
            }

            buffer.close();

            int maisSorteado = 1;
            int maxSorteios = contagem[1];

            for (int i = 2; i <= 60; i++) {
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
