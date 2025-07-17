package exercicios2;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor");
        int N = sc.nextInt();

        for (int i=1 ; i<=N ; i++){
            int Q = (int) Math.pow(i, 2);
            int C = (int) Math.pow(i, 3);
            System.out.printf("%d %d %d\n", i, Q, C);
        }
    }
}
