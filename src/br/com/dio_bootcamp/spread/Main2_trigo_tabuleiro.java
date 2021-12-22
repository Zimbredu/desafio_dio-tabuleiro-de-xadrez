package br.com.dio_bootcamp.spread;

import java.util.Scanner;

public class Main2_trigo_tabuleiro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int soma = ((int) Math.pow(2, x)/12);

			if (soma < 1000) {
				
				System.out.println(   soma = 0 );

			} else
				
				System.out.println( soma);

		}
		sc.close();
	}

}
