package exercicio1036;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double a, b, c, r1, r2;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		if((a==0) | (b*b - 4*a*c < 0)){
			System.out.println("Impossivel calcular");
		}else {
			r1 = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
			r2 = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);
			System.out.printf("R1 = %.5f\n", r1);
			System.out.printf("R2 = %.5f\n", r2);
		}
	}
}
