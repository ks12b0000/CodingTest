package Chapter3.반복문;

import java.util.Scanner;

public class PlusCycle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		
		int cnt = 0;
		int copy = A;
		
		while(true) {
			A=((A%10)*10)+(((A/10)+(A%10))%10);
			cnt++;
			
			if(copy == A) {
				break;
			}
		}
		System.out.println(cnt);
		
		scan.close();
	}

}
