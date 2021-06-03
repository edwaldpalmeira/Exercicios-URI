package exercicio1017;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int tempo, velocidadeMedia, distancia;
		Double litros;
		
		Scanner sc = new Scanner(System.in);
		tempo = sc.nextInt();
		velocidadeMedia = sc.nextInt();
		
		distancia = tempo * velocidadeMedia;
		litros = distancia / 12.0;
		System.out.printf("%.3f\n", litros);
	}
}
