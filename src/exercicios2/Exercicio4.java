package exercicios2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("Insira os valores");
            float V1 = sc.nextFloat();
            float V2 = sc.nextFloat();

            if (V2 != 0) {
                System.out.println(V1 / V2);
            } else {
                System.out.println("Divisão impossível");
            }
        }
    }
}
