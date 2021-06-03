package exercicio1009;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String nome;
		Double salarioF, vendas, total;
		
		Scanner sc = new Scanner (System.in);
		nome = sc.nextLine();
		salarioF = sc.nextDouble();
		vendas = sc.nextDouble();
		
		total = (vendas*15/100) + salarioF;
		System.out.printf("TOTAL = R$ %.2f\n",total);		
	}

}
