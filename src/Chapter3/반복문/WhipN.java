package Chapter3.반복문;

import java.util.Scanner;

public class WhipN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		
		for(int i=A; i > 0; i--) {
			System.out.println(i);
		}
		
		scan.close();
	}

}
