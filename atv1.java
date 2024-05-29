package Somativa;

import java.util.Scanner;

public class atv1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double a, b, soma, sub, multi, div;

		System.out.print("Informe o valor: ");
		a= ler.nextDouble();

		System.out.print("Informe o valor: ");
		b= ler.nextDouble();

		soma = (a+b);

		sub = (a-b);

		multi = (a*b);

		div = (a/b);

		System.out.println("Resultado da soma: " + soma);
		System.out.println("Resultado da sub: " + sub);
		System.out.println("Resultado da multi: " + multi);
		System.out.println("REsultado da div: " + div);





	}




}
