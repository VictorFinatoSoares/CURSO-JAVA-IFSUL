package aula32;

import helpers.Input;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExercicioLeitura {
    public static void main(String[] args) {
        String arquivo = "src/aula32/spotify.txt";

        try {
            BufferedReader buffer = new BufferedReader(new FileReader(arquivo));
            String linha = buffer.readLine();
            int totalMusicas = Integer.parseInt(linha);

            linha = buffer.readLine();

            int somaStreams = 0;
            int qtdMusicas3B = 0;
            int qtdMusicasWeeknd = 0;

            String artistaPesquisado = Input.readLine("Busque por músicas de um artista: ");
            List<String> listaMusicasArtistaPesquisado = new ArrayList<String>();

            while (linha != null) {
                String[] linhaSeparada = linha.split("#");

                System.out.printf("%d | Média de streams de %s: %.2f mil\n", Integer.parseInt(linhaSeparada[0]), linhaSeparada[1], Double.parseDouble(linhaSeparada[4]));
                somaStreams += Integer.parseInt(linhaSeparada[3]);

                if (Integer.parseInt(linhaSeparada[3]) > 3000) {
                    qtdMusicas3B++;
                }

                if (linhaSeparada[2].equalsIgnoreCase("The Weeknd")) {
                    qtdMusicasWeeknd++;
                }

                if (linhaSeparada[2].equalsIgnoreCase(artistaPesquisado)) {
                    listaMusicasArtistaPesquisado.add(linhaSeparada[1]);
                }

                linha = buffer.readLine();
            }

            System.out.printf("Total de musicas: %d\n", totalMusicas);
            System.out.printf("Soma de streams: %d milhões\n", somaStreams);
            System.out.printf("Quantidade de músicas com mais de 3B de streams: %d\n", qtdMusicas3B);
            System.out.printf("Quantidade de músicas do The Weeknd: %d\n", qtdMusicasWeeknd);

            if (listaMusicasArtistaPesquisado.isEmpty()) {
                System.out.printf("Não encontramos músicas do %s\n", artistaPesquisado);
            } else {
                System.out.printf("Músicas encontradas do %s:\n", artistaPesquisado);
                listaMusicasArtistaPesquisado.forEach(System.out::println);
            }

            buffer.close();
        } catch (FileNotFoundException e) {
            System.out.printf("%s não existe!\n", arquivo);
        } catch (IOException e) {
            System.out.printf("Erro de leitura em %s.\n", arquivo);
        }
    }
}
