package Chapter1.입출력과사칙연산;

import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		System.out.printf("%d\n%d\n%d\n%d\n%d",A+B,A-B,A*B,A/B,A%B);
		
		scan.close();

	}

}
