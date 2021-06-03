package exercicio1012;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		float a, b, c;
		float triangulo, circulo, trapezio, quadrado, retangulo;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		triangulo = (a*c)/2;
		circulo = (float) ((c*c) * 3.14159);
		trapezio = (a+b) * c / 2;
		quadrado = b*b;
		retangulo = a*b;
		System.out.printf("TRIANGULO: %.3f\n", triangulo);
		System.out.printf("CIRCULO: %.3f\n", circulo);
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		System.out.printf("RETANGULO: %.3f\n", retangulo);
	}

}
