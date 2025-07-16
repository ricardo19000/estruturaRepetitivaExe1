package exercicios1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] arg) {
        int x, y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira as coordenadas");

        x = sc.nextInt();
        y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("Quarto");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        System.out.println("Tangente");
    }
}
