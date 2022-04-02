package Chapter3.반복문;

import java.util.Scanner;

public class APlusB2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		for(int i = 1; i <= A; i++) {
			int B = scan.nextInt();
			int C = scan.nextInt();
			System.out.println("Case #"+i+ ": "+ B+" + "+C+" = "+(B+C)  );
		}
		
		scan.close();
	}

}
