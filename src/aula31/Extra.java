package aula31;

import java.io.*;

public class Extra {
    public static void main(String[] args) {
        String arquivo = "src/aula31/temperaturas.csv";

        try {
            System.out.println("Registros com temperatura igual ou superior a 30 °C:");

            BufferedReader buffer = new BufferedReader(new FileReader(arquivo));
            String linha = buffer.readLine();
            linha = buffer.readLine();

            String maiorTemperaturaData = "";

            double somaTemperaturas = 0;
            double maiorTemperatura = 0;
            int qtdTemperaturas = 0;

            while (linha != null) {
                String[] linhaSeparada = linha.split(";");

                somaTemperaturas += Double.parseDouble(linhaSeparada[1]);
                qtdTemperaturas++;

                if (Double.parseDouble(linhaSeparada[1]) >= 30) {
                    System.out.printf("%s: %s°C\n", linhaSeparada[0], linhaSeparada[1]);
                }

                if (Double.parseDouble(linhaSeparada[1]) > maiorTemperatura) {
                    maiorTemperatura = Double.parseDouble(linhaSeparada[1]);
                    maiorTemperaturaData = linhaSeparada[0];
                }

                linha = buffer.readLine();
            }

            System.out.printf("Temperatura média: %.2f°C\n", somaTemperaturas / qtdTemperaturas);
            System.out.printf("Maior temperatura: %.1f°C (%s)\n", maiorTemperatura, maiorTemperaturaData);

            buffer.close();
        } catch (FileNotFoundException e) {
            System.out.printf("%s não existe!\n", arquivo);
        } catch (IOException e) {
            System.out.printf("Erro de leitura em %s.\n", arquivo);
        }
    }
}
