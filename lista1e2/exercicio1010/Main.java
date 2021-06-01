package exercicio1010;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int codigo1, numeroP1, codigo2, numeroP2;
		Double valorUnitario1, valorUnitario2, total;
		
		Scanner sc = new Scanner(System.in);
		codigo1 = sc.nextInt();
		numeroP1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
		codigo2 = sc.nextInt();
		numeroP2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
		
		total = (numeroP1*valorUnitario1) + (numeroP2*valorUnitario2);
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

	}

}
