package aula06;

import helpers.Input;

public class Ex13 {
    public static void main(String[] args) {
        String nome = Input.readLine("Digite seu nome: ");
        double peso;
        double altura;

        do {
            peso = Input.readDouble("Digite seu peso (KG): ");

            if (peso <= 0) {
                System.out.println("ERRO: O peso deve ser maior que ZERO!");
            }
        } while (peso <= 0);

        do {
            altura = Input.readDouble("Digite sua altura (M): ");

            if (altura <= 0) {
                System.out.println("ERRO: A altura deve ser maior que ZERO!");
            }
        } while (altura <= 0);

        double imc = peso / Math.pow(altura, 2);
        System.out.printf("%s, seu IMC é %.1f\n", nome, imc);

        calcularIMC(imc);
    }

    public static void calcularIMC(double imc) {
        if (imc < 18.5)
            System.out.println("Classificação: Abaixo do peso");
        else if (imc < 25.0)
            System.out.println("Classificação: Peso normal");
        else if (imc < 30.0)
            System.out.println("Classificação: Pré-obesidade");
        else if (imc < 35.0)
            System.out.println("Classificação: Obesidade Grau 1");
        else if (imc < 40.0)
            System.out.println("Classificação: Obesidade Grau 2");
        else
            System.out.println("Classificação: Obesidade Grau 3");
    }
}
