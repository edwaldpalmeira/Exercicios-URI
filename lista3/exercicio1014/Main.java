package exercicio1014;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int distanciaTotal; 
		Double totalCombustivel, consumoMedio;
		
		Scanner sc = new Scanner(System.in);
		distanciaTotal = sc.nextInt();
		totalCombustivel = sc.nextDouble();
		
		consumoMedio = distanciaTotal / totalCombustivel;
		System.out.printf("%.3f km/l\n", consumoMedio);	
	}
}
