package exercicio1016;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int distanciaKM, minutos;
		
		Scanner sc = new Scanner(System.in);
		distanciaKM = sc.nextInt();
		
		minutos = distanciaKM * 2;
		
		System.out.println(minutos + " minutos");

	}

}
