package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] arg) {
        Locale.setDefault(Locale.ENGLISH);

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        System.out.println("Insira a quantidade de testes");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Insira as médias");
            double C1 = sc.nextDouble();
            double C2 = sc.nextDouble();
            double C3 = sc.nextDouble();

            double peso1 = 2;
            double peso2 = 3;
            double peso3 = 5;
            double pesoT = peso1 + peso2 + peso3;

            double mediaP = ((C1 * peso1) + (C2 * peso2) + (C3 * peso3)) / pesoT;

            System.out.printf("%.1f\n", mediaP);
        }
    }
}
