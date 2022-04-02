package Chapter4_1차원배열;

import java.util.Scanner;

public class OXQuiz {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		String arr[] = new String[scan.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.next();
		}
		
			for(int i = 0; i < arr.length; i++) {
				int cnt = 0;
				int sum = 0;
			for(int j = 0; j < arr[i].length(); j++) {
				if(arr[i].charAt(j)=='O') {
					cnt++;
				}else {
					cnt = 0;
				}
				sum += cnt;
			
			
		}System.out.println(sum);
		
		scan.close();
	}

}
}
