package exercicio1018;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int n, valor;
		int nota100 = 100;
		int nota50 = 50;
		int nota20 = 20;
		int nota10 = 10;
		int nota5 = 5;
		int nota2 = 2;
		int nota1 = 1;

		Scanner sc = new Scanner (System.in);
		n = sc.nextInt();

		valor = n;

		nota100 = n/100;
		n %= 100;

		nota50 = n/50;
		n %= 50;
		
		nota20 = n/20;
		n %= 20;
		
		nota10 = n/10;
		n %= 10;
		
		nota5 = n/5;
		n %= 5;
		
		nota2 = n/2;
		n %= 2;
		
		nota1 = n/1;
		n %= 1;
		
		System.out.println(valor);
		System.out.println(nota100 + " nota(s) de R$ 100,00");
		System.out.println(nota50 + " nota(s) de R$ 50,00");
		System.out.println(nota20 + " nota(s) de R$ 20,00");
		System.out.println(nota10 + " nota(s) de R$ 10,00");
		System.out.println(nota5 + " nota(s) de R$ 5,00");
		System.out.println(nota2 + " nota(s) de R$ 2,00");
		System.out.println(nota1 + " nota(s) de R$ 1,00");
	}			
}
