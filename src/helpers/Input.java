package helpers;

import java.util.Scanner;

public class Input {
    public static final Scanner sc = new Scanner(System.in);

    public static int readInteger(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("ERRO: A entrada precisa ser um número INTEIRO!");
            }
        }
    }

    public static double readDouble(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                double value = Double.parseDouble(sc.nextLine());

                if (!Double.isFinite(value)) {
                    throw new NumberFormatException();
                }

                return value;
            } catch (NumberFormatException e) {
                System.out.println("ERRO: A entrada precisa ser um número DOUBLE!");
            }
        }
    }

    public static String readLine(String msg) {
        while (true) {
            System.out.print(msg);
            String input = sc.nextLine();

            if (input.isBlank()) {
                System.out.println("ERRO: A entrada não pode ser VAZIA!");
                continue;
            }

            return input;
        }
    }
}
