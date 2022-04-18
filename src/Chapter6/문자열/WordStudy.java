package Chapter6.문자열;

import java.util.Scanner;

public class WordStudy {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[26];
		String A = scan.next();
		
		for(int i = 0; i < A.length(); i++) {
			
			if('A' <= A.charAt(i) && A.charAt(i) <= 'Z') {
				arr[A.charAt(i) - 'A']++;
			}
			else {
				arr[A.charAt(i) -'a']++;
			}
		}
		int max = -1;
		char ch = '?';
		
		for(int i = 0; i < 26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i+65);
			}
			else if(arr[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
		
		scan.close();
		
	}

}
