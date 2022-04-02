package Chapter3.반복문;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = 0;
		int B = scan.nextInt();
		for(int i = 1; i <=B; i++) {
			for(int j = 1; j <= (1+A); j++) {
			System.out.print("*");
			}A++;
			System.out.println();
		}
		
		scan.close();
	}

}
