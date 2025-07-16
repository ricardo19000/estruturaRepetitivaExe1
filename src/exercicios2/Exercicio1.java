package exercicios2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número");
        int x = sc.nextInt();

        for (int i = 0; i < x && 1 <= x && x <= 1000; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
