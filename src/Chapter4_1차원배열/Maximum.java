package Chapter4_1차원배열;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int count = 0;
		int max = 0;
		
		
		for(int i = 1; i <= 9; i++) {
			int A = scan.nextInt();
			
			if(A > max) {
				max = A;
				count = i;
			}
		}
		System.out.println(max);
		System.out.println(count);
		
		scan.close();
	}

}
