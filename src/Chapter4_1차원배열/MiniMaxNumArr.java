package Chapter4_1차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxNumArr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int[] A1 = new int[A];
		
		for(int i = 0; i < A; i++) {
			A1[i] = scan.nextInt();
		}
		Arrays.sort(A1);
		System.out.println(A1[0]+" "+A1[A-1]);
		
		scan.close();
	}

}
