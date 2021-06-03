package exercicio1020;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int idade, ano, mes, dias;
		
		Scanner sc = new Scanner (System.in);
		idade = sc.nextInt();
		
		ano = idade / 365;
		mes = (idade % 365) / 30;
		dias = (idade % 365) % 30;
		
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dias + " dia(s)");

	}

}
