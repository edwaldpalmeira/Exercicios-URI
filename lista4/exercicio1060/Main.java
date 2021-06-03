package exercicio1060;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int cont = 0;

		Scanner sc = new Scanner(System.in);

		for (int i=0; i < 6; i++) {
			double numero = sc.nextDouble();
			if (numero > 0) cont++;
		}
		
		System.out.println(cont + " valores positivos");
	}
}
