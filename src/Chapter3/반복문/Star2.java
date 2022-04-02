package Chapter3.반복문;

import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int B = scan.nextInt();
		for(int i = 1; i <=B; i++) {
			for(int d = 1; d <= (B-i); d++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
		
		scan.close();
	}

}
