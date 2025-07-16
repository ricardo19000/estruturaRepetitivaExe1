package exercicios1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] arg){
        int senha, controle;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a senha");

        senha = sc.nextInt();
        controle = 2002;

        while (senha != controle) {
            System.out.println("Senha inválida, tente novamente");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido");
    }
}
