package Chapter6.문자열;

import java.util.Scanner;

public class StringRepetition {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int T = scan.nextInt();
	for(int i = 0; i < T; i++) {

		int R = scan.nextInt();
		String S = scan.next();	// nextLine() 을 쓰면 error!
		
		for(int j = 0; j < S.length(); j++) {           
			for(int k = 0; k < R; k++) {	// R 만큼 반복 출력
				System.out.print(S.charAt(j));
			}
		}
        
		System.out.println();
	}
	scan.close();

}
}
