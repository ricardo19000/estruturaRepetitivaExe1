package exercicios1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] arg) {
        int escolha, alcool, gasolina, diesel;
        Scanner sc = new Scanner(System.in);

        System.out.print(" ______________________ \n");
        System.out.print("|Código|\tCombustível|\n");
        System.out.print("|1     |\tÁlcool     |\n");
        System.out.print("|2     |\tGasolina   |\n");
        System.out.print("|3     |\tDiesel     |\n");
        System.out.print("|4     |\tSair       |\n");
        System.out.print(" ---------------------- \n");

        System.out.println("Escolha o combustível");
        escolha = sc.nextInt();
        alcool = 0;
        diesel = 0;
        gasolina = 0;

        while (escolha != 4) {
            if (escolha == 1) {
                alcool += 1;
            } else if (escolha == 2) {
                gasolina += 1;
            } else if (escolha == 3) {
                diesel += 1;
            }
            escolha = sc.nextInt();
        }
        System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n", alcool, gasolina, diesel);
    }
}
