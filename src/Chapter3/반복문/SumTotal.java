package Chapter3.반복문;

import java.util.Scanner;

public class SumTotal {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		int A = scan.nextInt();
		int B = 0;
		for(int i = 1; i<=A; i++) {
			B=B+i;
		}System.out.println(B);
		
		scan.close();
	}

}
