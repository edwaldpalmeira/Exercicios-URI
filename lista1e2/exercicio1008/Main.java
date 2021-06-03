package exercicio1008;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int numeroF, horas;
		double valorHoras, salario;
		
		Scanner sc = new Scanner(System.in);
		numeroF = sc.nextInt();
		horas = sc.nextInt();
		valorHoras = sc.nextDouble();

		salario = horas*valorHoras;
		
		System.out.println("NUMBER = " +numeroF);
		System.out.printf("SALARY = U$ %.2f\n", salario);
	}

}
