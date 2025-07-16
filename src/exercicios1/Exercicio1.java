package exercicios1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] arg){
        String senha, controle;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a senha");

        senha = sc.next();
        controle = "2002";

        while (!senha.equals(controle)) {
            System.out.println("Senha inválida, tente novamente");
            senha = sc.next();
        }
        System.out.println("Acesso permitido");
    }
}
