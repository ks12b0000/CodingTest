package Chapter3.반복문;

import java.util.Scanner;

public class XSmallNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		for(int i=1; i<=A; i++) {
			int C = scan.nextInt();
			if(C < B) {
				System.out.print(C+" ");		
			}
		}
		
		scan.close();
	}

}
