package exercicios2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de números");
        int N = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < N; i++) {
            System.out.println("Insira o número");
            int X = sc.nextInt();

            if (10 <= X && X <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.printf("%d in\n%d out", in, out);
    }
}
