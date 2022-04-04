package Chapter6.문자열;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		String B = scan.next();
		int sum = 0;
		for(int i = 0; i < A; i++) {
			sum += B.charAt(i)-'0';
		}System.out.println(sum);
		
		
		scan.close();
		
	}

}
