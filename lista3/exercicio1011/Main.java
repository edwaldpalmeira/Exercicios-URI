package exercicio1011;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		float raio;
		Double pi = 3.14159, volume;
		
		Scanner sc = new Scanner(System.in);
		raio = sc.nextFloat();
		
		volume = (4/3.0) * pi * raio*raio*raio;
		System.out.printf("VOLUME = %.3f\n",volume);
	}

}
