package exercicios2;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor");
        int N = sc.nextInt();

        for (int i=N; i > 0; i--) {
            int R = N % i;
            if (R == 0) {
                int X = N / i;
                System.out.println(X);
            }
        }
    }
}
