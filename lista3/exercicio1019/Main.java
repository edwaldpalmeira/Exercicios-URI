package exercicio1019;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n, horas, minutos, segundos;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		segundos = (n % 3600) % 60;
		minutos = (n % 3600) / 60;
		horas = n / 3600;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);

	}

}
