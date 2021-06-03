package exercicio1142;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for(int i=1; i <= n*4; i+=4){
			System.out.print(i + " ");
			System.out.print(i + 1 + " ");
			System.out.print(i + 2 + " ");
			System.out.println("PUM");
		}
    }
}
