package Chapter6.문자열;

import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		int[] arr = new int[26];
		// int형 배열 arr를 26개 선언한다.
		
		for(int i = 0; i < arr.length; i++) {
		// for 문을 선언한다.
			arr[i] = -1;
		}
		// 배열 arr[i]에 -1 값이 저장되게 된다.
 
		String str = scan.nextLine();
		// String str를 선언하고 문자열을 입력받아 저장한다
 
		for(int i = 0; i < str.length(); i++) {
		// for문을 선언하고 0~<str.length() 범위까지 반복한다.
			char ch = str.charAt(i);
			/* 문자형 변수 ch를 선언하고 str.char(0)부터 str.char(str.length()-1)까지
			문자열의 문자들을 한글자씩 저장한다. */
    
			if(arr[ch - 'a'] == -1) {
			// arr[ch = 'a' 값이 -1일때 괄호안의 문장을 실행한다.
				arr[ch - 'a'] = i;
				/* ex) arr[c - 'a'] = 0 -> arr[2] = 0
				arr[e - 'a'] = 1 -> arr[4] -> 1 */
			}
		}
 
		for(int val : arr) {
			System.out.print(val + " ");
		}
		// 배열의 값을 한칸씩 띄워서 출력한다.
	}
}



