package Chapter6.문자열;

import java.util.Scanner;

public class Constant {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B= Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		System.out.println(A > B ? A : B);
		
		scan.close();
		
	}

}
