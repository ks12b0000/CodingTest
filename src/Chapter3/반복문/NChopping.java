package Chapter3.반복문;

import java.util.Scanner;

public class NChopping {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		
		for(int i=1; i <= A; i++)
			System.out.println(i);
		
		scan.close();
	}

}
