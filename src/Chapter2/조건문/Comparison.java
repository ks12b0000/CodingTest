package Chapter2.조건문;

import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		if(A > B) {
			System.out.println(">");
		}if(A < B) {
			System.out.println("<");
		}if(A == B) {
			System.out.println("==");
		}else
			
			scan.close();

	}

}
