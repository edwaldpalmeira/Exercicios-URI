package exercicio1078;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		int n;
	    
		Scanner sc = new Scanner(System.in);
	    	
		n = sc.nextInt();

		for(int i=1; i<=10; i++){
			System.out.println(i + " x " + n + " = " + i * n);
		}
	}
}

