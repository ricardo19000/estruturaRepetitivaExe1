package exercicios2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int N, C, n;

        System.out.println("Insira o valor");
        N = sc.nextInt();
        n = N;
        C = 1;

        if (N != 0) {
            for (int i = 1; i < N; i++) {
                n = n * (N - C);
                C += 1;
            }
            System.out.println(n);
        } else {
            System.out.println(1);
        }
    }
}
