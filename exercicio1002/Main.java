package exercicio1002;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double raio;
		double area;
		double n=3.14159;
		
		Scanner sc = new Scanner(System.in);
		raio = sc.nextDouble();
		area = raio * raio * n;
		
		System.out.printf("A=%.4f\n", area);
		
	}

}
