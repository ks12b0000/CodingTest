package Chapter1.입출력과사칙연산;

import java.util.Scanner;

public class ADivisionB {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		
		System.out.println(A / B);
		
		scan.close();

	}

}
