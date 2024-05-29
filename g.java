package Somativa;

import java.util.Scanner;

public class g {
	public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = Scanner.nextInt();
            soma += numero;
        }

        System.out.println("A soma dos 15 números é: " + soma);
    }
}

