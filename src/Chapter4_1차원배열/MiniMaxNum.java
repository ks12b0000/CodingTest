package Chapter4_1차원배열;

import java.util.Scanner;

public class MiniMaxNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int size = scan.nextInt();
		int min = scan.nextInt();
		int max= min;
		
		for(int i = 1; i < size; i++) {
			int num = scan.nextInt();
			min = Math.min(min, num);
			max= Math.max(max, num);
			
		}
		System.out.printf("%d %d",min, max);
		
		scan.close();
	}

}
