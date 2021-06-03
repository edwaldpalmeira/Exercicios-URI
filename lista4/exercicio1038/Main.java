package exercicio1038;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int codigo, quantidade;
		Double preco, total;
		
		Scanner sc = new Scanner(System.in);
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		if(codigo == 1) {
			preco = 4.00;
		}else if(codigo == 2){
			preco = 4.50;
		}else if(codigo == 3){
			preco = 5.00;
		}else if(codigo == 4){
			preco = 2.00;
		}else{
			preco = 1.50;
		}
		
		total = preco * quantidade;
		
		System.out.printf("Total: R$ %.2f\n", total);
	}
}
