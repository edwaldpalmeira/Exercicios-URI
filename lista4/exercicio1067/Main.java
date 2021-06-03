package exercicio1067;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int x;
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();

		for (int i=1; i<=x; i+=2) {
			System.out.println(i);
		}
    }
}
