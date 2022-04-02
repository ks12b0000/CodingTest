package Chapter4_1차원배열;

import java.util.Scanner;

public class NumCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int value = (scan.nextInt()*scan.nextInt()*scan.nextInt());
		String str = Integer.toString(value);
		
		for(int i = 0; i < 10; i++) {
			int count = 0;            
			for(int j = 0; j < str.length(); j++) {
				if((str.charAt(j)-'0') == i) {
					count++;
				}
			}System.out.println(count);
		}
		
		scan.close();
	}

}
