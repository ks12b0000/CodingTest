package Chapter4_1차원배열;

import java.util.Scanner;

public class Average2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		
		for(int i = 0; i < A; i++) {
			int B = scan.nextInt();
			int[] arr = new int[B];
			double sum = 0;
			
			for(int j = 0; j < B; j++) {
				int val = scan.nextInt();
				arr[j] = val;
				sum += val;
			}
			double mean = sum/B;
			double count = 0;
			
			for(int j = 0; j < B; j++) {
				if(arr[j] > mean) {
					count++;
			}
			}System.out.printf("%.3f%%\n",(count/B)*100);
			
			
		}
		
		
		
		
		
		scan.close();
	}

}
